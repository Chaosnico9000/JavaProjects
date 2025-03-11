package Projekte.JavaLernen.Schleifen.SternquardratUndMatrix;
import java.util.Scanner;

public class Sternquadrat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Willkommen beim Sternquadrat Rechner!");

        // Variablendeklaration
        int Seitenlänge;

        // Anwendereingaben
        System.out.print("Bitte geben Sie die Seitenlänge ein!: ");
        Seitenlänge = input.nextInt();

        // Validierung der Daten
        while (Seitenlänge < 1)
        {
            System.out.println("Die Seitenlänge muss größer als 0 sein!");
            System.out.print("Bitte geben Sie die Seitenlänge ein!: ");
            Seitenlänge = input.nextInt();
        }

        // Rechnung
        for (int i = 0; i < Seitenlänge; i++)
        {
            if (i == 0 || i == Seitenlänge - 1)
            {
                for (int j = 0; j < Seitenlänge; j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
            else
            {
                for (int j = 0; j < Seitenlänge; j++)
                {
                    if (j == 0 || j == Seitenlänge - 1)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
                
            }
        }

        // Anwenderausgaben
        System.out.println("");

        input.close();
    }
}