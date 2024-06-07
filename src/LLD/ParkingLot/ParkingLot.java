package LLD.ParkingLot;

import java.util.HashMap;
import java.util.Map;

class ParkingLot {
    private int capacity;
    private Map<String, Integer> parkedVehicles; // <Plate number, Slot number>
    private int nextSlot;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.parkedVehicles = new HashMap<>();
        this.nextSlot = 1;
    }

    // Method to park a vehicle
    public void parkVehicle(Vehicle vehicle) {
        if (parkedVehicles.size() < capacity) {
            parkedVehicles.put(vehicle.getPlateNumber(), nextSlot);
            System.out.println("Vehicle with plate number " + vehicle.getPlateNumber() +
                    " parked successfully at slot number " + nextSlot);
            nextSlot++;
        } else {
            System.out.println("Parking lot is full. Cannot park vehicle with plate number " +
                    vehicle.getPlateNumber());
        }
    }

    // Method to exit a vehicle
    public void exitVehicle(Vehicle vehicle) {
        if (parkedVehicles.containsKey(vehicle.getPlateNumber())) {
            int slotNumber = parkedVehicles.remove(vehicle.getPlateNumber());
            System.out.println("Vehicle with plate number " + vehicle.getPlateNumber() +
                    " exited successfully from slot number " + slotNumber);
        } else {
            System.out.println("Vehicle with plate number " + vehicle.getPlateNumber() +
                    " not found in the parking lot.");
        }
    }

    // Method to find a vehicle by plate number
    public void findVehicle(String plateNumber) {
        if (parkedVehicles.containsKey(plateNumber)) {
            int slotNumber = parkedVehicles.get(plateNumber);
            System.out.println("Vehicle with plate number " + plateNumber +
                    " is parked at slot number " + slotNumber);
        } else {
            System.out.println("Vehicle with plate number " + plateNumber +
                    " is not found in the parking lot.");
        }
    }
}
