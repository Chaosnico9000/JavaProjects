package Projekte.JavaLernen.Schleifen.Kalender;
import java.util.Scanner;

public class Kalender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Willkommen beim Programm Kalender!");

        // Variablendeklaration
        int DaysOfMonth;

        // Rechnung
        for (int i = 0; i < 12; i++)
        {
            if (i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11)
            {
                DaysOfMonth = 31;
            }
            else if (i == 1)
            {
                DaysOfMonth = 28;
            }
            else
            {
                DaysOfMonth = 30;
                
            }
            for (int j = 0; j < DaysOfMonth; j++)
            {
                System.out.println("Monat: " + (i + 1) + ", Tag: " + (j + 1));
            }
        }

        // Anwenderausgaben
        System.out.println("");

        input.close();
    }
}