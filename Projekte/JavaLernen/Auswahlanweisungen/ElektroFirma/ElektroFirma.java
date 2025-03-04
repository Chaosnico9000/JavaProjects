package Projekte.JavaLernen.Auswahlanweisungen.ElektroFirma;
import java.util.Scanner;

public class ElektroFirma {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Willkommen beim Bestellwertrechner für Elektrowagen");

        //Variablendeklaration
        int OrderValue;
        double BuyingValue;

        //Anwendereingaben
        System.out.print("Bitte geben sie den Bestellwert Ihrer Bestellungen ein!: ");
        OrderValue = input.nextInt();

        //Rechnung
        if (OrderValue < 100) {
            BuyingValue = OrderValue + 5.5;
        } else if (OrderValue > 100 && OrderValue < 200) {
            BuyingValue = OrderValue + 3;
        } else {
            BuyingValue = OrderValue;
        }

        //Anwenderausgaben
        System.out.println("Der ausgerechnete Rechnungsbetrag entspricht " + BuyingValue);

        input.close();
    }
}
