import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);

        System.out.println("Bitte Username eingeben: ");
        String username = eingabe.next();
        System.out.println("Hallo " + username);

        System.out.println("Bitte Temperatur eingeben: ");
        double temperatur = eingabe.nextDouble();

        System.out.println("Bitte Temperatureinheit der eingegebenen Temperatur eingeben: \n(C = Celsius & F = Fahrenheit)");
        String einheit = eingabe.next();

        String ergebnis = calc(temperatur, einheit);

        System.out.println("Ergebnis: " + ergebnis);

    }

    private static String calc(double temp, String einheit) {
        String ergebnis;
        switch (einheit) {
            case "C":
                ergebnis = (Math.round(temp - 32 * 5 / 9 * 100) / 100) + "F";
                return ergebnis;
            case "F":
                ergebnis = (Math.round(temp * 1.8 + 32 * 100) / 100) + "C";
                return ergebnis;
        }
        return null;
    }
}
