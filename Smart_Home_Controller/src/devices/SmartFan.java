package devices;

public class SmartFan implements SmartDevice, Adjustable {
	  private int speed = 3;

	@Override
	public void increaseSetting() {
		if (speed < 5) {
			speed++;
        System.out.println("Fan speed increased to " + speed);
		}

	}

	@Override
	public void decreaseSetting() {
		if (speed > 5) {
			speed--;
        System.out.println("Fan speed decreased to " + speed);
		}
		if(speed<=0) {
			System.out.println("Speed to set to -ve");
		}

	}

	@Override
	public void turnOn() {
		System.out.println("Smart Fan is ON");

	}

	@Override
	public void turnOff() {
		System.out.println("Smart Fan is OFF");

	}

}
