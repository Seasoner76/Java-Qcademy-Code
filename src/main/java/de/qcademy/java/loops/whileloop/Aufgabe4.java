package de.qcademy.java.loops.whileloop;

public class Aufgabe4 {
    public static int ggt(int n, int m) {
        int i = 0;
        int ggTeiler = 0;

        while (i <= n) {
            i++;
            if (n % i == 0) {
                //  System.out.println(i + " ist ein Teiler von " + n);
            }
            if (m % i == 0) {
                // System.out.println(i + " ist ein Teiler von " + m);
            }

            if (n % i == 0 && m % i == 0) {
                ggTeiler = i;
                // System.out.println(i + " ist ein gemeinsamer Teiler von " + n + " und " + m);
            }
        }
        return ggTeiler;
    }

    public static void main(String[] args) {

        Aufgabe4 aufgabe4 = new Aufgabe4();
        int zahl1 = 60;
        int zahl2 = 30;

        System.out.println(aufgabe4.ggt(zahl1, zahl2) + " ist der größte gemeinsame Teiler von " + zahl1 + " und " + zahl2);

    }
}



