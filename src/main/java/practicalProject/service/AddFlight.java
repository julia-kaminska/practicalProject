package practicalProject.service;

import practicalProject.DatabaseConfig.HibernateUtil;
import practicalProject.model.Flight;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class AddFlight extends Flight {

    public static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();

    public static void addFlight() {



        em.getTransaction().begin();
        System.out.println("Do you want to add flight? 1 - yes /2 - no ");
        Scanner input = new Scanner(System.in);
        Integer choice = input.nextInt();
        if (choice == 1){
            var eneteredValue = new Scanner(System.in);
            System.out.println("Enter plane model.");
            String planeModel = eneteredValue.next();
            System.out.println("Entet departure airport");
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

            em.persist(lot);
            em.getTransaction().commit();
        } else if (choice == 2) {
            System.out.println("Thank you!");
        }
        else{
            System.out.println("Choose the right number");
        }



    }


}


