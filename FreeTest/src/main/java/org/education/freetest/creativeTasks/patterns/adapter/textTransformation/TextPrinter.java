package org.education.freetest.creativeTasks.patterns.adapter.textTransformation;

public class TextPrinter {
    String text;

    public TextPrinter(String text) {
        this.text = text;
    }

    public String printText(){
        System.out.println("Печатаю текст: " + text);
        return text;
    }

    public String getText() {
        return text;
    }
}
