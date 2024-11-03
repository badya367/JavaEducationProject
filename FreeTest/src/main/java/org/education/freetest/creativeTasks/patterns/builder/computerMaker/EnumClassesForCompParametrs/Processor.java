package org.education.freetest.creativeTasks.patterns.builder.computerMaker.EnumClassesForCompParametrs;

import java.util.Arrays;
import java.util.Optional;

public enum Processor {
    AMD_RYZEN_9_7900X_AM5,
    INTEL_CORE_i9_12900KF,
    RYZEN_7_5800X3D,
    INTEL_CORE_i7_13700KF_LGA1700,
    AMD_RYZEN_9_7900X_OEM;


//    private final String name;
//
//    Processor(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Processor{" +
//                "name='" + name + '\'' +
//                '}';
//    }
//
//    public static Optional<Processor> fromName(String name) {
//        return Arrays.stream(values())
//                .filter(model -> model.name.equalsIgnoreCase(name))
//                .findFirst();
//    }
}
