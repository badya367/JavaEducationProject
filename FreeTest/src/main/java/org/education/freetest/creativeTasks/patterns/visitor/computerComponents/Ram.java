package org.education.freetest.creativeTasks.patterns.visitor.computerComponents;

public class Ram implements Component{
    private int value;

    public Ram(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRAM(this);
    }
}
