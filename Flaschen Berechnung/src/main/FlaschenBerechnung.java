package main;

import java.util.Scanner;

public class FlaschenBerechnung {

    public static void main(String[] args) {

        Scanner eingabe  = new Scanner(System.in);

        System.out.println("Wie viele Flaschen gibt es?");
        int flaschen = eingabe.nextInt();

        System.out.println("Wie viele Flaschen passen in eine Kiste?");
        int flaschenProKiste = eingabe.nextInt();

        int kisten = flaschen / flaschenProKiste;
        int restFlaschen = flaschen % flaschenProKiste;

        System.out.println("Es werden " + kisten + " Kisten gefüllt und es bleiben " + restFlaschen + " Flaschen übrig!");

    }

}
