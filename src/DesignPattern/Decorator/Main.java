package DesignPattern.Decorator;

public class Main {
    public static void main(String[] args) {
        // Create a simple coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: " + coffee.getCost() + ", Description: " + coffee.getDescription());

        // Add milk to the coffee
        coffee = new Milk(coffee);
        System.out.println("Cost: " + coffee.getCost() + ", Description: " + coffee.getDescription());

        // Add sugar to the coffee
        coffee = new Sugar(coffee);
        System.out.println("Cost: " + coffee.getCost() + ", Description: " + coffee.getDescription());
    }
}