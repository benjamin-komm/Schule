public class Patient {

    public String name;
    public String geschlecht;
    public double gewicht;
    public double größe;

    Patient(double gewicht, double größe, String geschlecht) {
        this.gewicht = gewicht;
        this.größe = größe;
        this.geschlecht = geschlecht;
    }

    public int bmiBerechnen() {
        int bmi = (int) (this.gewicht / (this.größe * this.größe));
        return bmi;
    }

    public double idealBerechnen() {
        double ideal;
        if (this.geschlecht.equals("Frau")) {
            ideal = 21 * (this.größe * this.größe);
        } else {
            ideal = 22 * (this.größe * this.größe);
        }
        return ideal;
    }

    public String zustandBestimmen(double bmi) {
        if (this.geschlecht.equals("Frau")) {
            if (bmi < 19) {
                return "Untergewicht";
            } else if (bmi >= 19 && bmi < 24) {
                return "Normalgewicht";
            } else if (bmi >= 24 && bmi < 30) {
                return "Übergewicht";
            } else if (bmi >= 30 && bmi < 40) {
                return "Starkes Übergewicht (Adipositas";
            } else if (bmi >= 40) {
                return "Extremes Übergewicht";
            }
        } else {
            if (bmi < 20) {
                return "Untergewicht";
            } else if (bmi >= 20 && bmi < 25) {
                return "Normalgewicht";
            } else if (bmi >= 25 && bmi < 30) {
                return "Übergewicht";
            } else if (bmi >= 30 && bmi < 40) {
                return "Starkes Übergewicht (Adipositas)";
            } else if (bmi >= 40) {
                return "Extremes Übergewicht";
            }
        }
        return "";
    }

}
