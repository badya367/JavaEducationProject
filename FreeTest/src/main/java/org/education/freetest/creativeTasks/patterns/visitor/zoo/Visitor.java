package org.education.freetest.creativeTasks.patterns.visitor.zoo;

public interface Visitor {
    void visitElephant(Elephant elephant);
    void visitTiger(Tiger tiger);
    void visitParrot(Parrot parrot);

}
