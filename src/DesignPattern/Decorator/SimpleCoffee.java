package DesignPattern.Decorator;

class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 1.0; // $1 for a simple coffee
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}