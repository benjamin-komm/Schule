import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] sockenFarben = new String[7];
        sockenFarben[0] = "rot";
        sockenFarben[1] = "blau";
        sockenFarben[2] = "gruen";
        sockenFarben[3] = "pink";
        sockenFarben[4] = "schwarz";
        sockenFarben[5] = "gelb";
        sockenFarben[6] = "orange";

        String[] tage = new String[7];
        tage[0] = "Montag";
        tage[1] = "Dienstag";
        tage[2] = "Mittwoch";
        tage[3] = "Donnerstag";
        tage[4] = "Freitag";
        tage[5] = "Samstag";
        tage[6] = "Sonntag";

        System.out.println("Gib einen gewünschten Tag als Zahl an (1-7):");
        Scanner scanner = new Scanner(System.in);
        int tag = scanner.nextInt();
        if (tag >= 1 && tag <= 7) {
            System.out.println(tage[tag - 1] + "(" + tag + "): " + sockenFarben[tag - 1]);
        } else {
            System.out.println("Gib eine Zahl zwischen 1 und 7 an!");
        }
    }

}
