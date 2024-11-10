package org.education.freetest.creativeTasks.patterns.factoryPtrns.factoryMethod;

public class PDFDocument implements Document{
    @Override
    public void open() {
        System.out.println("Вы открыли PDF документ");
    }
}
