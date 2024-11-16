package org.education.freetest.creativeTasks.patterns.factoryPtrns.abstrctFactory;

public class WindowsButton implements Button{
    @Override
    public void click() {
        System.out.println("Нажали на кнопку в стиле Windows");
    }
}
