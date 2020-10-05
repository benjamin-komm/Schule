public class Schueler {

    private String name;
    private String adresse;
    private int anzahlKurse;
    private String[] kurse;
    private int[] noten;

    public Schueler(String name, String adresse) {
        this.name = name;
        this.setAdresse(adresse);
        this.anzahlKurse = 0;
        this.kurse = new String[10];
        this.noten = new int[10];
    }

    public String getName() {
        return name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String toString() {
        return this.name + "(" + this.adresse + ")";
    }

    public void addKursNote(String kurs, int note){
        this.kurse[anzahlKurse] = kurs;
        this.noten[anzahlKurse] = note;
        this.anzahlKurse++;
    }

    public void druckeNoten(){
        String result = this.name + ":";
        for (int i = 0; i < anzahlKurse; i++){
            result += " " + this.kurse[i] + ":" + this.noten[i];
            if (i != anzahlKurse - 1){
                result += ",";
            }
        }
        System.out.println(result);
    }

    public double getDurchschnittsnote(){
        double summary = 0;
        for (int note : this.noten) {
            summary += note;
        }
        return summary / anzahlKurse;
    }

}
