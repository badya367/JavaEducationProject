package org.education.freetest.creativeTasks.patterns.factoryPtrns.carFactory;

public class Motocycle implements Transport {
    private final String engineType = "Gasoline";
    private final double engine = 1.0;


    @Override
    public void drive() {
        System.out.println("Мотоцикл поехал");
    }

    @Override
    public String toString() {
        return "Motocycle{" +
                "engineType='" + engineType + '\'' +
                ", engine=" + engine +
                '}';
    }

    public String getEngineType() {
        return engineType;
    }

    public double getEngine() {
        return engine;
    }
}
