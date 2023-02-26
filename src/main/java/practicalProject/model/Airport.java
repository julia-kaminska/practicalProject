package practicalProject.model;

import javax.persistence.*;

@Entity
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column (name = "airport_name")
    private String airportName;

    @Column (name = "country")
    private String country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Airport(int id, String airportName, String country) {
        this.id = id;
        this.airportName = airportName;
        this.country = country;
    }

    public Airport(String airportName, String country) {
        this.airportName = airportName;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id=" + id +
                ", airportName='" + airportName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }



//    @OneToOne
//    @JoinColumn (name = "arrival_airport")
//    private Flight flight;

//    @OneToOne (mappedBy = "departure_airport")
//    private Flight departureFlight;
}
