package main;

import java.util.Scanner;

public class UngeradeZahlenChecker {

    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);

        System.out.println("1. Zahl:");
        int zahl = eingabe.nextInt();

        switch (zahl % 2){
            case 0:
                System.out.println("Die Zahl ist gerade!");
                break;
            case 1:
                System.out.println("Die Zahl ist ungerade!");
                break;
        }

    }

}
