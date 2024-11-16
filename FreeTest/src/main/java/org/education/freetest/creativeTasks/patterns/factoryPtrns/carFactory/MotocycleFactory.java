package org.education.freetest.creativeTasks.patterns.factoryPtrns.carFactory;

public class MotocycleFactory extends TransportFactory{
    @Override
    public Transport createTransport() {
        return new Motocycle();
    }
}
