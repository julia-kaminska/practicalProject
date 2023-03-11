package practicalProject.service;

import practicalProject.DatabaseConfig.HibernateUtil;

import javax.persistence.EntityManager;

public class Main {
    public static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();

    public static void main(String[] args) {


        AccountCreator ac = new AccountCreator();
        ac.createAccount();


        AddFlight flightadder = new AddFlight();
        flightadder.addFlight();



        SearchFlight sf = new SearchFlight();
        sf.searchEngine();




        LoginService loginService = new LoginService();
        HibernateUtil.shutdown();


    }
}
