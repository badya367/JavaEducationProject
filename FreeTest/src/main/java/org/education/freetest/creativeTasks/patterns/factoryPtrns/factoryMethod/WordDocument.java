package org.education.freetest.creativeTasks.patterns.factoryPtrns.factoryMethod;

public class WordDocument implements Document{
    @Override
    public void open() {
        System.out.println("Вы открыли вордовский документ");
    }
}
