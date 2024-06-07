package DesignPattern.creationalDP.builder;

public class House {
    private String type;
    private int floors;
    private boolean hasGarage; // optional
    private boolean hasGarden; // optional

    private House(HouseBuilder builder) {
        type = builder.type;
        floors = builder.floors;
        hasGarage = builder.hasGarage;
        hasGarden = builder.hasGarden;
    }

    public String getType() {
        return type;
    }

    public int getFloors() {
        return floors;
    }

    public boolean hasGarage() {
        return hasGarage;
    }

    public boolean hasGarden() {
        return hasGarden;
    }

    public static class HouseBuilder {
        private String type;
        private int floors;
        private boolean hasGarage; // optional
        private boolean hasGarden; // optional

        // constructor for required fields
        public HouseBuilder(String type, int floors) {
            this.type = type;
            this.floors = floors;
        }

        // setter methods for optional fields
        public HouseBuilder hasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder hasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        // Build the House object
        public House build() {
            return new House(this);
        }
    }
}
