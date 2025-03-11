package Projekte.JavaLernen.Schleifen.ZahlenreiheUndKamm;
import java.util.Scanner;

public class Kamm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Willkommen beim Kamm Rechner!");

        // Variablendeklaration
        int zinken;
        int länge;
        int abstand;

        // Anwendereingaben
        System.out.print("Bitte geben Sie die anzahl der Zinken ein!: ");
        zinken = input.nextInt();
        System.out.print("Bitte geben Sie die länge des Kamms ein!: ");
        länge = input.nextInt();
        System.out.print("Bitte geben Sie die den Abstand zwischen den Zinken ein!: ");
        abstand = input.nextInt();

        // Rechnung
        for (int i = 0; i < zinken; i++)
        {
            for (int j = 0; j < länge; j++)
            {
                System.out.print("*");
                if (j == länge - 2)
                {
                    System.out.print(" *");
                    break;
                }
            }
            System.out.println("");
            for(int k = 0; k < abstand; k++)
            {
                System.out.println("*");
            }
        }

        // Anwenderausgaben
        System.out.println("");

        input.close();
    }
}
