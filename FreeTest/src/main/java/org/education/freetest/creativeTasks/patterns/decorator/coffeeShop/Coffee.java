package org.education.freetest.creativeTasks.patterns.decorator.coffeeShop;

public class Coffee implements Beverage{
    @Override
    public String getDescription() {
        return "Кофе";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
