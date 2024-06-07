package DesignPattern.creationalDP.builder;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer=new Computer.ComputerBuilder("intel","16GB","500GB")
                .setGraphicCard(true)
                .setWifi(true)
                .setWifi(true)
                .build();
        System.out.println(computer);
    }
}
