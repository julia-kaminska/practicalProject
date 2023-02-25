package practicalProject;

import org.hibernate.Session;
import org.hibernate.Transaction;
import practicalProject.DatabaseConfig.HibernateUtil;

import javax.persistence.EntityManager;

public class TicketService {
    public static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();
    public static void main(String[] args) {

        Session session = (Session) HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();



    }

}
