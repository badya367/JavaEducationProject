package org.education.freetest.creativeTasks.patterns.visitor.zoo;

public class Elephant implements Animal{
    private double weight;

    public Elephant(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElephant(this);
    }
}
