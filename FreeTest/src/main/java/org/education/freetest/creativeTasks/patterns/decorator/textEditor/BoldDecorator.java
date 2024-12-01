package org.education.freetest.creativeTasks.patterns.decorator.textEditor;

public class BoldDecorator extends TextDecorator{
    public BoldDecorator(Text text) {
        super(text);
    }

    @Override
    public String display() {
        return "<b>" + super.display() + "</b>";
    }
}
