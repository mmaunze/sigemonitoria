
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
import sigemonitoria.modelo.Hospital;
import sigemonitoria.modelo.Utilizador;

/**
 *
 * @author Meldo Maunze
 */
public class HospitalJpaController implements Serializable {

    private EntityManagerFactory emf = null;
    public HospitalJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Hospital hospital) {
        if (hospital.getUtilizadorList() == null) {
            hospital.setUtilizadorList(new ArrayList<Utilizador>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Utilizador> attachedUtilizadorList = new ArrayList<Utilizador>();
            for (Utilizador utilizadorListUtilizadorToAttach : hospital.getUtilizadorList()) {
                utilizadorListUtilizadorToAttach = em.getReference(utilizadorListUtilizadorToAttach.getClass(), utilizadorListUtilizadorToAttach.getId());
                attachedUtilizadorList.add(utilizadorListUtilizadorToAttach);
            }
            hospital.setUtilizadorList(attachedUtilizadorList);
            em.persist(hospital);
            for (Utilizador utilizadorListUtilizador : hospital.getUtilizadorList()) {
                Hospital oldHospitalOfUtilizadorListUtilizador = utilizadorListUtilizador.getHospital();
                utilizadorListUtilizador.setHospital(hospital);
                utilizadorListUtilizador = em.merge(utilizadorListUtilizador);
                if (oldHospitalOfUtilizadorListUtilizador != null) {
                    oldHospitalOfUtilizadorListUtilizador.getUtilizadorList().remove(utilizadorListUtilizador);
                    oldHospitalOfUtilizadorListUtilizador = em.merge(oldHospitalOfUtilizadorListUtilizador);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Hospital hospital) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Hospital persistentHospital = em.find(Hospital.class, hospital.getId());
            List<Utilizador> utilizadorListOld = persistentHospital.getUtilizadorList();
            List<Utilizador> utilizadorListNew = hospital.getUtilizadorList();
            List<String> illegalOrphanMessages = null;
            for (Utilizador utilizadorListOldUtilizador : utilizadorListOld) {
                if (!utilizadorListNew.contains(utilizadorListOldUtilizador)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Utilizador " + utilizadorListOldUtilizador + " since its hospital field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            List<Utilizador> attachedUtilizadorListNew = new ArrayList<Utilizador>();
            for (Utilizador utilizadorListNewUtilizadorToAttach : utilizadorListNew) {
                utilizadorListNewUtilizadorToAttach = em.getReference(utilizadorListNewUtilizadorToAttach.getClass(), utilizadorListNewUtilizadorToAttach.getId());
                attachedUtilizadorListNew.add(utilizadorListNewUtilizadorToAttach);
            }
            utilizadorListNew = attachedUtilizadorListNew;
            hospital.setUtilizadorList(utilizadorListNew);
            hospital = em.merge(hospital);
            for (Utilizador utilizadorListNewUtilizador : utilizadorListNew) {
                if (!utilizadorListOld.contains(utilizadorListNewUtilizador)) {
                    Hospital oldHospitalOfUtilizadorListNewUtilizador = utilizadorListNewUtilizador.getHospital();
                    utilizadorListNewUtilizador.setHospital(hospital);
                    utilizadorListNewUtilizador = em.merge(utilizadorListNewUtilizador);
                    if (oldHospitalOfUtilizadorListNewUtilizador != null && !oldHospitalOfUtilizadorListNewUtilizador.equals(hospital)) {
                        oldHospitalOfUtilizadorListNewUtilizador.getUtilizadorList().remove(utilizadorListNewUtilizador);
                        oldHospitalOfUtilizadorListNewUtilizador = em.merge(oldHospitalOfUtilizadorListNewUtilizador);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Short id = hospital.getId();
                if (findHospital(id) == null) {
                    throw new NonexistentEntityException("The hospital with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Short id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Hospital hospital;
            try {
                hospital = em.getReference(Hospital.class, id);
                hospital.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The hospital with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Utilizador> utilizadorListOrphanCheck = hospital.getUtilizadorList();
            for (Utilizador utilizadorListOrphanCheckUtilizador : utilizadorListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Hospital (" + hospital + ") cannot be destroyed since the Utilizador " + utilizadorListOrphanCheckUtilizador + " in its utilizadorList field has a non-nullable hospital field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(hospital);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Hospital> findHospitalEntities() {
        return findHospitalEntities(true, -1, -1);
    }

    public List<Hospital> findHospitalEntities(int maxResults, int firstResult) {
        return findHospitalEntities(false, maxResults, firstResult);
    }

    private List<Hospital> findHospitalEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Hospital.class));
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

    public Hospital findHospital(Short id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Hospital.class, id);
        } finally {
            em.close();
        }
    }

    public int getHospitalCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Hospital> rt = cq.from(Hospital.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Number) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
