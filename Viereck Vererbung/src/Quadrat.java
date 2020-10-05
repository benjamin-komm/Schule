public class Quadrat extends Viereck {

    public Quadrat(double laenge) {
        this.laenge = laenge;
        this.breite = laenge;
    }

    public double diagonaleBerechnen() {
        return this.laenge * Math.sqrt(2);
    }

}
