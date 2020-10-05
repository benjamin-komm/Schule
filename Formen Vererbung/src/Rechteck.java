public class Rechteck extends Parallelogramm {

    public Rechteck(double a, double b){
        super(a, b, 90.0);
    }

    public double diagonaleBerechnen(){
        return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
    }

}
