//Bauplanklasse
public class Auto {

    //Atribute = Instanzvariable
    String farbe;
    String marke;
    int ps;

    //Konstruktor
    Auto(String farbe, String marke, int ps) {
        this.farbe = farbe;
        this.marke = marke;
        this.ps = ps;
    }

    //Methoden
    public String fahren(String richtung) {
        if (richtung.equals("vor")) {
            return "vorwärts";
        } else {
            return "rückwerts";
        }
    }

}
