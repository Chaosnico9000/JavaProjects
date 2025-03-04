package Projekte.JavaLernen.Grundlagen.Umrechnung;

import java.util.Scanner;

public class Umrechnung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variablen
        int betrag;
        int währung;
        double sum;

        // Anwendereingaben
        System.out.print("Geben Sie den zur Umrechnung anstehenden Betrag ein: ");
        betrag = input.nextInt();
        System.out.print(
                "Geben Sie die zu berechnende Währung ein (1 = Dollar, 2 = Pfund Sterling, 3 = Dänische Kronen): ");
        währung = input.nextInt();

        // Rechnung
        switch (währung) {
            case 1:
                sum = betrag * 1.16;
                break;
            case 2:
                sum = betrag * 0.91;
                break;
            case 3:
                sum = betrag * 7.44;
                break;
            default:
                System.out.println("Fehler");
                input.close();
                return;
        }

        // Währungsname
        String währungsname;
        switch (währung) {
            case 1:
                währungsname = "Dollar";
                break;
            case 2:
                währungsname = "Pfund Sterling";
                break;
            case 3:
                währungsname = "Dänische Kronen";
                break;
            default:
                währungsname = "Unbekannte Währung";
        }

        // Ausgabe
        System.out.printf("Das Ergebnis sind: %.2f %s%n", sum, währungsname);
        input.close();
    }
}
