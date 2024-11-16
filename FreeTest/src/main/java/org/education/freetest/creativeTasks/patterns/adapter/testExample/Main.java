package org.education.freetest.creativeTasks.patterns.adapter.testExample;

public class Main {
    public static void main(String[] args) {
        GasCar gasCar = new Car();
        gasCar.fillTank();

        GasCar electricCar = new ElectricCarAdapter(new ElectricCar());
        electricCar.fillTank();

        ElectricCar electricCar1 = new ElectricCar();
        electricCar1.chargeBattery();
    }
}
