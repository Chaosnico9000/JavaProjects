package Projekte.Grundgerüste;
public class GrundgeruestC
{  
  public static void main(String[] args) 
  {
    //Variablendeklaration
    int zahl1;
    double zahl2;
    double ergebnis;
    String name;
    char buchstabe;
    
    //Initialisierung mit Anwendereingaben  
    System.out.println("Bitte Namen eingeben: ");
    name = System.console().readLine();  
    System.out.println("Bitte Zahl1 eingeben: ");
    zahl1 = Integer.parseInt(System.console().readLine());
    System.out.println("Bitte Zahl2 eingeben: ");
    zahl2 = Double.parseDouble(System.console().readLine());
    System.out.println("Bitte Buchstabe eingeben: ");
    buchstabe = System.console().readLine().charAt(0); 
       
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

