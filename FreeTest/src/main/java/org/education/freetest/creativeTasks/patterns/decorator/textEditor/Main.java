package org.education.freetest.creativeTasks.patterns.decorator.textEditor;

public class Main {
    public static void main(String[] args) {
        Text text = new ColorDecorator(new BoldDecorator(new SimpleText("Привет, мир!")), "red");
        System.out.println(text.display());

        Text text2 = new ColorDecorator(new UnderlineDecorator(new BoldDecorator(new SimpleText("Привет, мир!"))), "red");
        System.out.println(text2.display());
    }
}
