package Projekte.JavaLernen.Verbrauch;
import java.util.Scanner;

public class Verbrauch {
    public static void main(String[] args)
    {
        // Scanner erstellen
        Scanner input = new Scanner(System.in);

        // Variablendeklaration
        double kilometerstand;
        double verbrauch;
        double durchschnittsverbrauch;

        // Anwendereingaben
        System.out.print("Was ist die gefahrene Gesamtstrecke (in km): ");
        kilometerstand = input.nextDouble();
        System.out.print("Was ist die Menge des verbrauchten Kraftstoffes (in Litern): ");
        verbrauch = input.nextDouble();

        // Rechnung
        durchschnittsverbrauch = (verbrauch / kilometerstand) * 100;

        // Anwenderausgaben
        System.out.println("Der Durchschnittsverbrauch auf 100 km ist: " + durchschnittsverbrauch + " Liter");

        // Scanner schließen
        input.close();
    }
}
