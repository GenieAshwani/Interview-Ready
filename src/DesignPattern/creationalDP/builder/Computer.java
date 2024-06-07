package DesignPattern.creationalDP.builder;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;

    private boolean hasGraphicCard;
    private boolean hasBluetooth;
    private boolean hasWifi;

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public boolean isHasGraphicCard() {
        return hasGraphicCard;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", hasGraphicCard=" + hasGraphicCard +
                ", hasBluetooth=" + hasBluetooth +
                ", hasWifi=" + hasWifi +
                '}';
    }

    Computer(ComputerBuilder computerBuilder)
    {
        this.cpu=computerBuilder.cpu;
        this.ram=computerBuilder.ram;
        this.storage=computerBuilder.storage;
        this.hasBluetooth=computerBuilder.hasBluetooth;
        this.hasGraphicCard=computerBuilder.hasGraphicCard;
        this.hasWifi=computerBuilder.hasWifi;

    }

    public static class ComputerBuilder{
        private String cpu;
        private String ram;
        private String storage;

        private boolean hasGraphicCard;
        private boolean hasBluetooth;
        private boolean hasWifi;

        public ComputerBuilder(String cpu,String ram,String storage)
        {
            this.cpu=cpu;
            this.ram=ram;
            this.storage=storage;
        }

        public ComputerBuilder setGraphicCard(boolean isGraphicCard)
        {
            this.hasGraphicCard=isGraphicCard;
            return this;
        }
        public ComputerBuilder setBluetooth(boolean isBluetooth)
        {
            this.hasBluetooth=isBluetooth;
            return this;
        }
        public ComputerBuilder setWifi(boolean isWifi)
        {
            this.hasWifi=isWifi;
            return this;
        }

        public Computer build()
        {
            return new Computer(this);
        }
    }


}
