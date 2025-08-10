package controller;

import devices.SmartDevice;
import devices.Adjustable;

public class DeviceController {

    public void turnOnDevice(SmartDevice operate) {
        operate.turnOn();
    }

    public void turnOffDevice(SmartDevice operate) {
    	operate.turnOff();
    }

    // Only accepts adjustable devices
    public void increaseSetting(Adjustable operate) {
    	operate.increaseSetting();
    }

    public void decreaseSetting(Adjustable operate) {
    	operate.decreaseSetting();
    }
}
