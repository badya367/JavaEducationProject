package org.education.freetest.creativeTasks.patterns.factoryPtrns.abstrctFactory;

public class MacCheckBox implements CheckBox{
    @Override
    public void check() {
        System.out.println("Выбрали чекбокс в стиле Mac");
    }
}
