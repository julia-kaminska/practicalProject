package practicalProject.service;

import practicalProject.DatabaseConfig.HibernateUtil;
import practicalProject.model.Flight;

import javax.persistence.*;
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

        em.getTransaction().begin();
        if (departureAirport.equals(Flight.em.contains(departureAirport))){
            if (arrivalAirport.equals(Flight.em.contains(arrivalAirport)))
            {
                System.out.println(Flight.em.toString());
            }
        }



    }

}
