package main;

import java.util.Scanner;

public class UngeradeZahlenChecker {

    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);

        System.out.println("Zahl:");
        int zahl = eingabe.nextInt();

        System.out.println((zahl % 2 == 1) ? "Die Zahl ist ungerade!" : "Die Zahl ist gerade!");

    }

}
