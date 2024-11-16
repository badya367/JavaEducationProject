package org.education.freetest.creativeTasks.patterns.factoryPtrns.carFactory;

public class Truck implements Transport{
    private final int carryingCapacity = 3500;
    private final double engine = 8.0;
    @Override
    public void drive() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "carryingCapacity=" + carryingCapacity +
                ", engine=" + engine +
                '}';
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public double getEngine() {
        return engine;
    }
}
