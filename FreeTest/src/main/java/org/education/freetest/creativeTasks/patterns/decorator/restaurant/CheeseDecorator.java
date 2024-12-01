package org.education.freetest.creativeTasks.patterns.decorator.restaurant;

public class CheeseDecorator extends DishDecorator{
    public CheeseDecorator(Dish dish) {
        super(dish);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", с сыром";
    }

    @Override
    public double getCost() {
        return super.getCost() + 20;
    }
}
