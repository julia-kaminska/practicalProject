package practicalProject.model;

import javax.persistence.*;
@Entity
public class Ticket {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column
        private int id;

        @Column (name = "plane_number")
        private Integer planeNumber;

        @Column (name = "name")
        private String name;

        @Column (name = "surname")
        private String surname;

        @Column (name = "passport_number")
        private String passportNumber;

        @Column (name = "ticket_price")
        private String ticketPrice;

        @Column (name = "plane_model")
        private String planeModel;

        @Column (name = "seat_number")
        private Integer seatNumber;

        @Column (name = "additional luggage")
        @Enumerated (EnumType.STRING)
        private LuggageSize additionalLuggage;

        @Column (name = "seat_type")
        private String seatType;

        @Column (name = "priority_boarding")
        private Boolean priorityBoarding;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Integer getPlaneNumber() {
            return planeNumber;
        }

        public void setPlaneNumber(Integer planeNumber) {
            this.planeNumber = planeNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getPassportNumber() {
            return passportNumber;
        }

        public void setPassportNumber(String passportNumber) {
            this.passportNumber = passportNumber;
        }

        public String getTicketPrice() {
            return ticketPrice;
        }

        public void setTicketPrice(String ticketPrice) {
            this.ticketPrice = ticketPrice;
        }

        public String getPlaneModel() {
            return planeModel;
        }

        public void setPlaneModel(String planeModel) {
            this.planeModel = planeModel;
        }

        public Integer getSeatNumber() {
            return seatNumber;
        }

        public void setSeatNumber(Integer seatNumber) {
            this.seatNumber = seatNumber;
        }

        public LuggageSize getAdditionalLuggage() {
            return additionalLuggage;
        }

        public void setAdditionalLuggage(LuggageSize additionalLuggage) {
            this.additionalLuggage = additionalLuggage;
        }

        public String getSeatType() {
            return seatType;
        }

        public void setSeatType(String seatType) {
            this.seatType = seatType;
        }

        public Boolean getPriorityBoarding() {
            return priorityBoarding;
        }

        public void setPriorityBoarding(Boolean priorityBoarding) {
            this.priorityBoarding = priorityBoarding;
        }

        public Ticket(Integer planeNumber, String name, String surname, String passportNumber, String ticketPrice, String planeModel, Integer seatNumber, LuggageSize additionalLuggage, String seatType, Boolean priorityBoarding) {
            this.planeNumber = planeNumber;
            this.name = name;
            this.surname = surname;
            this.passportNumber = passportNumber;
            this.ticketPrice = ticketPrice;
            this.planeModel = planeModel;
            this.seatNumber = seatNumber;
            this.additionalLuggage = additionalLuggage;
            this.seatType = seatType;
            this.priorityBoarding = priorityBoarding;
        }

        @Override
        public String toString() {
            return "Ticket{" +
                    "id=" + id +
                    ", planeNumber=" + planeNumber +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", passportNumber='" + passportNumber + '\'' +
                    ", ticketPrice='" + ticketPrice + '\'' +
                    ", planeModel='" + planeModel + '\'' +
                    ", seatNumber=" + seatNumber +
                    ", additionalLuggage='" + additionalLuggage + '\'' +
                    ", seatType='" + seatType + '\'' +
                    ", priorityBoarding=" + priorityBoarding +
                    '}';
        }

        @ManyToOne
        @JoinColumn (name = "flight_number")
        private Flight flight;
    }
