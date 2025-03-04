package Projekte.JavaLernen.Auswahlanweisungen.Bestellwert;
import java.util.Scanner;

public class Bestellwert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variablen
        double OrderValue;
        double Sum;
        
        //Anwendereingaben
        System.out.print("Bitte geben sie den Bestellwert ein!: ");
        OrderValue = input.nextInt();

        //Rechnung
        if (OrderValue < 200)
        {
            Sum = OrderValue + 5.5;
        } else 
        {
            Sum = OrderValue;
        }

        //Anwenderausgaben
        System.out.println("Der zu bezahlende Betrag ist " + Sum + " €");

        input.close();
    }
}
