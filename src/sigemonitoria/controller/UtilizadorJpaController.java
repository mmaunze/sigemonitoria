
package sigemonitoria.controller;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import sigemonitoria.controller.exceptions.NonexistentEntityException;
import sigemonitoria.modelo.Hospital;
import sigemonitoria.modelo.TipoUtilizador;
import sigemonitoria.modelo.Utilizador;

/**
 *
 * @author Meldo Maunze
 */
public class UtilizadorJpaController implements Serializable {

    private EntityManagerFactory emf = null;

    /**
     *
     * @param emf
     */
    public UtilizadorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    /**
     *
     * @return
     */
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    /**
     *
     * @param utilizador
     */
    public void create(Utilizador utilizador) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Hospital hospital = utilizador.getHospital();
            if (hospital != null) {
                hospital = em.getReference(hospital.getClass(), hospital.getId());
                utilizador.setHospital(hospital);
            }
            TipoUtilizador tipoUtilizador = utilizador.getTipoUtilizador();
            if (tipoUtilizador != null) {
                tipoUtilizador = em.getReference(tipoUtilizador.getClass(), tipoUtilizador.getId());
                utilizador.setTipoUtilizador(tipoUtilizador);
            }
            em.persist(utilizador);
            if (hospital != null) {
                hospital.getUtilizadorList().add(utilizador);
                hospital = em.merge(hospital);
            }
            if (tipoUtilizador != null) {
                tipoUtilizador.getUtilizadorList().add(utilizador);
                tipoUtilizador = em.merge(tipoUtilizador);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     *
     * @param utilizador
     * @throws NonexistentEntityException
     * @throws Exception
     */
    public void edit(Utilizador utilizador) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Utilizador persistentUtilizador = em.find(Utilizador.class, utilizador.getId());
            Hospital hospitalOld = persistentUtilizador.getHospital();
            Hospital hospitalNew = utilizador.getHospital();
            TipoUtilizador tipoUtilizadorOld = persistentUtilizador.getTipoUtilizador();
            TipoUtilizador tipoUtilizadorNew = utilizador.getTipoUtilizador();
            if (hospitalNew != null) {
                hospitalNew = em.getReference(hospitalNew.getClass(), hospitalNew.getId());
                utilizador.setHospital(hospitalNew);
            }
            if (tipoUtilizadorNew != null) {
                tipoUtilizadorNew = em.getReference(tipoUtilizadorNew.getClass(), tipoUtilizadorNew.getId());
                utilizador.setTipoUtilizador(tipoUtilizadorNew);
            }
            utilizador = em.merge(utilizador);
            if (hospitalOld != null && !hospitalOld.equals(hospitalNew)) {
                hospitalOld.getUtilizadorList().remove(utilizador);
                hospitalOld = em.merge(hospitalOld);
            }
            if (hospitalNew != null && !hospitalNew.equals(hospitalOld)) {
                hospitalNew.getUtilizadorList().add(utilizador);
                hospitalNew = em.merge(hospitalNew);
            }
            if (tipoUtilizadorOld != null && !tipoUtilizadorOld.equals(tipoUtilizadorNew)) {
                tipoUtilizadorOld.getUtilizadorList().remove(utilizador);
                tipoUtilizadorOld = em.merge(tipoUtilizadorOld);
            }
            if (tipoUtilizadorNew != null && !tipoUtilizadorNew.equals(tipoUtilizadorOld)) {
                tipoUtilizadorNew.getUtilizadorList().add(utilizador);
                tipoUtilizadorNew = em.merge(tipoUtilizadorNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Short id = utilizador.getId();
                if (findUtilizador(id) == null) {
                    throw new NonexistentEntityException("The utilizador with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     *
     * @param id
     * @throws NonexistentEntityException
     */
    public void destroy(Short id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Utilizador utilizador;
            try {
                utilizador = em.getReference(Utilizador.class, id);
                utilizador.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The utilizador with id " + id + " no longer exists.", enfe);
            }
            Hospital hospital = utilizador.getHospital();
            if (hospital != null) {
                hospital.getUtilizadorList().remove(utilizador);
                hospital = em.merge(hospital);
            }
            TipoUtilizador tipoUtilizador = utilizador.getTipoUtilizador();
            if (tipoUtilizador != null) {
                tipoUtilizador.getUtilizadorList().remove(utilizador);
                tipoUtilizador = em.merge(tipoUtilizador);
            }
            em.remove(utilizador);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     *
     * @return
     */
    public List<Utilizador> findUtilizadorEntities() {
        return findUtilizadorEntities(true, -1, -1);
    }

    /**
     *
     * @param maxResults
     * @param firstResult
     * @return
     */
    public List<Utilizador> findUtilizadorEntities(int maxResults, int firstResult) {
        return findUtilizadorEntities(false, maxResults, firstResult);
    }

    private List<Utilizador> findUtilizadorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Utilizador.class));
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

    /**
     *
     * @param id
     * @return
     */
    public Utilizador findUtilizador(Short id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Utilizador.class, id);
        } finally {
            em.close();
        }
    }

    /**
     *
     * @return
     */
    public int getUtilizadorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Utilizador> rt = cq.from(Utilizador.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Number) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
