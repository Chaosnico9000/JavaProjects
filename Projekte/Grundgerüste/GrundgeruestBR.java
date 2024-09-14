package Projekte.Grundgerüste;
import java.io.*;

public class GrundgeruestBR
{
  public static void main(String[] args) throws IOException 
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    //Variablendeklaration
    int zahl1 = 0;
    double zahl2 = 0;
    double ergebnis;
    String name;
    char buchstabe = 'a';
    
    //Initialisierung mit Anwendereingaben     
    System.out.print("Bitte geben Sie Ihren Namen ein: ");
    name = input.readLine();
    System.out.print("Bitte geben Sie Zahl 1 ein: ");    
    zahl1 = Integer.parseInt(input.readLine());   
    System.out.print("Bitte geben Sie Zahl 2 ein: ");    
    zahl2 = Double.parseDouble(input.readLine());        
    System.out.print("Bitte geben Sie einen Buchstaben ein: ");
    buchstabe = input.readLine().charAt(0);    

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

