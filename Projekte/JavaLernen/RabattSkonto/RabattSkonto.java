package Projekte.JavaLernen.RabattSkonto;

import java.util.Scanner;

public class RabattSkonto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variablen
        double betrag;
        double rabatt;
        double skonto;
        double endbetrag;

        // Anwendereingaben
        System.out.print("Bitte geben Sie Ihren Rechnungsbetrag ein: ");
        betrag = input.nextDouble();
        System.out.print("Bitte geben Sie Ihren Rabattsatz in Prozent ein (z.B. 10 für 10%): ");
        rabatt = input.nextDouble() / 100;
        System.out.print("Bitte geben Sie Ihren Skontosatz in Prozent ein (z.B. 5 für 5%): ");
        skonto = input.nextDouble() / 100;

        // Rechnung
        double betragNachRabatt = betrag * (1 - rabatt);
        endbetrag = betragNachRabatt * (1 - skonto);

        // Ausgabe
        System.out.printf("Der ausgerechnete Endbetrag ist %.2f%n", endbetrag);

        input.close();
    }
}
