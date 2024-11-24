package org.education.freetest.creativeTasks.patterns.visitor.computerComponents;

public class PerformanceEvaluator implements Visitor{
    private double value = 0;
    @Override
    public void visitCPU(Cpu cpu) {
        value += cpu.getClockFrequency() * 10;
    }

    @Override
    public void visitHDD(Hdd hdd) {
        value += hdd.getValue() * 5;
    }

    @Override
    public void visitRAM(Ram ram) {
        value += ram.getValue() * 8;
    }

    public double getValue() {
        return value;
    }
}
