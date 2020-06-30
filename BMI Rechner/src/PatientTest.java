import java.util.Scanner;

public class PatientTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geschlecht(Mann / Frau):");
        String geschlecht = scanner.next();
        System.out.println("Körpergröße(m):");
        double körpergröße = scanner.nextDouble();
        System.out.println("Körpergewicht(kg):");
        double körpergewicht = scanner.nextDouble();
        Patient bmi = new Patient(körpergewicht, körpergröße, geschlecht);

        System.out.println("BMI: " + bmi.bmiBerechnen());
        System.out.println("Idealgewicht: " + bmi.idealBerechnen());
        System.out.println("Zustand: " + bmi.zustandBestimmen(bmi.bmiBerechnen()));

    }

}
