package LLD.ParkingLot;

public class Main {
    public static void main(String[] args) {
        // Create a parking lot with capacity for 5 vehicles
        ParkingLot parkingLot = new ParkingLot(5);

        // Create entry and exit gates
        EntryGate entryGate = new EntryGate(parkingLot);
        ExitGate exitGate = new ExitGate(parkingLot);

        // Vehicles enter the parking lot
        entryGate.allowEntry(new Vehicle("ABC123", VehicleType.CAR));
        entryGate.allowEntry(new Vehicle("XYZ789", VehicleType.CAR));
        entryGate.allowEntry(new Vehicle("DEF456", VehicleType.MOTORBIKE));

        // Find a vehicle by plate number
        parkingLot.findVehicle("XYZ789");

        // Vehicles exit the parking lot
        exitGate.allowExit(new Vehicle("XYZ789", VehicleType.CAR));
        exitGate.allowExit(new Vehicle("DEF456", VehicleType.MOTORBIKE));
    }
}
