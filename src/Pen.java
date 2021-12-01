
public class Pen {

	String type = "Gel";
	String color = "Blue";
	int point = 10;
	
	static boolean clicked = false;
	
	public static void click() {
	
		clicked = true;
		
	}
	
	public static void unclicked() {
		
		clicked = false;
		
	}
}
