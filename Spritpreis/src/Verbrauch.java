
public class Verbrauch {

	private double strecke;
	private double spritMenge;
	private double spritPreis;
	
	Verbrauch(double strecke, double spritMenge, double spritPreis){
		this.strecke = strecke;
		this.spritMenge = spritMenge;
		this.spritPreis = spritPreis;
	}
	
	public double verbrauchPro100Km() {
		double verbrauch = spritMenge / strecke * 100;
		return verbrauch;
	}
	
	public double kostenPro100Km() {
		double kosten = verbrauchPro100Km() * spritPreis;
		return kosten;
	}
	
	public double kostenPro1Km() {
		double kosten = kostenPro100Km() / 100;
		return kosten;
	}
	
	public double streckeMit1Liter() {
		double str = strecke / spritMenge;
		return str;
	}
	
}
