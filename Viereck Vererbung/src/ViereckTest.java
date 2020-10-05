public class ViereckTest {

    public static void main(String[] args) {
        Quadrat quadrat = new Quadrat(20);
        Rechteck rechteck = new Rechteck(100, 70);
        Parallelogramm parallelogramm = new Parallelogramm(15, 20, 60);
        System.out.println(quadrat.flaechenBerechnen());
        System.out.println(quadrat.diagonaleBerechnen());
        System.out.println(quadrat.umfangBerechnen());
        System.out.println("\n");
        System.out.println(rechteck.flaechenBerechnen());
        System.out.println(rechteck.diagonaleBerechnen());
        System.out.println(rechteck.umfangBerechnen());
        System.out.println("\n");
        System.out.println(parallelogramm.flaechenBerechnen());
        System.out.println(parallelogramm.diagonaleEBerechnen());
        System.out.println(parallelogramm.diagonaleFBerechnen());
        System.out.println(parallelogramm.umfangBerechnen());
    }

}
