package org.education.freetest.creativeTasks.patterns.decorator.coffeeShop;

public class SugarDecorator extends BeverageDecorator{
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", с сахаром";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.5;
    }
}
