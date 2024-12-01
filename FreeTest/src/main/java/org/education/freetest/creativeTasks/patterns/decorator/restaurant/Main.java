package org.education.freetest.creativeTasks.patterns.decorator.restaurant;

public class Main {
    public static void main(String[] args) {
        Dish basicBurger = new BasicDish("Бургер", 100);
        System.out.println(basicBurger.getDescription() + " стоит " + basicBurger.getCost());

        Dish standardBurger = new SauceDecorator(new CheeseDecorator(new BasicDish("Бургер", 100)));
        System.out.println(standardBurger.getDescription() + " стоит " + standardBurger.getCost());

        Dish bigBurger = new DoublePortionDishDecorator(new SauceDecorator(new CheeseDecorator(new BasicDish("Бургер", 100))));
        System.out.println(bigBurger.getDescription() + " стоит " + bigBurger.getCost());

        Dish massiveBurger = new DoublePortionDishDecorator(
                new DoublePortionDishDecorator(
                        new SauceDecorator(
                                new CheeseDecorator(
                                        new BasicDish("Бургер", 100)))));
        System.out.println(massiveBurger.getDescription() + " стоит " + massiveBurger.getCost());
    }
}
