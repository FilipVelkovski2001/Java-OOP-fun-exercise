
public class Headphones {
	
	String charge = "Micro usb";
	String[] controls = {"Power", "Volume", "Skip", "Pause"};
	String color = "Red/Black";
	
	static boolean power = false;
	static int volume = 0;
	
	public void showControls() {
		for(String controls1 : controls) {
			System.out.println(controls1);
		}
		
	}
	
	public static void powerOn() {
	power = true;	
		
	}
	
	public static void powerOff() {
		power = false;
	}
	
	public static void volumeUp() {
		volume++;
		
	}
	
	public static void volumeDown() {
		volume--;
		
	}
	public static void volumeMax() {
		volume = 100;
		
	}
	public static void volumeMute() {
		volume = 0;
		
	}

}
