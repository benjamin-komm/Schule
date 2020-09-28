import java.util.ArrayList;

public class Helfer {

    public static double runden(double zahl, int stellen) {
        zahl = zahl * Math.pow(10, stellen);
        zahl = Math.round(zahl);
        zahl = zahl / Math.pow(10, stellen);
        return zahl;
    }

    public static int zufallsInt(int min, int max) {
        //return (int) (Math.random() * (max + 1 - min)) + min;

        int zufall = (int) (Math.random() * (max - min + 1)) + min;
        return zufall;
    }

    public static void sortieren(int[] zahlen) {
        int lang = zahlen.length;
        for (int a = 0; a <= lang - 2; a++) {
            for (int i = 0; i <= lang - 2; i++) {
                if (zahlen[i] > zahlen[i + 1]) {
                    int tausch = zahlen[i];
                    zahlen[i] = zahlen[i + 1];
                    zahlen[i + 1] = tausch;
                }
            }
        }
    }

}
