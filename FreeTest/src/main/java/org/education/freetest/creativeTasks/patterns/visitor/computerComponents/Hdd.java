package org.education.freetest.creativeTasks.patterns.visitor.computerComponents;

public class Hdd implements Component{
    private double value;

    public Hdd(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitHDD(this);
    }
}
