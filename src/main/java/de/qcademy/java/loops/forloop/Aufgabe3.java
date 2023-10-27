package de.qcademy.java.loops.forloop;

public class Aufgabe3 {

    public static void main(String[] args) {

        int d = 7;

        System.out.println("For-Schleife der Fakultät von 1 bis " + d + " ist:" + fakultaet(d));
    }

    public static int fakultaet(int n) {

        int ergebnisBerechnung = 1;

        for (int d = 1; d <= n; d++) {

            ergebnisBerechnung = ergebnisBerechnung * d;
        }
        return ergebnisBerechnung;
    }
}



