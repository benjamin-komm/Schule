public class Viereck {

    protected double a;
    protected double b;
    protected double c;
    protected double d;
    protected double alpha;
    protected double beta;
    protected double gamma;
    protected double delta;

    public double umfangBerechnen(){
        if (this.c == 0)  this.c = this.a;
        if (this.d == 0) this.d = this.b;
        return this.a + this.b + this.c + this.d;
    }

}
