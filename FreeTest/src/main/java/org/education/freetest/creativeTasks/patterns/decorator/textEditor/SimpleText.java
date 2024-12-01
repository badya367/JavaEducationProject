package org.education.freetest.creativeTasks.patterns.decorator.textEditor;

public class SimpleText implements Text{
    private String text;

    public SimpleText(String text) {
        this.text = text;
    }

    @Override
    public String display() {
        return getText();
    }

    public String getText() {
        return text;
    }
}
