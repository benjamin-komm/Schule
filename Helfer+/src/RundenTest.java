public class RundenTest {

    public static void main(String[] args) {
        //System.out.println(Helfer.runden(1.45, 0));
        //System.out.println(Helfer.zufallsInt(3, 7));
        int[] zahlen = {6, 3, 4, 5, 1};
        Helfer.sortieren(zahlen);
        for (int i = 0; i < zahlen.length; i++){
            System.out.println(zahlen[i]);
        }
    }

}
