package practicalProject.model;

import javax.persistence.*;
import java.sql.Time;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column (name = "plane_model")
    private String planeModel;

    @Column (name = "departure_airport")
    private String departureAirport;

    @Column (name = "arrival_airport")
    private String arrivalAirport;

    @Column (name = "departure_time")
    private Time departureTime;

    @Column (name = "arrival_time")
    private Time arrivalTime;

    @Column (name = "flight_number")
    private Integer flightNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaneModel() {
        return planeModel;
    }

    public void setPlaneModel(String planeModel) {
        this.planeModel = planeModel;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public Time getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Flight(String planeModel, String departureAirport, String arrivalAirport, Time departureTime, Time arrivalTime, Integer flightNumber) {
        this.planeModel = planeModel;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.flightNumber = flightNumber;
    }

    public Flight(int id, String planeModel, String departureAirport, String arrivalAirport, Time departureTime, Time arrivalTime, Integer flightNumber) {
        this.id = id;
        this.planeModel = planeModel;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", planeModel='" + planeModel + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", flightNumber=" + flightNumber +
                '}';
    }

//    @OneToOne
//    @JoinColumn (name = "plane_model")
//    private Plane plane;

//    @OneToOne (mappedBy = "airportName")
//    private Airport airport;
//
//    @OneToOne
//    @JoinColumn (name = "departure_airport")
//    private Airport airportOfDeparture;

}
