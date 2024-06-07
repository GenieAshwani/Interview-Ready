package LLD.FlightReservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirlineReservationSystem {
    public static void main(String[] args) {
        // Create aircraft
        Aircraft aircraft1 = new Aircraft("REG001", "Boeing 737", 150);
        Aircraft aircraft2 = new Aircraft("REG002", "Airbus A320", 180);

        // Create flights
        Flight flight1 = new Flight("FL001", aircraft1, new Date(), "JFK", "LAX");
        Flight flight2 = new Flight("FL002", aircraft2, new Date(), "LAX", "JFK");

        // Add crew members
        CrewMember pilot1 = new CrewMember("Captain Ram", "EMP001", Role.PILOT);
        CrewMember pilot2 = new CrewMember("First Officer Laxman", "EMP002", Role.CO_PILOT);
        CrewMember cabinCrew1 = new CrewMember("Sriya", "EMP003", Role.CABIN_CREW);

        flight1.addCrewMember(pilot1);
        flight1.addCrewMember(pilot2);
        flight1.addCrewMember(cabinCrew1);

        // Create airline reservation system
        AirlineReservationSystem airlineReservationSystem = new AirlineReservationSystem();

        // Add flights and crew members to the system
        airlineReservationSystem.addFlight(flight1);
        airlineReservationSystem.addFlight(flight2);
        airlineReservationSystem.addCrewMember(pilot1);
        airlineReservationSystem.addCrewMember(pilot2);
        airlineReservationSystem.addCrewMember(cabinCrew1);

        // Search and book flights
        String origin = "JFK";
        String destination = "LAX";
        Date departureDate = new Date(); // Current date

        List<Flight> availableFlights = airlineReservationSystem.searchFlights(origin, destination, departureDate);
        if (!availableFlights.isEmpty()) {
            Flight selectedFlight = availableFlights.get(0); // Assuming the first available flight is selected
            if (selectedFlight.getAvailableSeats() > 0) {
                // Book a seat
                Passenger passenger = new Passenger("Kapil", "AB123456");
                if (selectedFlight.bookSeat(passenger)) {
                    selectedFlight.addPassenger(passenger);
                    System.out.println("Seat booked successfully for passenger " + passenger.getName());
                } else {
                    System.out.println("Failed to book seat. Please try again later.");
                }
            } else {
                System.out.println("No available seats on selected flight.");
            }
        } else {
            System.out.println("No flights available for the selected route and date.");
        }
    }

    // Methods for airline reservation system
    private List<Flight> flights;
    private List<CrewMember> crewMembers;

    public AirlineReservationSystem() {
        this.flights = new ArrayList<>();
        this.crewMembers = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void addCrewMember(CrewMember crewMember) {
        crewMembers.add(crewMember);
    }

    public List<Flight> searchFlights(String origin, String destination, Date departureDate) {
        // Implement flight search logic based on origin, destination, and departure date
        // Return a list of available flights meeting the search criteria
        // This method can be more sophisticated with database integration and filtering logic
        List<Flight> availableFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getOrigin().equals(origin) && flight.getDestination().equals(destination) && flight.getDepartureTime().equals(departureDate)) {
                availableFlights.add(flight);
            }
        }
        return availableFlights;
    }
}
