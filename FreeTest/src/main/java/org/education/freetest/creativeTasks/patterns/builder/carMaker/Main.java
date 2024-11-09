package org.education.freetest.creativeTasks.patterns.builder.carMaker;

import org.education.freetest.creativeTasks.patterns.builder.carMaker.classesForCarParametrs.*;

public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder(Brand.MITSUBISHI)
                .color(Color.BLACK)
                .engineType(EngineType.PETROL)
                .gearBoxType(GearBoxType.MANUAL)
                .numbersOfDoors(NumberOfDoors.FIVE)
                .additionalOptionsList(AdditionalOptions.CLIMATE_CONTROL)
                .additionalOptionsList(AdditionalOptions.LEATHER_INTERIOR)
                .build();

        System.out.println(car);

        Car carTest = new CarBuilder(Brand.BMW)
                .build();
        System.out.println(carTest);

        carTest.setColor(Color.RED);
        System.out.println(carTest);
    }
}
