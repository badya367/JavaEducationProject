package org.education.freetest.creativeTasks.patterns.builder.computerMaker;

import org.education.freetest.creativeTasks.patterns.builder.computerMaker.EnumClassesForCompParametrs.*;

public class Main {
    public static void main(String[] args) {
        Computer computerDefault = new ComputerBuilder(Processor.INTEL_CORE_i7_13700KF_LGA1700)
                .build();

        System.out.println(computerDefault);

        Computer computerCustom = new ComputerBuilder(Processor.INTEL_CORE_i9_12900KF)
                .ram(Ram.DDR5_32GB)
                .hardDrive(HardDrive.HDD_512)
                .videoCard(VideoCard.GEFORCE_RTX_4090_16GB)
                .os(Os.WINDOWS)
                .build();

        System.out.println(computerCustom);
    }
}
