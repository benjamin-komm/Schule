import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sechs oder Pascha?");

        String option = scanner.next();

        if (option.equalsIgnoreCase("pascha")) {
            pascha();
        } else {
            sechs();
        }
    }

    public static void sechs() {
        int num = (int) (Math.random() * 6 + 1);
        System.out.println("Du hast eine " + num + " gewürfelt!");
        if (num == 6) {
            System.out.println("Gewinn");
        } else {
            System.out.println("Niete");
        }
    }

    public static void pascha() {
        int num1 = (int) (Math.random() * 6 + 1);
        int num2 = (int) (Math.random() * 6 + 1);
        System.out.println("Du hast eine " + num1 + " und eine " + num2 + " gewürfelt!");
        if (num1 == num2) {
            System.out.println("Gewinn");
        } else {
            System.out.println("Niete");
        }
    }

}
