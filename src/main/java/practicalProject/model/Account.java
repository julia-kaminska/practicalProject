package practicalProject.model;

import org.hibernate.Session;
import org.hibernate.Transaction;
import practicalProject.DatabaseConfig.HibernateUtil;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@Entity
public class Account {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column(name = "email")
    private String email;

    @Column (name = "password")
    private String password;


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account(String email, String password) {
        this.email = email;
        this.password = password;
    }
    @Override
    public String toString() {
        return "Account{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    private static final Map<String, Account> accounts = new HashMap<>();

    public static void createAccount() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println("Create an account");
        System.out.println("Email address: ");
        Scanner input = new Scanner(System.in);
        String email = input.next();
        System.out.println("create your password: ");
        Scanner input2 = new Scanner(System.in);
        String password = input2.next();
        System.out.println("Account: " + email + "created successfully!");

        Account account = new Account(email, password);
        accounts.put(email,account);
        session.close();

    }
}
