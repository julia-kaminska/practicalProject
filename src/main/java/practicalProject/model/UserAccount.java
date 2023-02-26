package practicalProject.model;

import javax.persistence.*;

@Entity
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column( name = "user_id")
    private int userId;

    @Column ( name = "ticket_id")
    private int ticketId;

    public int getId(){return id;}

    public void setId(int Id ){
        this.id = id;
    }
   public int getUser_ID(){
       return userId;
    }

    public void setUser_ID(int User_ID){
       this.userId = userId;
    }

    public int getTicketID(){
       return ticketId;
    }

    public void setTicket_ID( int ticket_ID) {
       this.ticketId = ticketId;
   }

   public UserAccount (int userId, int ticketId, int id){
        this.id = id;
       this.userId = userId;
       this.ticketId = ticketId;
   }



}
