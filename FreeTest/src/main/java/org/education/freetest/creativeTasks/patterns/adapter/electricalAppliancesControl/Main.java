package org.education.freetest.creativeTasks.patterns.adapter.electricalAppliancesControl;

public class Main {
    public static void main(String[] args) {
        USDevice europeanDevice = new EuropeanDeviceAdapter(new EuropeanDevice());
        europeanDevice.powerOn();
    }
}
