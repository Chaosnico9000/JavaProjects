package Projekte.JavaLernen.Auswahlanweisungen.WiederstandRechner;
import java.util.Scanner;

public class WiederstandRechner {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Willkommen beim Wiederstandsrechner");

        //Variablendeklaration
        double Resistance1;
        double Resistance2;
        double Ohm = 0;
        String Option;

        //Anwendereingaben
        System.out.print("Bitte geben Sie den ersten Wiederstand ein!: ");
        Resistance1 = input.nextDouble();
        System.out.print("Bitte geben Sie den zweiten Wiederstand ein!: ");
        Resistance2 = input.nextDouble();
        System.out.print("Bitte geben sie an ob es eine Parallel oder Reihenschaltung (r/p) ist: ");
        Option = input.next();

        //Rechnung
        if (Option.equals("r") || Option.equals("R")) {
            Ohm = Resistance1 + Resistance2;
        } else if (Option.equals("p") || Option.equals("P") ) {
            Ohm = (Resistance1 * Resistance2) / (Resistance1 + Resistance2);
        } else {
            input.close();
            throw new IllegalArgumentException();
        }

        //Anwenderausgaben
        System.out.println("Die Berechneten Ohm sind " + Ohm);

        input.close();
    }
}
