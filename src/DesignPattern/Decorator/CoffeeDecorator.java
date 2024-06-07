package DesignPattern.Decorator;

abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.coffee = decoratedCoffee;
    }

    public double getCost() {
        return coffee.getCost();
    }

    public String getDescription() {
        return coffee.getDescription();
    }
}
