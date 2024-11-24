package org.education.freetest.creativeTasks.patterns.visitor.baseTask;

public class AreaCalculator implements Visitor{
    @Override
    public void visitCircle(Circle circle) {
        double area = Math.PI * Math.pow(circle.getRadius(), 2);
        System.out.println("Площадь круга: " + area );
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        double area = rectangle.getHeight() * rectangle.getWidth();
        System.out.println("Площадь прямоугольника: " + area);
    }

    @Override
    public void visitSquare(Square square) {
        double area = Math.pow(square.getSide(), 2);
        System.out.println("Площадь квадрата: " + area);
    }
}
