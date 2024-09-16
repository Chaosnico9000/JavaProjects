package Projekte.JavaLernen.Rechner;
import java.util.Scanner;

public class RechnerV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variablendeklaration
        int zahl1;
        int zahl2;
        int operator;
        int ergebnis;
        int rest = 0;

        // Initialisierung mit Anwendereingaben
        System.out.print("Bitte geben Sie die erste Zahl ein: ");
        zahl1 = input.nextInt();
        System.out.print("Bitte geben Sie die zweite Zahl ein: ");
        zahl2 = input.nextInt();
        System.out.print("Bitte geben Sie den Operator als Zahl ein (1 = +, 2 = -, 3 = *, 4 = /): ");
        operator = input.nextInt();

        // Rechnung
        switch (operator) {
            case 1:
                ergebnis = zahl1 + zahl2;
                break;
            case 2:
                ergebnis = zahl1 - zahl2;
                break;
            case 3:
                ergebnis = zahl1 * zahl2;
                break;
            case 4:
                if (zahl2 != 0) {
                    ergebnis = zahl1 / zahl2; // Ganzzahlergebnis der Division
                    rest = zahl1 % zahl2;     // Rest der Division
                } else {
                    System.out.println("Fehler: Division durch Null.");
                    input.close();
                    return; // Beendet das Programm, da eine Division durch Null nicht erlaubt ist
                }
                break;
            default:
                System.out.println("Ungültiger Operator.");
                input.close();
                return; // Beendet das Programm, da der Operator ungültig ist
        }

        // Ausgabe in der Konsole
        if (operator == 4) {
            System.out.println("Das Ergebnis von " + zahl1 + " / " + zahl2 + " = " + ergebnis + " mit einem Rest von " + rest);
        } else {
            System.out.println("Das Ergebnis von " + zahl1 + " " + (operator == 1 ? "+" : operator == 2 ? "-" : "*") + " " + zahl2 + " = " + ergebnis);
        }

        System.out.println("Einen wunderschönen Tag noch.");

        // Scanner schließen
        input.close();
    }
}
