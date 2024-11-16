package org.education.freetest.creativeTasks.patterns.adapter.testExample;

public class Car implements GasCar{
    @Override
    public void fillTank() {
        System.out.println("Машина заправляется");
    }
}
