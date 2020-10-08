import java.util.Scanner;

public class Dachdeckerei {

    public static void main(String[] args) {
        System.out.println(Helfer.runden(69.28777));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hausbreite: ");
        double hausbreite = scanner.nextDouble();
        System.out.println("Hauslaenge: ");
        double hauslaenge = scanner.nextDouble();
        System.out.println("Dachneigung: ");
        double dachneigung = scanner.nextDouble();

        Satteldach satteldach = new Satteldach(hausbreite, hauslaenge, dachneigung);
        satteldach.datenAusgeben();
    }

}
