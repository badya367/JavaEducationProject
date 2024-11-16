package org.education.freetest.creativeTasks.patterns.factoryPtrns.carFactory;

public class Car implements Transport {
    private final int doorCapacity = 5;
    private final double engine = 3.0;


    @Override
    public void drive() {
        System.out.println("Машина поехала");
    }

    @Override
    public String toString() {
        return "Car{" +
                "doorCapacity=" + doorCapacity +
                ", engine=" + engine +
                '}';
    }

    public int getDoorCapacity() {
        return doorCapacity;
    }

    public double getEngine() {
        return engine;
    }
}
