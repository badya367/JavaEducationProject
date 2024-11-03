package org.education.freetest.creativeTasks.patterns.builder.computerMaker;

import org.education.freetest.creativeTasks.patterns.builder.computerMaker.EnumClassesForCompParametrs.*;

public class Computer {
    private Processor processor;
    private Ram ram;
    private HardDrive hardDrive;
    private VideoCard videoCard;
    private Os os;

    public Computer(ComputerBuilder computerBuilder){
        this.processor = computerBuilder.getProcessor();
        this.ram = computerBuilder.getRam();
        this.hardDrive = computerBuilder.getHardDrive();
        this.videoCard = computerBuilder.getVideoCard();
        this.os = computerBuilder.getOs();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", ram=" + ram +
                ", hardDrive=" + hardDrive +
                ", videoCard=" + videoCard +
                ", os=" + os +
                '}';
    }
}
