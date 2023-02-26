package practicalProject.model;

import javax.persistence.*;

@Entity
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column( name = "User ID")
    private int user_ID;

    @Column ( name = "Ticket_ID")
    private int ticket_ID;

    public int getId(){return id;}

    public void setId(int id ){
        this.id = id;
    }
   public int getUser_ID(){
       return user_ID;
    }

    public void setUser_ID(int user_ID){
       this.user_ID = user_ID;
    }

    public int getTicketID(){
       return ticket_ID;
    }

    public void setTicket_ID( int ticket_ID) {
       this.ticket_ID = ticket_ID;
   }

   public UserAccount (int user_ID, int ticket_ID, int id){
        this.id = id;
       this.user_ID = user_ID;
       this.ticket_ID = ticket_ID;
   }



}
