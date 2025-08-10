package devices;

public class SmartLight implements SmartDevice, Adjustable {
	   
	    private int brightness = 3; 

	    @Override
	    public void turnOn() {
	       
	        System.out.println("Smart Light is ON");
	    }
	    @Override
	    public void turnOff() {
	   
	        System.out.println("Smart Light is OFF");
	    }
	    
	    @Override
	    public void increaseSetting() {
	        if (brightness < 10) brightness++;
	        System.out.println("Brightness increased to " + brightness);
	    }
	    @Override
	    public void decreaseSetting() {
	        if (brightness > 0) brightness--;
	        System.out.println("Brightness decreased to " + brightness);
	    }
	}



