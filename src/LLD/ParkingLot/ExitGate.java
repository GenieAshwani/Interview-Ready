package LLD.ParkingLot;

class ExitGate {
    private ParkingLot parkingLot;

    public ExitGate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    // Method to allow a vehicle to exit the parking lot
    public void allowExit(Vehicle vehicle) {
        parkingLot.exitVehicle(vehicle);
    }
}
