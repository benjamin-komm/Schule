import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = (int) (Math.random() * 10 + 1);
        int versuche = 0;
        boolean raten = true;
        System.out.println("Errate eine Zahl zwischen 1 und 10:");
        while (raten) {
            versuche++;
            int numEingegeben = scanner.nextInt();
            if (num == numEingegeben) {
                raten = false;
                System.out.println("Richtig!");
                System.out.println("Versuche: " + versuche);
            } else {
                System.out.println("Falsch!");
            }
        }

    }

}
