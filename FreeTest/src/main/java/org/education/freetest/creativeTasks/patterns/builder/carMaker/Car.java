package org.education.freetest.creativeTasks.patterns.builder.carMaker;

import org.education.freetest.creativeTasks.patterns.builder.carMaker.classesForCarParametrs.*;

import java.util.List;

public class Car {
    private Brand brand;
    private Color color;
    private EngineType engineType;
    private GearBoxType gearBoxType;
    private NumberOfDoors numberOfDoors;
    private List<AdditionalOptions> additionalOptionsList;

    public Car(CarBuilder carBuilder){
        this.brand = carBuilder.getBrand();
        this.color = carBuilder.getColor();
        this.engineType = carBuilder.getEngineType();
        this.gearBoxType = carBuilder.getGearBoxType();
        this.numberOfDoors = carBuilder.getNumberOfDoors();
        this.additionalOptionsList = carBuilder.getAdditionalOptionsList();
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", color=" + color +
                ", engineType=" + engineType +
                ", gearBoxType=" + gearBoxType +
                ", numberOfDoors=" + numberOfDoors +
                ", additionalOptionsList=" + additionalOptionsList +
                '}';
    }
}
