package org.education.freetest.creativeTasks.patterns.factoryPtrns.carFactory;

public class Main {
    public static void main(String[] args) {
        TransportFactory carFacctory = new CarFactory();
        Transport car = carFacctory.createTransport();
        System.out.println(car);
        car.drive();

        TransportFactory truckFactory = new TruckFactory();
        Transport truck = truckFactory.createTransport();
        System.out.println(truck);
        truck.drive();

        TransportFactory motocycleFactory = new MotocycleFactory();
        Transport moto = motocycleFactory.createTransport();
        System.out.println(moto);
        moto.drive();
    }
}
