package org.education.freetest.creativeTasks.patterns.decorator.coffeeShop;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription() + " стоит " + coffee.getCost() + " y.e");

        Beverage milkCoffee = new MilkDecorator(new Coffee());
        System.out.println(milkCoffee.getDescription() + " стоит " + milkCoffee.getCost() + " y.e");

        Beverage milkSugarCoffee = new SugarDecorator(new MilkDecorator(new Coffee()));
        System.out.println(milkSugarCoffee.getDescription() + " стоит " + milkSugarCoffee.getCost() + " y.e");

        Beverage deluxeCoffee = new SyrupDecorator(new SugarDecorator(new MilkDecorator(new Coffee())));
        System.out.println(deluxeCoffee.getDescription() + " стоит " + deluxeCoffee.getCost() + " y.e");
    }
}
