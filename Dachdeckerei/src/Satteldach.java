public class Satteldach {

    private final double KOSTEN_PRO_ZIEGEL = 0.45;
    private final double ZIEGEL_PRO_QUADRATMETER = 12.0;

    private double hausbreite;
    private double hauslaenge;
    private double dachneigung;

    public Satteldach(double hausbreite, double hauslaenge, double dachneigung) {
        this.hausbreite = hausbreite;
        this.hauslaenge = hauslaenge;
        this.dachneigung = dachneigung;
    }

    public void datenAusgeben() {
        System.out.println("Flaeche: " + rechneGesamteFleache() + "m²");
        System.out.println("Dachziegel: " + rechneGesamteDachziegel() + " Stk.");
        System.out.println("Kosten: " + rechneGesamteKosten() + " €");
    }

    public double rechneGesamteFleache(){
        return Helfer.runden((((hausbreite / 2) / Math.cos(Math.toRadians(dachneigung))) * hauslaenge) * 2);
    }

    public int rechneGesamteDachziegel(){
        return (int) Math.ceil(rechneGesamteFleache() * ZIEGEL_PRO_QUADRATMETER);
    }

    public double rechneGesamteKosten(){
        return Helfer.runden(KOSTEN_PRO_ZIEGEL * rechneGesamteDachziegel());
    }

}
