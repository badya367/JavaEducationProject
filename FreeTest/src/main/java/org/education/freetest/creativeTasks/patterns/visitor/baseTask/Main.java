package org.education.freetest.creativeTasks.patterns.visitor.baseTask;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4,7));
        shapes.add(new Square(3));

        Visitor areaCalculator = new AreaCalculator();
        Visitor shapePrinter = new ShapePrinter();

        System.out.println("=== Печать информации ===");
        for(Shape shape: shapes){
            shape.accept(shapePrinter);
        }

        System.out.println("\n=== Расчёт площадей ===");
        for (Shape shape: shapes){
            shape.accept(areaCalculator);
        }
    }
}
