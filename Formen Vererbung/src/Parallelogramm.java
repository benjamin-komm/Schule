public class Parallelogramm extends Viereck {

    public Parallelogramm(double a, double b, double alpha) {
        this.a = a;
        this.b = b;
        this.alpha = alpha;
    }

    public double flaecheBerechnen() {
        return this.a * this.b * Math.sin(Math.toRadians(this.alpha));
    }

    public double diagonaleEBerechnen() {
        return Math.sqrt(
                Math.pow(this.a, 2) + Math.pow(this.b, 2)
                        + 2 * this.a * this.b * Math.cos(Math.toRadians(this.alpha))
        );
    }

    public double diagonaleFBerechnen() {
        return Math.sqrt(
                Math.pow(this.a, 2) + Math.pow(this.b, 2)
                        - 2 * this.a * this.b * Math.cos(Math.toRadians(this.alpha))
        );
    }

}
