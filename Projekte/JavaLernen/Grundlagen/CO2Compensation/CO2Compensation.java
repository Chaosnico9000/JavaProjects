package Projekte.JavaLernen.Grundlagen.CO2Compensation;

import java.util.Scanner;

public class CO2Compensation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variablen
        double distance = 0;
        double passengers = 0;
        double utilization = 0;
        double consumption = 0;

        // Benutzereingaben
        System.out.print("Bitte geben Sie die Flugdistanz (in km) ein: ");
        distance = input.nextDouble();
        System.out.print("Bitte geben Sie die Anzahl der Passagiere ein: ");
        passengers = input.nextDouble();
        System.out.print("Bitte geben Sie die Auslastung in Prozent ein: ");
        utilization = input.nextDouble(); // Umwandlung in Dezimalzahl

        // Validierung der Eingabewerte
        if (distance <= 0 || passengers <= 0 || utilization <= 0 || utilization > 1) {
            System.out.println("Ungültige Eingaben. Bitte geben Sie gültige positive Werte ein.");
            input.close();
            return;
        }

        // Berechnung des CO2-Verbrauchs
        double numerator = 0.0001 * distance * distance + 7 * distance + 5045;
        double denominator = passengers * utilization;
        consumption = (numerator / denominator) * 9 + 0.0004 * distance + 12;

        // Ausgabe
        System.out.println("Der Endverbrauch ist " + consumption + " kg CO2");

        input.close();
    }
}
