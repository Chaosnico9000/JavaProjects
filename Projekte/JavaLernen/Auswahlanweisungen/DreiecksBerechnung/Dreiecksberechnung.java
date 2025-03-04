package Projekte.JavaLernen.Auswahlanweisungen.DreiecksBerechnung;
import java.util.Scanner;

public class Dreiecksberechnung {
 public static void main(String[] args)
 {
    Scanner input = new Scanner(System.in);
    System.out.println("Willkommen bei Ihren persöhnlichen Dreiecksrechner");
    //Variablendeklaration
    Double SiteA;
    Double SiteB;
    Double SiteC;
    Boolean Check = true;

    //Anwendereingaben
    System.out.print("Geben sie die Seite A an!: ");
    SiteA = input.nextDouble();
    System.out.print("Geben sie die Seite B an!: ");
    SiteB = input.nextDouble();
    System.out.print("Geben sie die Seite C an!: ");
    SiteC = input.nextDouble();

    //Validierung der Anwendereingaben
    if ((SiteA+SiteB)<SiteC) {
        Check = false;
    } else if ((SiteA+SiteC)<SiteB) {
        Check = false;
    } else if ((SiteB+SiteC)<SiteA) {
        Check = false;
    } else {
        Check = true;
    }

    if (Check == true) {
        System.out.println("Das Dreieck ist Konstruierbar!");
    } else {
        System.out.println("Das Dreieck ist NICHT Konstruierbar!");
    }
    input.close();
 }
}
