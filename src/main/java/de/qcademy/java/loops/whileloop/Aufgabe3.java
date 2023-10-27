package de.qcademy.java.loops.whileloop;

public class Aufgabe3 {

    public static void primeNumbers(int n) {

        int i = 0;
        while (i <= n) {
            i++;
            boolean primzahl = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    /* System.out.println(i + " ist keine Primzahl"); */
                    primzahl = false;
                    break;
                }
            }
            if (primzahl) {
                System.out.println(i + " ist eine Primzahl");
            }
        }
    }

    public static void main(String[] args) {

        Aufgabe3.primeNumbers(17);
    }
}