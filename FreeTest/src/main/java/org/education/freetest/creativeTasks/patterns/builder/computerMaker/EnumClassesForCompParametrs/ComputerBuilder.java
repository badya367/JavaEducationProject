package org.education.freetest.creativeTasks.patterns.builder.computerMaker.EnumClassesForCompParametrs;

import org.education.freetest.creativeTasks.patterns.builder.computerMaker.Computer;

public class ComputerBuilder {
    private Processor processor;
    private Ram ram = Ram.DDR3_16GB;
    private HardDrive hardDrive = HardDrive.HDD_256;
    private VideoCard videoCard = VideoCard.RADEON_PRO_W7800_8GB;
    private Os os = Os.WINDOWS;

    public ComputerBuilder(Processor processor) {
        this.processor = processor;
    }

    public ComputerBuilder ram(Ram ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder hardDrive(HardDrive hardDrive){
        this.hardDrive = hardDrive;
        return this;
    }

    public ComputerBuilder videoCard(VideoCard videoCard){
        this.videoCard = videoCard;
        return this;
    }

    public ComputerBuilder os(Os os){
        this.os = os;
        return this;
    }

    public Computer build() {
        if (processor == null) {
            throw new IllegalStateException("Processor is a required field and cannot be null");
        }
        return new Computer(this);
    }

    public Processor getProcessor() {
        return processor;
    }

    public Ram getRam() {
        return ram;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public Os getOs() {
        return os;
    }
}
