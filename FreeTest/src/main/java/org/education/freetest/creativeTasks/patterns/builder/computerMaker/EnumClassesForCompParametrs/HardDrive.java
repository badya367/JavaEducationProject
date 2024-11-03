package org.education.freetest.creativeTasks.patterns.builder.computerMaker.EnumClassesForCompParametrs;

public enum HardDrive {
    HDD_256("HDD", "256GB"),
    HDD_512("HDD", "512GB"),
    SSD_256("SSD", "256GB"),
    SSD_512("SSD", "512GB");

    private final String type;
    private final String volume;

    HardDrive(String type, String volume) {
        this.type = type;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "type='" + type + '\'' +
                ", volume='" + volume + '\'' +
                '}';
    }
}
