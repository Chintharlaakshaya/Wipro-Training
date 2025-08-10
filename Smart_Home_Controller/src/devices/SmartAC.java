package devices;

public class SmartAC implements Adjustable, SmartDevice {
	private double temperature=14.5;

	@Override
	public void turnOn() {
		System.out.println("Smart AC is ON");

	}

	@Override
	public void turnOff() {
		System.out.println("Smart AC is OFF");

	}

	@Override
	public void increaseSetting() {
		if (temperature < 16) {
			temperature++;
        System.out.println("AC  increased to " + temperature);
		}

	}

	@Override
	public void decreaseSetting() {
		if (temperature > 16) {
			temperature--;
        System.out.println("AC  decreased to " + temperature);
		}

	}

}
