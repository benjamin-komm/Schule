import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("PUK:");

        int defaultPuk = 12345678;
        int usedPuk = scanner.nextInt();

        if (usedPuk == defaultPuk) {
            System.out.println("Die Werkeinstellungen werden rückgängig gemacht!");
        } else {
            System.out.println("Der eingegebene PUK ist falsch!");
        }

    }

}
