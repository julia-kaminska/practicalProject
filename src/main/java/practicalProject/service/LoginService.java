package practicalProject.service;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import practicalProject.DatabaseConfig.HibernateUtil;
import practicalProject.model.Flight;
import practicalProject.model.Login;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LoginService {
    public static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();

    public void login (String email, String password) {
        em.getTransaction().begin();
        System.out.println("Log in");
        System.out.println("Email address: ");
        Scanner input = new Scanner(System.in);
        String email2 = input.next();
        System.out.println("Password: ");
        Scanner input2 = new Scanner(System.in);
        String password2 = input2.next();


        em.createQuery("FROM Login WHERE email = :email and password = :password", Login.class)
                .setParameter("email", email)
                .setParameter("password", password)
                .getResultList();



        em.getTransaction().commit();

        if (email.equals(email2) && password.equals(password2)) {
            System.out.println("User: " + email + " is logged in");
        } else {
            System.out.println("Try one more time");

        }

    }
}
