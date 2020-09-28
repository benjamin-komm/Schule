import java.util.Scanner;

public class LottoTest {

    public static void main(String[] args) {

        Lotto lotto = new Lotto();
        Scanner scanner = new Scanner(System.in);

        String frage = "Möchten Sie Lottozahlen ermitteln? (j/n)";
        System.out.println(frage);
        if (scanner.next().equalsIgnoreCase("j")){
            do {
                lotto.zahlenAnzeigen();
                System.out.println(frage);
            } while (scanner.next().equalsIgnoreCase("j"));
        }

    }

}
