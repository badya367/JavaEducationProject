package org.education.freetest.creativeTasks.patterns.visitor.zoo;

public class Tiger implements Animal{
    private double speed;

    public Tiger(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTiger(this);
    }
}
