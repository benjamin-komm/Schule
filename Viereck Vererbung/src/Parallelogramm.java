public class Parallelogramm extends Viereck {

    private double winkel;

    public Parallelogramm(double laenge, double breite, double winkel) {
        this.laenge = laenge;
        this.breite = breite;
        this.winkel = winkel;
    }

    public double flaechenBerechnen() {
        return this.laenge * this.breite * Math.sin(Math.toRadians(this.winkel));
    }

    public double diagonaleEBerechnen() {
        return Math.sqrt(
                Math.pow(this.laenge, 2) + Math.pow(this.breite, 2)
                        + 2 * this.laenge * this.breite * Math.cos(Math.toRadians(this.winkel))
        );
    }

    public double diagonaleFBerechnen(){
        return Math.sqrt(
                Math.pow(this.laenge, 2) + Math.pow(this.breite, 2)
                        - 2 * this.laenge * this.breite * Math.cos(Math.toRadians(this.winkel))
        );
    }

}
