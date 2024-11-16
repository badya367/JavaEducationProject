package org.education.freetest.creativeTasks.patterns.adapter.testExample;

public class ElectricCarAdapter implements GasCar{
    private ElectricCar electricCar;

    public ElectricCarAdapter(ElectricCar electricCar) {
        this.electricCar = electricCar;
    }

    @Override
    public void fillTank() {
        System.out.println("Включился адаптер");
        electricCar.chargeBattery();
    }
}
