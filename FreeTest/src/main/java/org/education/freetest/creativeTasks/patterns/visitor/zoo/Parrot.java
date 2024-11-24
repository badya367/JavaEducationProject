package org.education.freetest.creativeTasks.patterns.visitor.zoo;

public class Parrot implements Animal{
    private boolean isSpeak;

    public Parrot(boolean isSpeak) {
        this.isSpeak = isSpeak;
    }

    public boolean isSpeak() {
        return isSpeak;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParrot(this);
    }
}
