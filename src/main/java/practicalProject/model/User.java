package practicalProject.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column (name = "user_id")
    private int userId;

    @Column (name = "email")
    private String userEmail;

    @Column (name = "password")
    private String userPassword;

    @Column (name = "role")
    private String userRole;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public User(int id, int userId, String userEmail, String userPassword, String userRole) {
        this.id = id;
        this.userId = userId;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userRole = userRole;
    }
}
