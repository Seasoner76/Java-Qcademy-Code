package de.qcademy.java.loops.forloop;

public class Aufgabe2 {

    public static int summe(int n) {

        int addition = 0;
        for (int j = 1; j <= n; j++) {
            addition += j;
        }
        return addition;
    }
    public static void main(String[] args) {

        int limit = 40;

        System.out.println("Die Summe der Zahlen von 1 bis " + limit + " ist: " + summe(limit));
    }

}



