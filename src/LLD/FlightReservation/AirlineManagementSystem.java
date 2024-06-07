package LLD.FlightReservation;

import java.util.ArrayList;
import java.util.List;

public class AirlineManagementSystem {
    private List<Flight> flights;
    private List<Passenger> passengers;
    private List<CrewMember> crewMembers;
    private List<Aircraft> aircrafts;

    public AirlineManagementSystem() {
        this.flights = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.crewMembers = new ArrayList<>();
        this.aircrafts = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public void addCrewMember(CrewMember crewMember) {
        crewMembers.add(crewMember);
    }

    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    // Other necessary methods...

    public List<Flight> getFlights() {
        return flights;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public List<CrewMember> getCrewMembers() {
        return crewMembers;
    }

    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }
}
