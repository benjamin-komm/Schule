public class ViereckTest {

    public static void main(String[] args) {
        Rechteck rechteck = new Rechteck(20, 40);
        Quadrat quadrat = new Quadrat(20);
        System.out.println(rechteck.umfangBerechnen());
        System.out.println(rechteck.diagonaleBerechnen());
        System.out.println(rechteck.diagonaleEBerechnen());
        System.out.println(rechteck.diagonaleFBerechnen());
        System.out.println("\n");
        System.out.println(quadrat.umfangBerechnen());
        System.out.println(quadrat.diagonaleBerechnen());
        System.out.println(quadrat.diagonaleEBerechnen());
        System.out.println(quadrat.diagonaleFBerechnen());
        System.out.println("\n");

        Trapez trapez = new Trapez(10, 30, 20, 40, 60, 30);
        Drachenviereck drachenviereck = new Drachenviereck(20, 50, 30, 60);
        Raute raute = new Raute(30, 40);
        System.out.println(trapez.umfangBerechnen());
        System.out.println(trapez.flaecheBerechnen());
        System.out.println(trapez.diagonaleEBerechnen());
        System.out.println(trapez.diagonaleFBerechnen());
        System.out.println("\n");
        System.out.println(drachenviereck.umfangBerechnen());
        System.out.println(drachenviereck.flaecheBerechnen());
        System.out.println(drachenviereck.diagonaleEBerechnen());
        System.out.println(drachenviereck.diagonaleFBerechnen());
        System.out.println("\n");
        System.out.println(raute.umfangBerechnen());
        System.out.println(raute.diagonaleBerechnen());
        System.out.println(raute.diagonaleEBerechnen());
        System.out.println(raute.diagonaleFBerechnen());
        System.out.println(raute.flaecheBerechnen());
    }

}
