
public class Main {

	public static void main(String[] args) {
			Pen p = new Pen();
			
			System.out.println(p.color);
			System.out.println(p.point); 
			System.out.println(p.type);
			
			System.out.println(p.clicked);
			
			p.click();
			
			System.out.println(p.clicked);
			
			Headphones h = new Headphones();
			
			System.out.println(h.color);
			System.out.println(h.charge);
			h.volumeMax();
			System.out.println(h.volume);
			h.volumeMute();
			System.out.println(h.volume);
			h.volumeUp();
			System.out.println(h.volume);
			h.showControls();
	}

}
