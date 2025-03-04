package Projekte.JavaLernen.Schleifen.ZehnerzahlUndKubikzahlen;
import java.util.Scanner;

public class Kubikzahlen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Willkommen bei Kubikzahlen rechner");

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
        System.out.println("(1) Quadratzahl; (2) Kubikzahl; (3) Kehrwert");
        for (int i = start; i <= end; i++) {
            System.out.println("die zahlen für {" + i + "} sind =" + " Quadratzahl: " + (i * i) + " Kubikzahl: " + (i * i * i) + " Kehrwert: " + (1.0 / i));
        }

        // Anwenderausgaben
        System.out.println("");

        input.close();
    }
}