package practicalProject.model;

import javax.persistence.*;

@Entity
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column(name = "user_id")
    private int userId;

    @Column(name = "ticket_id")
    private int ticketId;

    @Column(name= "wallet_id")
    private float walletId;

    public float getWalletId() {
        return walletId;
    }

    public void setWalletId(float walletId) {
        this.walletId = walletId;
    }

    public UserAccount(int userId, int ticketId, int id, float walletId) {
        this.id = id;
        this.userId = userId;
        this.ticketId = ticketId;
        this.walletId = walletId;
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = id;
    }

    public int getUser_ID() {
        return userId;
    }

    public void setUser_ID(int User_ID) {
        this.userId = userId;
    }

    public int getTicketID() {
        return ticketId;
    }

    public void setTicket_ID(int ticket_ID) {
        this.ticketId = ticketId;}

    @Override
    public String toString() {
        return "UserAccount{" +
                "id=" + id +
                ", userId=" + userId +
                ", ticketId=" + ticketId +
                ", walletId=" + walletId +
                '}';
    }
}
