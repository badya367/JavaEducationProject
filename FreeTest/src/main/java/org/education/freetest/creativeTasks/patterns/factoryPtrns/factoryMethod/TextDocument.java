package org.education.freetest.creativeTasks.patterns.factoryPtrns.factoryMethod;

public class TextDocument implements Document{
    @Override
    public void open() {
        System.out.println("Вы открыли текстовый документ");
    }
}
