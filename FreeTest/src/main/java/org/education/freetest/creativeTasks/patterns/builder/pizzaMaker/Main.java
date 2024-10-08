package org.education.freetest.creativeTasks.patterns.builder.pizzaMaker;

import org.education.freetest.creativeTasks.patterns.builder.pizzaMaker.EnumClassForPizzaParameters.*;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder(Size.SMALL)
                .dough(Dough.THIN)
                .sauce(Sauce.TOMATO)
                .cheese(Cheese.CHEDDAR)
                .toping(Topping.PEPPERONI)
                .toping(Topping.MUSHROOMS)
                .build();

        System.out.println(pizza);
    }
}
