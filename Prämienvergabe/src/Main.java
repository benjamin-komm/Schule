import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int praemie = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name:");
        String name = scanner.next();
        System.out.println("Alter:");
        int alter = scanner.nextInt();
        System.out.println("Dauer der Betriebszugehörigkeit (Jahre):");
        int betriebszugehoerigkeit = scanner.nextInt();

        if (alter > 35) {
            praemie += 50;
        }
        if (betriebszugehoerigkeit >= 25) {
            praemie += 500;
        }

        System.out.println("Prämie: " + praemie + "€");

    }

}
