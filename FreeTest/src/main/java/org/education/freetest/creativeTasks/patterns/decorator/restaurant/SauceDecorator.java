package org.education.freetest.creativeTasks.patterns.decorator.restaurant;

public class SauceDecorator extends DishDecorator{
    public SauceDecorator(Dish dish) {
        super(dish);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", с соусом";
    }

    @Override
    public double getCost() {
        return super.getCost() + 10;
    }
}
