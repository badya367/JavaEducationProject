package org.education.freetest.creativeTasks.patterns.factoryPtrns.abstrctFactory;

public class MacFactory extends UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacCheckBox();
    }
}
