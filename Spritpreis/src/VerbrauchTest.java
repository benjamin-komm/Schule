import java.util.Scanner;

public class VerbrauchTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double strecke = scanner.nextDouble();

		Verbrauch verbrauch = new Verbrauch(strecke, 45.0, 4.5);
		System.out.println("Verbrauch Pro 100km: " + verbrauch.verbrauchPro100Km());
	}

}
