package practicalProject.service;

import practicalProject.DatabaseConfig.HibernateUtil;

import javax.persistence.EntityManager;

public class BuyTicket {

    public static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();

    public void ticket(){



    }

}
