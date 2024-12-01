package org.education.freetest.creativeTasks.patterns.decorator.restaurant;

public class BasicDish implements Dish {
    private String dishName;
    private double dishCost;

    public BasicDish(String dishName, double dishCost) {
        this.dishName = dishName;
        this.dishCost = dishCost;
    }


    @Override
    public String getDescription() {
        return getDishName();
    }

    @Override
    public double getCost() {
        return getDishCost();
    }

    public String getDishName() {
        return dishName;
    }

    public double getDishCost() {
        return dishCost;
    }
}
