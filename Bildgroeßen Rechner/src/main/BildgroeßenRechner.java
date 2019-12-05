package main;

public class BildgroeßenRechner {

    public static void main(String[] args) {

        int ergebnis = (1024 * 768) * 24 + 432;

        System.out.println("Byte: " + ergebnis / 8 + "\nBit: " + ergebnis + "\nKByte: " + (ergebnis / 8) / 1000);

    }

}
