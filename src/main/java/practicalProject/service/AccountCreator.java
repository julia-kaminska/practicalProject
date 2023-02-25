package practicalProject.service;

import practicalProject.model.Account;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AccountCreator {
    private static final Map<String, Account> accounts = new HashMap<>();

    private static void createAccount() {
        System.out.println("Create an account");
        System.out.println("Email address: ");
        Scanner input = new Scanner(System.in);
        String email = input.next();
        System.out.println("create your password: ");
        Scanner input2 = new Scanner(System.in);
        String password = input2.next();

        Account account = new Account(email, password);

    }
}
