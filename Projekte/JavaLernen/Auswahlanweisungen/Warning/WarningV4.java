package Projekte.JavaLernen.Auswahlanweisungen.Warning;
import java.util.Scanner;

public class WarningV4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variablen
        int num;
        int maxnum;
        int minnum;

        //Anwendereingaben
        System.out.print("Bitte geben sie eine Zahl ein!: ");
        num = input.nextInt();
        System.out.print("Bitte geben sie eine Zahl ein für den Maximal Zulässigen Betrag!: ");
        maxnum = input.nextInt();
        System.out.print("Bitte geben sie eine Zahl ein für den Minimal Zulässigen Betrag!: ");
        minnum = input.nextInt();

        //Validierung der Anwendereingaben
        if (num > maxnum) {
            System.out.println("Warnung! sie haben eine Zahl von Größer " + maxnum + " eingegeben");
        } else if (num < minnum) {
            System.out.println("Warnung! sie haben eine Zahl von Kleiner " + minnum + " eingegeben");
        } else {
            System.out.println("Sie haben eine Zahl eingegeben zwischen " + minnum + " und " + maxnum + "! Super!");
        }
        input.close();
    }
}
