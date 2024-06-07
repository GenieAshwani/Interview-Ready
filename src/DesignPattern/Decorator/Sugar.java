package DesignPattern.Decorator;

class Sugar extends CoffeeDecorator {
    public Sugar(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double getCost() {
        return super.getCost() + 0.2; // Add $0.2 for sugar
    }

    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}
