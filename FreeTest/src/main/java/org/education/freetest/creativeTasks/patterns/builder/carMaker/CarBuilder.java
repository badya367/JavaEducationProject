package org.education.freetest.creativeTasks.patterns.builder.carMaker;

import org.education.freetest.creativeTasks.patterns.builder.carMaker.classesForCarParametrs.*;
import org.education.freetest.creativeTasks.patterns.builder.computerMaker.Computer;

import java.util.ArrayList;
import java.util.List;

public class CarBuilder {
    private Brand brand;
    private Color color;
    private EngineType engineType;
    private GearBoxType gearBoxType;
    private NumberOfDoors numberOfDoors;
    private List<AdditionalOptions> additionalOptionsList = new ArrayList<>();

    public CarBuilder(Brand brand) {
        this.brand = brand;
    }

    public CarBuilder color(Color color){
        this.color = color;
        return this;
    }

    public CarBuilder engineType(EngineType engineType){
        this.engineType = engineType;
        return this;
    }

    public CarBuilder gearBoxType(GearBoxType gearBoxType){
        this.gearBoxType = gearBoxType;
        return this;
    }

    public CarBuilder numbersOfDoors(NumberOfDoors numberOfDoors){
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public CarBuilder additionalOptionsList (AdditionalOptions additionalOptions){
        this.additionalOptionsList.add(additionalOptions);
        return this;
    }

    public Car build(){
        if (brand == null) {
            throw new IllegalStateException("Brand is a required field and cannot be null");
        }
        return new Car(this);
    }

    public Brand getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public GearBoxType getGearBoxType() {
        return gearBoxType;
    }

    public NumberOfDoors getNumberOfDoors() {
        return numberOfDoors;
    }

    public List<AdditionalOptions> getAdditionalOptionsList() {
        return additionalOptionsList;
    }
}
