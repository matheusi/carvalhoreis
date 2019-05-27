package br.com.pbd.models.dao;

import br.com.pbd.models.beans.Funcionario;
import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


public class FuncionarioDAO implements IcoreFuncionarioDAO, Serializable {

    private EntityManagerFactory emf = null;
    
    public FuncionarioDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    @Override
    public void Salvar(Funcionario funcionario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(funcionario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

}
