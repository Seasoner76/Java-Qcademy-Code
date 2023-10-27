package de.qcademy.java.loops.whileloop;

public class Aufgabe1b {

    public static void func(int n) {

        int i = 0;

        while (i < 10) {

            if ((i%2) == 0) {
                System.out.println(i + " ist eine gerade Zahl");
            } else {
                System.out.println(i + " ist eine ungerade Zahl");
            }
            i++;
        }
    }

    public static void main(String[] args) {

        Aufgabe1b.func(2);

    }
}

