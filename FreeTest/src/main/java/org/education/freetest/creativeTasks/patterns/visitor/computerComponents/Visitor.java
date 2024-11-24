package org.education.freetest.creativeTasks.patterns.visitor.computerComponents;

public interface Visitor {
    void visitCPU(Cpu cpu);
    void visitHDD(Hdd hdd);
    void visitRAM(Ram ram);
}
