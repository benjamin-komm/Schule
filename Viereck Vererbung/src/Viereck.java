public class Viereck {

    protected double laenge;
    protected double breite;

    public Viereck(double laenge, double breite){
        this.laenge = laenge;
        this.breite = breite;
    }

    protected double flaechenBerechnen() {
        return this.laenge * this.breite;
    }

    protected double umfangBerechnen() {
        return 2 * this.laenge + 2 * this.breite;
    }

}
