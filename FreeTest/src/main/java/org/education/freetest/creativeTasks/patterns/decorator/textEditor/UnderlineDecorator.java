package org.education.freetest.creativeTasks.patterns.decorator.textEditor;

public class UnderlineDecorator extends TextDecorator{
    public UnderlineDecorator(Text text) {
        super(text);
    }

    @Override
    public String display() {
        return "<u>" + super.display() +"</u>";
    }
}
