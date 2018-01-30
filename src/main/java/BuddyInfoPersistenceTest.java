import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class BuddyInfoPersistenceTest {

    public BuddyInfoPersistenceTest(){

    }

    public void performJPA(){
        BuddyInfo buddy1 = new BuddyInfo();
        buddy1.setId(1);
        buddy1.setName("Tom");
        buddy1.setPhoneNumber("613");

        BuddyInfo buddy2 = new BuddyInfo();
        buddy1.setId(2);
        buddy1.setName("Phil");
        buddy1.setPhoneNumber("514");

        // Connecting to the database through EntityManagerFactory
        // connection details loaded from persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("addBook-test");

        EntityManager em = emf.createEntityManager();

        // Creating a new transaction
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        // Persisting the product entity objects
        em.persist(buddy1);
        em.persist(buddy2);

        tx.commit();

        Query q = em.createQuery("SELECT p FROM BuddyInfo p");
        List<BuddyInfo> results = q.getResultList();
        for(BuddyInfo b : results){
            System.out.println(b.toString());
        }

        em.close();
        emf.close();
    }


}
