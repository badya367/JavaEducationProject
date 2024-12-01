package org.education.freetest.creativeTasks.patterns.decorator.textEditor;

public class ColorDecorator extends TextDecorator{
    private String color;
    public ColorDecorator(Text text, String color) {
        super(text);
        this.color = color;
    }

    @Override
    public String display() {
        return "<span style='color: " + getColor() + "'>" + super.display() + "</span>";
    }

    public String getColor() {
        return color;
    }
}
