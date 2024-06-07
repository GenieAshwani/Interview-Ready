package LLD.FlightReservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Flight {
    private String flightNumber;
    private Aircraft aircraft;
    private Date departureTime;
    private String origin;
    private String destination;
    private List<Passenger> passengers;
    private List<CrewMember> crewMembers;

    public Flight(String flightNumber, Aircraft aircraft, Date departureTime, String origin, String destination) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.departureTime = departureTime;
        this.origin = origin;
        this.destination = destination;
        this.passengers = new ArrayList<>();
        this.crewMembers = new ArrayList<>();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public List<CrewMember> getCrewMembers() {
        return crewMembers;
    }

    public void setCrewMembers(List<CrewMember> crewMembers) {
        this.crewMembers = crewMembers;
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public void addCrewMember(CrewMember crewMember) {
        crewMembers.add(crewMember);
    }

    public int getAvailableSeats() {
        return aircraft.getTotalSeats() - passengers.size();
    }

    public boolean bookSeat(Passenger passenger) {
        if (getAvailableSeats() > 0) {
            passengers.add(passenger);
            return true;
        }
        return false;
    }
}
