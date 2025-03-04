package Projekte.JavaLernen.Grundlagen.Zinsen;
import java.util.Scanner;

public class Zinsen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variablen
        double kapital;
        double zinssatz;
        int tage;
        double zinsen;
        double endkapital;

        // Anwendereingaben
        System.out.print("Bitte geben Sie Ihr Kapital ein: ");
        kapital = input.nextDouble();
        System.out.print("Bitte geben Sie den Zinssatz ein (z.B. 2 für 2%): ");
        zinssatz = input.nextDouble();
        System.out.print("Bitte geben Sie die Anzahl der Tage ein, für die die Zinsen berechnet werden: ");
        tage = input.nextInt();

        // Berechnung der Zinsen
        zinsen = (kapital * zinssatz * tage) / (100 * 360);

        // Berechnung des Endkapitals
        endkapital = kapital + zinsen;

        // Anwenderausgaben mit formatierten Beträgen und Euro-Zeichen
        System.out.printf("Die berechneten Zinsen betragen: %.2f €%n", zinsen);
        System.out.printf("Ihr Endkapital beträgt: %.2f €%n", endkapital);

        input.close();
    }
}
