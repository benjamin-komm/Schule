public class Drachenviereck extends Viereck {

    public Drachenviereck(double a, double b, double alpha, double gamma) {
        this.a = a;
        this.b = b;
        this.alpha = alpha;
        this.gamma = gamma;
    }

    public double flaecheBerechnen() {
        return 0.5 * diagonaleEBerechnen() * diagonaleFBerechnen();
    }

    public double diagonaleEBerechnen() {
        return this.a * Math.cos(Math.toRadians(this.alpha) / 2) + this.b * Math.cos(Math.toRadians(this.gamma) / 2);
    }

    public double diagonaleFBerechnen() {
        return 2 * this.a * Math.sin(Math.toRadians(this.alpha) / 2);
    }

}
