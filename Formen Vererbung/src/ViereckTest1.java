public class ViereckTest1 {

    public static void main(String[] args) {
        Parallelogramm parallelogramm = new Parallelogramm(10, 50, 60);
        System.out.println(parallelogramm.umfangBerechnen());
        System.out.println(parallelogramm.flaecheBerechnen());
        System.out.println(parallelogramm.diagonaleEBerechnen());
        System.out.println(parallelogramm.diagonaleFBerechnen());
    }

}
