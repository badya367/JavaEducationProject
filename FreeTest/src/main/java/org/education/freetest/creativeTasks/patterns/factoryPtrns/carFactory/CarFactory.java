package org.education.freetest.creativeTasks.patterns.factoryPtrns.carFactory;

public class CarFactory extends TransportFactory{
    @Override
    public Transport createTransport() {
        return new Car();
    }
}
