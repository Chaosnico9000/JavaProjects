package Projekte.JavaLernen.Schleifen.UngeradeZahlen;

import java.util.Scanner;

public class UngeradeZahlen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Willkommen bei Ungerade Zahlen Rechner");

        // Variablendeklaration
        int start;
        int end;

        // Anwendereingaben
        System.out.print("Bitte geben Sie die untere Grenze ein!: ");
        start = input.nextInt();
        System.out.print("Bitte geben Sie die untere Grenze ein!: ");
        end = input.nextInt();

        // Validierung der Daten
        if (start > end) {
            input.close();
            throw new IllegalArgumentException();
            }

        // Rechnung
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        // Anwenderausgaben
        System.out.println("");

        input.close();
    }
}
