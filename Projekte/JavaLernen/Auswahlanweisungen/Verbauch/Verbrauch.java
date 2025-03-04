package Projekte.JavaLernen.Auswahlanweisungen.Verbauch;
import java.util.Scanner;

public class Verbrauch {
 public static void main(String[] args)
 {
    Scanner input = new Scanner(System.in);
    System.out.println("Willkommen bei Ihrem Verbauchsrechner!");

    //Variablendeklaration
    int Kilometer;
    int FuelConsumed;
    double AverageConsume;

    //Anwendereingaben
    System.out.print("Bitte geben sie die gefahrenen Kilometer ein: ");
    Kilometer = input.nextInt();
    System.out.print("Bitte geben sie den benutzen Treibstoff ein (in Litern)!: ");
    FuelConsumed = input.nextInt();

    //Validierung der Anwendereingaben
    if (Kilometer != 0) {
    } else {
        input.close();
        throw new IllegalArgumentException("Kilometer müssen mindestens 1 sein!");
    }

    //Rechnung
    AverageConsume = Kilometer / FuelConsumed;

    //Anwenderausgaben
    System.out.println("Der Durchschnittsverbrauch auf 100Km sind " + AverageConsume + " Liter!");

    input.close();
 }
}
