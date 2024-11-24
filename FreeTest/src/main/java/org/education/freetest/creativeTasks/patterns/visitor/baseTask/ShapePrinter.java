package org.education.freetest.creativeTasks.patterns.visitor.baseTask;

public class ShapePrinter implements Visitor{
    @Override
    public void visitCircle(Circle circle) {
        System.out.println("Круг с радиусом: " + circle.getRadius());
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        System.out.println("Прямоугольник с шириной: " + rectangle.getWidth() + " и высотой: " + rectangle.getHeight() );
    }

    @Override
    public void visitSquare(Square square) {
        System.out.println("Квадрат со стороной: " + square.getSide());
    }
}
