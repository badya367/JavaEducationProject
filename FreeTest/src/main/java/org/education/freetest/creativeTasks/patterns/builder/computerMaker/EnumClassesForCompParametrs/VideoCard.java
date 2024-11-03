package org.education.freetest.creativeTasks.patterns.builder.computerMaker.EnumClassesForCompParametrs;

public enum VideoCard {
    GEFORCE_RTX_4090_8GB("GEFORCE_RTX_4090", "8GB"),
    GEFORCE_RTX_4090_16GB("GEFORCE_RTX_4090", "16GB"),
    GEFORCE_RTX_4080_8GB("GEFORCE_RTX_4080", "8GB"),
    GEFORCE_RTX_4080_16GB("GEFORCE_RTX_4080", "16GB"),
    GEFORCE_RTX_4070_TI_12GB("GEFORCE_RTX_4070_TI", "12GB"),
    GEFORCE_RTX_4070_TI_16GB("GEFORCE_RTX_4070_TI", "16GB"),
    RADEON_RX_7900_XTX_8GB("RADEON_RX_7900_XTX", "8GB"),
    RADEON_RX_7900_XTX_16GB("RADEON_RX_7900_XTX", "16GB"),
    RADEON_RX_7900_XT_12GB("RADEON_RX_7900_XT", "12GB"),
    RADEON_RX_7900_XT_16GB("RADEON_RX_7900_XT", "16GB"),
    RADEON_PRO_W7800_8GB("RADEON_PRO_W7800", "8GB");

    private final String name;
    private final String volume;

    VideoCard(String name, String volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "VideoCard{" +
                "name='" + name + '\'' +
                ", volume='" + volume + '\'' +
                '}';
    }
}
