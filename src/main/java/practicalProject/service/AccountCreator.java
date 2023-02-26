package practicalProject.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import practicalProject.DatabaseConfig.HibernateUtil;
import practicalProject.model.Account;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AccountCreator {

    private static final Map<String, Account> accounts = new HashMap<>();

    private static void createAccount() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println("Create an account");
        System.out.println("Email address: ");
        Scanner input = new Scanner(System.in);
        String email = input.next();
        System.out.println("create your password: ");
        Scanner input2 = new Scanner(System.in);
        String password = input2.next();

        Account account = new Account(email, password);
        transaction.commit();
        session.close();

    }

}
