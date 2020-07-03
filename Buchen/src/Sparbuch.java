
public class Sparbuch {
	
	private double kontostand = 1000.0;
	private String name;
	private double zinssatz = 0.55;
	
	public void buchen(double betrag) {
		if(betrag >= 0) {
			kontostand += betrag;
		}else {
			if(kontostand + betrag > 0) {
				kontostand += betrag;
				System.out.println("Auszahlung erfolgreich");
			}else {
				System.out.println("Buchung nicht möglich");
			}
		}
		System.out.println("Neuer Kontostand: " + kontostand);
	}
	
	public double zinsenBerechnen() {
		double zinsen = kontostand / 100 * zinssatz;
		return zinsen;
	}

}
