package LLD.FlightReservation;

public class Aircraft {
    private String registrationNumber;
    private String model;
    private int totalSeats;

    public Aircraft(String registrationNumber, String model, int totalSeats) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.totalSeats = totalSeats;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }
}
