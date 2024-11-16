package org.education.freetest.creativeTasks.patterns.factoryPtrns.carFactory;

public class TruckFactory extends TransportFactory{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
