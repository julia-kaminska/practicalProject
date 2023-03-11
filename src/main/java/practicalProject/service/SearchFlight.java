package practicalProject.service;

import practicalProject.DatabaseConfig.HibernateUtil;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class SearchFlight {

    public static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();

    public void searchEngine() {
        System.out.println("Departure airport: ");
        Scanner begining = new Scanner(System.in);
        String departureAirport = begining.nextLine();
        System.out.println("Arrival airport: ");
        Scanner destination = new Scanner(System.in);
        String arrivalAirport = destination.nextLine();


        System.out.println("We have this flights: ");



    }

}
