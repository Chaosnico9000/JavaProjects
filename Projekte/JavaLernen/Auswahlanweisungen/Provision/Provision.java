package Projekte.JavaLernen.Auswahlanweisungen.Provision;
import java.util.Scanner;

public class Provision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Willkommen beim Provisionsrechner");

        // Anwendereingaben
        int SalesVolume;
        int BaseVolume;
        int Provision1 = 340;
        double Provision2 = 0.02;
        double Outcome = 0;
        
        // Anwendereingaben
        System.out.print("Bite geben sie den Umsatz ein!: ");
        SalesVolume = input.nextInt();
        System.out.print("Bite geben sie das Grundgehalt ein!: ");
        BaseVolume = input.nextInt();

        // Validierung der Daten
        if (SalesVolume <= 20000 || SalesVolume <= (4*BaseVolume))
            {
                System.out.println("leider keine Prämie erreicht!");
            }
        // Rechnung
        if (SalesVolume > 20000) {
            Outcome = Outcome + Provision1;
        }
        if (SalesVolume >= (4*BaseVolume)) {
            Outcome = Outcome * Provision2;
        }

        // Anwenderausgaben
        System.out.println("Sie haben eine Ausgabe von " + Outcome + " € ");

        input.close();
    }
}
