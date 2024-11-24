package org.education.freetest.creativeTasks.patterns.visitor.baseTask;



public interface Visitor {
    void visitCircle(Circle circle);
    void visitRectangle(Rectangle rectangle);
    void visitSquare(Square square);
}
