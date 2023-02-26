package practicalProject.model;

import javax.persistence.*;

@Entity
public class Account {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "email")
    private final String email;

    @Column (name = "password")
    private final String password;

    public Account(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
