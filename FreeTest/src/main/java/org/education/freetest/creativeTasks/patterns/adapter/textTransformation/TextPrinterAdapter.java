package org.education.freetest.creativeTasks.patterns.adapter.textTransformation;

public class TextPrinterAdapter implements Printer{
    TextPrinter textPrinter;

    public TextPrinterAdapter(TextPrinter textPrinter) {
        this.textPrinter = textPrinter;
    }

    @Override
    public double print() {
        try {
            System.out.println("Вкючился адаптер. Печатаю число: ");
            return Double.parseDouble(textPrinter.getText());
        } catch (NumberFormatException ex) {
            System.err.println("Невозможно преобразовать данную строку в число");
            throw ex;
        }

    }
}
