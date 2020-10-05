public class Raute extends Drachenviereck {

    public Raute(double a, double alpha){
        super(a, a, alpha, alpha);
    }

    public double diagonaleBerechnen(){
        return 2 * this.a * Math.cos(Math.toRadians(this.gamma) / 2);
    }

}
