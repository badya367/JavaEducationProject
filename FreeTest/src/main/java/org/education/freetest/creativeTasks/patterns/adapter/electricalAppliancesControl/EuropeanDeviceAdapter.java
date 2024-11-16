package org.education.freetest.creativeTasks.patterns.adapter.electricalAppliancesControl;

public class EuropeanDeviceAdapter implements USDevice{
    EuropeanDevice europeanDevice;

    public EuropeanDeviceAdapter(EuropeanDevice europeanDevice) {
        this.europeanDevice = europeanDevice;
    }

    @Override
    public void powerOn() {
        System.out.println("Включаю адаптер для Европейских приборов");
        europeanDevice.turnOn();
    }
}
