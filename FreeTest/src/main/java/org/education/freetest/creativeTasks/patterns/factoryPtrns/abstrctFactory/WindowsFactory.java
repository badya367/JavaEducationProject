package org.education.freetest.creativeTasks.patterns.factoryPtrns.abstrctFactory;

public class WindowsFactory extends UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckBox();
    }
}
