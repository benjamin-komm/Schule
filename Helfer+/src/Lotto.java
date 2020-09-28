import java.util.Arrays;

public class Lotto {

    private int[] zahlen = new int[6];

    private void zahlenErmitteln() {

        int zahl;
        for (int i = 0; i < 6; i++){
            zahl = Helfer.zufallsInt(1, 49);
            for (int x = 0; x < i; x++){
                if (zahlen[x] == zahl){
                    zahl = Helfer.zufallsInt(1, 49);
                    x = -1;
                }
            }
            zahlen[i] = zahl;
        }
    }

    public void zahlenAnzeigen() {
        zahlenErmitteln();
        System.out.println(Arrays.toString(zahlen));
    }

}
