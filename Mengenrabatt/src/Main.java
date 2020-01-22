import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double stueckpreis = 0.50;
        double preis = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bestellmenge:");
        int bestellmenge = scanner.nextInt();

        preis = bestellmenge * stueckpreis;

        if (bestellmenge >= 100 && bestellmenge < 200) {
            preis = preis / 100 * 92;
        } else if (bestellmenge >= 200 && bestellmenge < 500) {
            preis = preis / 100 * 85;
        } else if (bestellmenge >= 500) {
            preis = preis / 100 * 70;
        }

        System.out.println("Preis: " + preis + "€");

    }

}
