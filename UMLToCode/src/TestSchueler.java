public class TestSchueler {

    public static void main(String[] args) {
        Schueler max = new Schueler("max", "Musterstraße 20");
        max.addKursNote("Mathe", 3);
        max.addKursNote("Deutsch", 2);
        max.addKursNote("Englisch", 4);
        max.addKursNote("IT", 1);
        System.out.println(max.toString());
        max.druckeNoten();
        System.out.println("Durchschnitt: " + max.getDurchschnittsnote());
    }

}
