package practicalProject.service;

import practicalProject.DatabaseConfig.HibernateUtil;
import practicalProject.model.Flight;
import practicalProject.model.Login;

import javax.persistence.*;
import java.util.*;

public class SearchFlight {

    public static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();


    public void searchEngine() {
        System.out.println("Departure airport: ");
        Scanner begining = new Scanner(System.in);
        String departureAirport = begining.nextLine();
        System.out.println("Arrival airport: ");
        Scanner destination = new Scanner(System.in);
        String arrivalAirport = destination.nextLine();

       em.getTransaction().begin();

        List<Flight> flights = em.createQuery("FROM Flight WHERE departureAirport = :departureAirport and arrivalAirport = :arrivalAirport", Flight.class)
                .setParameter("departureAirport", departureAirport)
                .setParameter("arrivalAirport", arrivalAirport)
                .getResultList();
        flights.forEach(System.out::println);

        



        em.getTransaction().commit();


    }
    public void buyTicket(){


    }
}



