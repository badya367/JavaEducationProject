package org.education.freetest.creativeTasks.patterns.adapter.textTransformation;

public class NumberPrinter implements Printer{
    double number;

    public NumberPrinter(double number) {
        this.number = number;
    }

    @Override
    public double print() {
        System.out.println("Печатаю число: " + number);
        return number;
    }
}
