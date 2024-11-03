package org.education.freetest.creativeTasks.patterns.builder.computerMaker.EnumClassesForCompParametrs;

public enum Ram {
    DDR3_8GB("8GB", "DDR3"),
    DDR3_16GB("16GB", "DDR3"),
    DDR3_32GB("32GB", "DDR3"),
    DDR4_8GB("8GB", "DDR4"),
    DDR4_16GB("16GB", "DDR4"),
    DDR4_32GB("32GB", "DDR4"),
    DDR5_16GB("16GB", "DDR5"),
    DDR5_32GB("32GB", "DDR5");

    private final String volume;
    private final String type;

    Ram(String volume, String type) {
        this.volume = volume;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "volume='" + volume + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
