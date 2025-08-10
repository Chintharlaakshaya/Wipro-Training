package app;

import controller.DeviceController;
import devices.*;

public class Main {
    public static void main(String[] args) {
        // Create controller
        DeviceController controller = new DeviceController();

        // ===== Smart Light =====
        SmartLight light = new SmartLight();
        controller.turnOnDevice(light);
        controller.increaseSetting(light);
        controller.decreaseSetting(light);
        controller.turnOffDevice(light);

        System.out.println("------------------------");

        // ===== Smart Fan =====
        SmartFan fan = new SmartFan();
        controller.turnOnDevice(fan);
        controller.increaseSetting(fan);
        controller.decreaseSetting(fan);
        controller.turnOffDevice(fan);

        System.out.println("------------------------");

        // ===== Smart AC =====
        SmartAC ac = new SmartAC();
        controller.turnOnDevice(ac);
        controller.increaseSetting(ac);
        controller.decreaseSetting(ac);
        controller.turnOffDevice(ac);

        System.out.println("------------------------");

        // ===== Smart TV =====
        SmartTV tv = new SmartTV();
        controller.turnOnDevice(tv);
        controller.increaseSetting(tv);
        controller.decreaseSetting(tv);
        controller.turnOffDevice(tv);
    }
}
