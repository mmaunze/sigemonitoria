
package sigemonitoria.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import sigemonitoria.controller.exceptions.IllegalOrphanException;
import sigemonitoria.controller.exceptions.NonexistentEntityException;
import sigemonitoria.controller.exceptions.PreexistingEntityException;
import sigemonitoria.modelo.Caso;
import sigemonitoria.modelo.Doente;

/**
 *
 * @author Meldo Maunze
 */
public class DoenteJpaController implements Serializable {

    private EntityManagerFactory emf = null;
    public DoenteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Doente doente) throws PreexistingEntityException, Exception {
        if (doente.getCasoList() == null) {
            doente.setCasoList(new ArrayList<Caso>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Caso> attachedCasoList = new ArrayList<Caso>();
            for (Caso casoListCasoToAttach : doente.getCasoList()) {
                casoListCasoToAttach = em.getReference(casoListCasoToAttach.getClass(), casoListCasoToAttach.getId());
                attachedCasoList.add(casoListCasoToAttach);
            }
            doente.setCasoList(attachedCasoList);
            em.persist(doente);
            for (Caso casoListCaso : doente.getCasoList()) {
                Doente oldNidOfCasoListCaso = casoListCaso.getNid();
                casoListCaso.setNid(doente);
                casoListCaso = em.merge(casoListCaso);
                if (oldNidOfCasoListCaso != null) {
                    oldNidOfCasoListCaso.getCasoList().remove(casoListCaso);
                    oldNidOfCasoListCaso = em.merge(oldNidOfCasoListCaso);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findDoente(doente.getNid()) != null) {
                throw new PreexistingEntityException("Doente " + doente + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Doente doente) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Doente persistentDoente = em.find(Doente.class, doente.getNid());
            List<Caso> casoListOld = persistentDoente.getCasoList();
            List<Caso> casoListNew = doente.getCasoList();
            List<String> illegalOrphanMessages = null;
            for (Caso casoListOldCaso : casoListOld) {
                if (!casoListNew.contains(casoListOldCaso)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Caso " + casoListOldCaso + " since its nid field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            List<Caso> attachedCasoListNew = new ArrayList<Caso>();
            for (Caso casoListNewCasoToAttach : casoListNew) {
                casoListNewCasoToAttach = em.getReference(casoListNewCasoToAttach.getClass(), casoListNewCasoToAttach.getId());
                attachedCasoListNew.add(casoListNewCasoToAttach);
            }
            casoListNew = attachedCasoListNew;
            doente.setCasoList(casoListNew);
            doente = em.merge(doente);
            for (Caso casoListNewCaso : casoListNew) {
                if (!casoListOld.contains(casoListNewCaso)) {
                    Doente oldNidOfCasoListNewCaso = casoListNewCaso.getNid();
                    casoListNewCaso.setNid(doente);
                    casoListNewCaso = em.merge(casoListNewCaso);
                    if (oldNidOfCasoListNewCaso != null && !oldNidOfCasoListNewCaso.equals(doente)) {
                        oldNidOfCasoListNewCaso.getCasoList().remove(casoListNewCaso);
                        oldNidOfCasoListNewCaso = em.merge(oldNidOfCasoListNewCaso);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = doente.getNid();
                if (findDoente(id) == null) {
                    throw new NonexistentEntityException("The doente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Doente doente;
            try {
                doente = em.getReference(Doente.class, id);
                doente.getNid();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The doente with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Caso> casoListOrphanCheck = doente.getCasoList();
            for (Caso casoListOrphanCheckCaso : casoListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Doente (" + doente + ") cannot be destroyed since the Caso " + casoListOrphanCheckCaso + " in its casoList field has a non-nullable nid field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(doente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Doente> findDoenteEntities() {
        return findDoenteEntities(true, -1, -1);
    }

    public List<Doente> findDoenteEntities(int maxResults, int firstResult) {
        return findDoenteEntities(false, maxResults, firstResult);
    }

    private List<Doente> findDoenteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Doente.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Doente findDoente(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Doente.class, id);
        } finally {
            em.close();
        }
    }

    public int getDoenteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Doente> rt = cq.from(Doente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Number) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
