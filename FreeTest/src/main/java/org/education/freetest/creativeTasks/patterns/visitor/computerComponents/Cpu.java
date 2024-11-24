package org.education.freetest.creativeTasks.patterns.visitor.computerComponents;

public class Cpu implements Component{
    private double clockFrequency;

    public Cpu(double clockFrequency) {
        this.clockFrequency = clockFrequency;
    }

    public double getClockFrequency() {
        return clockFrequency;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCPU(this);
    }
}
