package org.education.freetest.creativeTasks.patterns.decorator.coffeeShop;

public class SyrupDecorator extends BeverageDecorator{
    public SyrupDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", с сиропом";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 2.0;
    }
}
