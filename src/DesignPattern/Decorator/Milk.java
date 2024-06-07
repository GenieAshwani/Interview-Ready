package DesignPattern.Decorator;

class Milk extends CoffeeDecorator {
    public Milk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double getCost() {
        return super.getCost() + 0.5; // Add $0.5 for milk
    }

    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}
