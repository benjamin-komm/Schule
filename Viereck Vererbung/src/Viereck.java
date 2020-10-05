public class Viereck {

    protected double laenge;
    protected double breite;

    protected double flaechenBerechnen() {
        return this.laenge * this.breite;
    }

    protected double umfangBerechnen() {
        return 2 * this.laenge + 2 * this.breite;
    }

}
