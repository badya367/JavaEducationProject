package org.education.freetest.creativeTasks.patterns.visitor.computerComponents;

public class InformationPrinter implements Visitor{
    @Override
    public void visitCPU(Cpu cpu) {
        System.out.println("Процессор с тактовой частотой: " + cpu.getClockFrequency() + " ГГц");
    }

    @Override
    public void visitHDD(Hdd hdd) {
        System.out.println("Жесткий диск с объёмом: " + hdd.getValue() + " ТБ");
    }

    @Override
    public void visitRAM(Ram ram) {
        System.out.println("Оперативная память объемом " + ram.getValue() + " ГБ");
    }
}
