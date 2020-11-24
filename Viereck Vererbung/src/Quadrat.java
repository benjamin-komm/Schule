public class Quadrat extends Viereck {

    public Quadrat(double laenge) {
        super(laenge, laenge);
    }

    public double diagonaleBerechnen() {
        return this.laenge * Math.sqrt(2);
    }

}
