package de.qcademy.java.loops.forloop;

public class Aufgabe4 {

    public static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }
        int fibona = 1;
        int neuFib = 1;

        for (int i = 2; i < n; i++) {
            int zwischenergebnis = fibona;
            fibona += neuFib;
            neuFib = zwischenergebnis;
        }
        return fibona;
    }

    public static void main(String[] args) {

        int n = 6;
        int ergebnis = fibonacci(n);
        System.out.println("Die " + n + ". Zahl der Fibonaccireihe ist: " + ergebnis);
    }
}