package Projekte.Grundgerüste;
import java.util.Scanner;

public class GrundgeruestS
{  
  public static void main(String[] args) 
  {
    try (Scanner input = new Scanner(System.in)) {
      //Variablendeklaration
      int zahl1;
      double zahl2;
      double ergebnis;
      String name;
      char buchstabe;
      
      //Initialisierung mit Anwendereingaben  
      System.out.print("Bitte geben Sie Ihren Namen ein: ");
      name = input.next();
      System.out.print("Bitte geben Sie Zahl 1 ein: ");    
      zahl1 = input.nextInt();
      System.out.print("Bitte geben Sie Zahl 2 ein: ");    
      zahl2 = input.nextDouble();    
      System.out.print("Bitte geben Sie einen Buchstaben ein: ");   
      buchstabe = input.next().charAt(0);

      //Rechnung
      ergebnis = zahl1 + zahl2;

      //Ausgabe in der Konsole
      System.out.println("Namen: " + name);
      System.out.println("Buchstabe: " + buchstabe);    
      System.out.println("Zahl1: " + zahl1);
      System.out.println("Zahl2: " + zahl2);
      System.out.println(zahl1 + " + " + zahl2 + " = " + ergebnis);
    } 
  }
}

