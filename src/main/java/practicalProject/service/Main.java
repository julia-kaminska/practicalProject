package practicalProject.service;

import practicalProject.DatabaseConfig.HibernateUtil;
import practicalProject.model.Account;
import practicalProject.model.UserAccount;
import practicalProject.service.AccountCreator;

import javax.persistence.EntityManager;

public class Main {
    public static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();
    public static void main(String[] args) {
        em.getTransaction().begin();

        Account ac = new Account();
        ac.createAccount();
        em.persist(ac);

        em.getTransaction().commit();
        HibernateUtil.shutdown();


    }
}
