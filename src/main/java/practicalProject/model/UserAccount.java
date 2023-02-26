package practicalProject.model;

import javax.persistence.*;

@Entity
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int Id;
    @Column( name = "user_id")
    private int User_ID;

    @Column ( name = "ticket_id")
    private int Ticket_ID;

    public int getId(){return Id;}

    public void setId(int Id ){
        this.Id = Id;
    }
   public int getUser_ID(){
       return User_ID;
    }

    public void setUser_ID(int User_ID){
       this.User_ID = User_ID;
    }

    public int getTicketID(){
       return Ticket_ID;
    }

    public void setTicket_ID( int ticket_ID) {
       this.Ticket_ID = ticket_ID;
   }

   public UserAccount (int user_ID, int ticket_ID, int id){
        this.Id = Id;
       this.User_ID = User_ID;
       this.Ticket_ID = Ticket_ID;
   }



}
