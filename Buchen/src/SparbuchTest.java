
public class SparbuchTest {
	
	public static void main(String[] args) {
		
		Sparbuch sparbuch = new Sparbuch();
		
		sparbuch.buchen(-1100.0);
		System.out.println("Zinsen: " + sparbuch.zinsenBerechnen());
		
	}
	
}
