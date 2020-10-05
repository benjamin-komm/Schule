public class Quadrat extends Rechteck {

    public Quadrat(double a){
        super(a, a);
    }

    public double diagonaleBerechnen(){
        return this.a * Math.sqrt(2);
    }

}
