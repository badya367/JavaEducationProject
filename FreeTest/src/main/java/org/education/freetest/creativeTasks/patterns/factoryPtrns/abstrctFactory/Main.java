package org.education.freetest.creativeTasks.patterns.factoryPtrns.abstrctFactory;

public class Main {
    public static void main(String[] args) {
        UIFactory windowsFactory = new WindowsFactory();
        UIFactory macFactory = new MacFactory();
        Button windowsButton = windowsFactory.createButton();
        Button macButton = macFactory.createButton();
        CheckBox windowsCheckBox = windowsFactory.createCheckbox();
        CheckBox macCheckBox = macFactory.createCheckbox();

        windowsButton.click();
        macButton.click();
        windowsCheckBox.check();
        macCheckBox.check();
    }
}
