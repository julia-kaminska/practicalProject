package practicalProject.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import practicalProject.DatabaseConfig.HibernateUtil;

import javax.persistence.EntityManager;

public class TicketService {
    public static void main(String[] args) {

    }
    public static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();


        Session session = (Session) HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();



    }

