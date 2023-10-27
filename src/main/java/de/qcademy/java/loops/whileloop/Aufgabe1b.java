package de.qcademy.java.loops.whileloop;

public class Aufgabe1b {

    public static void func(int n) {
        int m = n + 1;

        while (true) {
            if ((m % n) == 0) {
                m++;
                continue;
            }
            m++;
            System.out.println("m = " + m);
        }
    }

    public static void main(String[] args) {

        Aufgabe1b main1 = new Aufgabe1b();
        main1.func(2);
        System.out.println("Hello world!");
    }
}

