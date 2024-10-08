package org.education.freetest.creativeTasks.patterns.builder.pizzaMaker;

import org.education.freetest.creativeTasks.patterns.builder.pizzaMaker.EnumClassForPizzaParameters.*;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private Size size;
    private Dough dough;
    private Sauce sauce;
    private Cheese cheese;
    private List<Topping> toppings;

    private Pizza(PizzaBuilder pizzaBuilder) {
        this.size = pizzaBuilder.size;
        this.dough = pizzaBuilder.dough;
        this.sauce = pizzaBuilder.sauce;
        this.cheese = pizzaBuilder.cheese;
        this.toppings = pizzaBuilder.toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", toping=" + toppings +
                '}';
    }


    public static class PizzaBuilder{
        private final Size size;
        private Dough dough;
        private Sauce sauce;
        private Cheese cheese;
        private List<Topping> toppings = new ArrayList<>();


        public PizzaBuilder(Size size){
            this.size = size;
        }

        public PizzaBuilder dough(Dough dough){
            this.dough = dough;
            return this;
        }

        public PizzaBuilder sauce(Sauce sauce){
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder cheese(Cheese cheese){
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder toping(Topping topping){
            this.toppings.add(topping);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
