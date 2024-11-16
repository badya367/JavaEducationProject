package org.education.freetest.creativeTasks.patterns.adapter.textTransformation;

public class Main {
    public static void main(String[] args) {
        Printer textHowNum = new TextPrinterAdapter(new TextPrinter("5"));
        System.out.println(textHowNum.print());
    }
}
