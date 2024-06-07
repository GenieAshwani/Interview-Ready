package DesignPattern.FactoryDP;

public abstract class  Vehicle
{
    String name;
    int seatingCap;
    abstract int getSeatingCapacity();
    abstract String getDiscription();
}