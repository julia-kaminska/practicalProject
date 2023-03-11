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
        AddFlight flightadder2 = new AddFlight();
        flightadder2.addFlight();
        AddFlight flightadder3 = new AddFlight();
        flightadder3.addFlight();




        SearchFlight sf = new SearchFlight();
        sf.searchEngine();


        LoginService loginService = new LoginService();
        HibernateUtil.shutdown();


    }
}
