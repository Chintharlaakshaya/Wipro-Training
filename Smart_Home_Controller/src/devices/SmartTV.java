package devices;

public class SmartTV implements Adjustable, SmartDevice {
	private int volume=3;
	private int brightness=3;

	@Override
	public void turnOn() {
		System.out.println("Smart TV is ON");

	}

	@Override
	public void turnOff() {
		System.out.println("Smart TV is OFF");

	}

	@Override
	public void increaseSetting() {
		if (volume < 5) {
			volume++;
        System.out.println("Volume  increased to " + volume);
		}
		if (brightness < 5) {
			brightness++;
        System.out.println("brightness  increased to " + brightness);
		}
	}
		

	@Override
	public void decreaseSetting() {
		if (volume > 5) {
			volume--;
        System.out.println("Volume  decreased to " + volume);
		}
		if (brightness > 5) {
			brightness--;
        System.out.println("brightness  decreased to " + brightness);
		}
		else {
			System.out.println("Volume and brightness are perfect");
		}
		

	}

}
