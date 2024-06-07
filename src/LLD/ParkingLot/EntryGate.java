package LLD.ParkingLot;

class EntryGate {
    private ParkingLot parkingLot;

    public EntryGate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    // Method to allow a vehicle to enter the parking lot
    public void allowEntry(Vehicle vehicle) {
        parkingLot.parkVehicle(vehicle);
    }
}