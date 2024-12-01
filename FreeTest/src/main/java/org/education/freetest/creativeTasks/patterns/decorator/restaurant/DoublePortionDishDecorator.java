package org.education.freetest.creativeTasks.patterns.decorator.restaurant;

public class DoublePortionDishDecorator extends DishDecorator{
    public DoublePortionDishDecorator(Dish dish) {
        super(dish);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", двойная порция";
    }

    @Override
    public double getCost() {
        return super.getCost() * 2;
    }
}
