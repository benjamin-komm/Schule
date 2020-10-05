public class Rechteck extends Viereck {

    public Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    public double diagonaleBerechnen() {
        return Math.sqrt(Math.pow(this.laenge, 2) + Math.pow(this.breite, 2));
    }

}
