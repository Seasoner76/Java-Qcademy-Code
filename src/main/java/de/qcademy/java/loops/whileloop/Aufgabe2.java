package de.qcademy.java.loops.whileloop;

import java.util.Scanner;

public class Aufgabe2 {

    public static double arraySumme(double[] arr) {

        double ergebnisSumme = 0.0;
        int i = 0;
        while (i < arr.length) {
            ergebnisSumme += arr[i];
            i++;
        }
        return ergebnisSumme;
    }

    public static void main(String[] args) {

        double[] zahlen = new double[3];

        for (int i = 0; i < zahlen.length; i++) {
            Scanner scan = new Scanner(System.in);
            double zahlUser = scan.nextDouble();
            zahlen[i] = zahlUser;
        }

        double summe = Aufgabe2.arraySumme(zahlen);

        System.out.println("Die Summe der Zahlen, die der User eingegeben hat ist " + summe);
    }
}