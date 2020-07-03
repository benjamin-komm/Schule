
public class VerbrauchTest {
	
	public static void main(String[] args) {
		Verbrauch verbrauch = new Verbrauch(20.6, 45.0, 4.5);
		System.out.println("Verbrauch Pro 100km: " + verbrauch.verbrauchPro100Km());
	}

}
