public class Rechteck extends Viereck {

    public Rechteck(double laenge, double breite) {
        super(laenge, breite);
    }

    public double diagonaleBerechnen() {
        return Math.sqrt((laenge * laenge) + (breite * breite));
    }

}
