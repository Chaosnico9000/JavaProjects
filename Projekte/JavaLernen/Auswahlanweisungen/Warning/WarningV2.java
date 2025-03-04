package Projekte.JavaLernen.Auswahlanweisungen.Warning;
import java.util.Scanner;

public class WarningV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variablen
        int zahl;

        //Anwendereingaben
        System.out.print("Bitte geben sie eine Zahl ein!: ");
        zahl = input.nextInt();

        //Validierung der Anwendereingaben
        if (zahl > 50) {
            System.out.println("Warnung! sie haben eine Zahl von Größer 50 eingegeben");
        } else if (zahl < 40) {
            System.out.println("Warnung! sie haben eine Zahl von Kleiner 40 eingegeben");
        }
        input.close();
    }
}
