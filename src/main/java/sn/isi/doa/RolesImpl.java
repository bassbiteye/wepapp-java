package sn.isi.doa;

import sn.isi.entities.Roles;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class RolesImpl implements IRoles{

    private EntityManager em;

    public RolesImpl() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("webjpa");
        em=emf.createEntityManager();
    }
    @Override
    public int add(Roles roles) {
        try {
            em.getTransaction().begin();
            em.persist(roles);
            em.getTransaction().commit();
            return 1;

        }catch (Exception e){
            e.printStackTrace();
            return 0;

        }
    }

    @Override
    public List<Roles> list(Roles roles) {
        return null;
    }


}
