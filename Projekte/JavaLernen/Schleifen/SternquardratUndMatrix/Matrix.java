package Projekte.JavaLernen.Schleifen.SternquardratUndMatrix;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Willkommen beim Matrix Rechner!");

        // Variablendeklaration
        int zähler = 0;
        int zahl;

        // Anwendereingaben
        System.out.print("Bitte geben Sie die Zahl ein!: ");
        zahl = input.nextInt();

        // Validierung der Daten
        while (zahl < 0 || zahl > 9)
        {
            System.out.println("Die Zahl muss zwischen 0 und 9 liegen!");
            System.out.print("Bitte geben Sie die Zahl ein!: ");
            zahl = input.nextInt();
        }

        // Rechnung
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if (i == 0) 
                {
                    if (zähler % zahl == 0 || Integer.toString(zähler).contains(Integer.toString(zahl)))
                    {
                        System.out.print("*  ");
                    }
                    else
                    {
                        System.out.print(zähler + "  ");
                    }
                }
                else
                {
                    if (zähler % zahl == 0 || Integer.toString(zähler).contains(Integer.toString(zahl)))
                    {
                        System.out.print("*  ");
                    }
                    else
                    {
                        System.out.print(zähler + " ");
                    }
                }
                zähler++;
            }
            System.out.println("");
        }

        // Anwenderausgaben
        System.out.println("");

        input.close();
    }
}
