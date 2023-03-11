package practicalProject.service;

import practicalProject.DatabaseConfig.HibernateUtil;
import practicalProject.model.Flight;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class AddFlight extends Flight {

    public static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();

    public static void addFlight() {
//        Scanner finishAdding = new Scanner(System.in);
//        Scanner addFlightScanner = new Scanner(System.in);
//        System.out.println("Do u want add flight? 1 - yes /2 - no ");
//        addFlightScanner.next();
//        Scanner addFlightsFinish = new Scanner(System.in);


        em.getTransaction().begin();
        var eneteredValue = new Scanner(System.in);
        System.out.println("Enter plane model.");
        String planeModel = eneteredValue.next();
        System.out.println("Entet deparure airport");
        String departureAirport = eneteredValue.next();
        System.out.println("Enter arrival airport.");
        String arrivalAirport = eneteredValue.next();
        System.out.println("Enter departure time");
        Integer departureTime = Integer.valueOf(eneteredValue.next());
        System.out.println("Enter arrival time.");
        Integer arrivalTime = Integer.valueOf(eneteredValue.next());
        System.out.println("Enter flight number.");
        String flightNumber = String.valueOf(eneteredValue.next());


        Flight lot = new Flight(planeModel, departureAirport, arrivalAirport,
                departureTime, arrivalTime, flightNumber);
        Flight lot2 = new Flight(planeModel, departureAirport, arrivalAirport
                , departureTime, arrivalTime, flightNumber);
        em.persist(lot);
        em.persist(lot2);
        System.out.println(lot);
        System.out.println(lot2);
        em.getTransaction().commit();


    }


}



