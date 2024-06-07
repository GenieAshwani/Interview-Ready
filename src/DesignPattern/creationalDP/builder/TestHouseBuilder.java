package DesignPattern.creationalDP.builder;

public class TestHouseBuilder {
    public static void main(String[] args) {

        House house = new House.HouseBuilder("Villa", 2)
                .hasGarage(true)
                //.hasGarden(true)
                .build();

        // Outputting House details
        System.out.println("House Type: " + house.getType());
        System.out.println("Floors: " + house.getFloors());
        System.out.println("Has Garage: " + house.hasGarage());
        System.out.println("Has Garden: " + house.hasGarden());
    }
}
