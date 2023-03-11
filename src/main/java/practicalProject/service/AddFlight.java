package practicalProject.service;

import practicalProject.DatabaseConfig.HibernateUtil;
import practicalProject.model.Flight;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class AddFlight extends Flight {

    public static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();


    public static void addFlight() {

        while (true) {
            System.out.println("Do  want to add flight. 1/ Y. 2/ N");
            Scanner input2 = new Scanner(System.in);
            Integer choice2 = input2.nextInt();
            if (choice2 == 2) {
                break;
            }
            
            em.getTransaction().begin();
            var eneteredValue = new Scanner(System.in);
            System.out.println("Enter plane model.");
            String planeModel = eneteredValue.next();
            System.out.println("Enter departure airport");
            String departureAirport = eneteredValue.next();
            System.out.println("Enter arrival airport.");
            String arrivalAirport = eneteredValue.next();
            System.out.println("Enter departure time");
            Integer departureTime = Integer.valueOf(eneteredValue.next());
            System.out.println("Enter arrival time.");
            Integer arrivalTime = Integer.valueOf(eneteredValue.next());
            System.out.println("Enter flight number.");
            String flightNumber = String.valueOf(eneteredValue.next());

            var lot = new Flight(planeModel, departureAirport, arrivalAirport,
                    departureTime, arrivalTime, flightNumber);
            em.persist(lot);
            System.out.println(lot);
            em.getTransaction().commit();

        }

    }


}





