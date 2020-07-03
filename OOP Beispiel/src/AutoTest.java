public class AutoTest {

    public static void main(String[] args) {
        //Objekterzeugung
        Auto auto = new Auto("blau", "BMW", 250);

        //Testen der Methoden, Attributzuweisungen
        System.out.println(auto.farbe);
        System.out.println(auto.fahren("rück"));

    }

}
