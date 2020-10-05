public class Trapez extends Viereck {

    public Trapez(double a, double b, double c, double d, double alpha, double beta){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.alpha = alpha;
        this.beta = beta;
    }

    public double flaecheBerechnen() {
        return ((this.a + this.c) / 2) * (this.d * Math.sin(this.alpha));
    }

    public double diagonaleEBerechnen(){
        return Math.sqrt(
                Math.pow(this.a, 2) + Math.pow(this.b, 2) - 2 * this.a * this.b * Math.cos(Math.toRadians(this.beta))
        );
    }

    public double diagonaleFBerechnen(){
        return Math.sqrt(
                Math.pow(this.a, 2) + Math.pow(this.d, 2) - 2 * this.a * this.d * Math.cos(Math.toRadians(this.alpha))
        );
    }

}
