package practicalProject.service;

import practicalProject.DatabaseConfig.HibernateUtil;
import practicalProject.model.Account;
import practicalProject.model.UserAccount;
import practicalProject.service.AccountCreator;

import javax.persistence.EntityManager;

public class Main {
    public static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();
    public static void main(String[] args) {
      AccountCreator ac = new AccountCreator();
      ac.createAccount();
      LoginService loginService = new LoginService();
      loginService.login("julkam","123");
        HibernateUtil.shutdown();


    }
}
