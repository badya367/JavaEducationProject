package org.education.freetest.creativeTasks.patterns.decorator.textEditor;

public abstract class TextDecorator implements Text{
    protected Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String display() {
        return text.display();
    }
}
