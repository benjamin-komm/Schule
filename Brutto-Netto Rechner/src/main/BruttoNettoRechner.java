package main;

import java.util.Scanner;

public class BruttoNettoRechner {

    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);

        System.out.println("Geben Sie den Brutto Betrag ein!");
        double bruttoBetrag = eingabe.nextDouble(),
                lohnsteuerBetrag = bruttoBetrag / 100 * 14,
                pflegeversicherungBetrag = bruttoBetrag / 100 * 1.275,
                solidaritaetszuschlagBetrag = lohnsteuerBetrag / 100 * 5.5,
                kirchensteuerBetrag = lohnsteuerBetrag / 100 * 9,
                rentenversicherungBetrag = bruttoBetrag / 100 * 9.35,
                arbeitslosenversicherungBetrag = bruttoBetrag / 100 * 3.0,
                krankenversicherungBetrag = bruttoBetrag / 100 * 7.3,
                nettoBetrag = bruttoBetrag - lohnsteuerBetrag - pflegeversicherungBetrag - solidaritaetszuschlagBetrag -
                        kirchensteuerBetrag - rentenversicherungBetrag - arbeitslosenversicherungBetrag -
                        krankenversicherungBetrag;

        System.out.println("Netto: " + nettoBetrag + "€");

    }

}
