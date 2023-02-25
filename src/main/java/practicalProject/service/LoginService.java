package practicalProject.service;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import practicalProject.DatabaseConfig.HibernateUtil;
import practicalProject.model.Login;

import java.util.List;


public class LoginService {

    public boolean login (String email, String password){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query q = session.createQuery("FROM Login WHERE email = :email and password = :password", Login.class);
        q.setParameter("email", email);
        q.setParameter("password", password);
        q.getResultList();

        List<Login> loginList = q.list();
        transaction.commit();
        session.close();

        if (loginList.isEmpty()){
            return false;
        }
        Login log = loginList.get(0);
        System.out.println("User: " + log.getEmail() + " is logged in");
        return true;
    }

}
