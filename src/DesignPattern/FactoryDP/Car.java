package DesignPattern.FactoryDP;

public class Car extends Vehicle{
    private Car()
    {

    }
    public Car(String name,int seatingCap)
    {
        this.name = name;
        this.seatingCap = seatingCap;
    }

    @Override
    int getSeatingCapacity() {
        return this.seatingCap;
    }

    @Override
    String getDiscription() {
        return this.name;
    }
}