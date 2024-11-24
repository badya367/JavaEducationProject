package org.education.freetest.creativeTasks.patterns.visitor.baseTask;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }
}
