import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);

        System.out.println("Bitte Username eingeben: ");
        String username = eingabe.next();
        System.out.println("Hallo " + username);

        System.out.println("Bitte Temperatur eingeben: ");
        int temperatur = eingabe.nextInt();

        System.out.println("Bitte Temperatureinheit der eingegebenen Temperatur eingeben: \n(C = Celsius & F = Fahrenheit)");
        String einheit = eingabe.next();

        String ergebnis = calc(temperatur, einheit);

        System.out.println("Ergebnis: " + ergebnis);

    }

    private static String calc(int temp, String einheit){
        String ergebnis;
        switch (einheit){
            case "C":
                ergebnis = ((temp - 32) * 5 / 9) + "F";
                return ergebnis;
            case "F":
                ergebnis = (temp * 1.8 + 32) + "C";
                return ergebnis;
        }
        return null;
    }

}
