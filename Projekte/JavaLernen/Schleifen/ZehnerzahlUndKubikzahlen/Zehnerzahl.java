package Projekte.JavaLernen.Schleifen.ZehnerzahlUndKubikzahlen;
import java.util.Scanner;

public class Zehnerzahl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Willkommen bei Zehnerzahlen von 1 bis 100");

        //Rechnung
        for (   int i = 0; i <= 100; i++ )
        {
            if (i % 10 == 0) 
            {
                System.out.println(i + " Zehnerzahl");
            }
            else
            {
                System.out.println(i);
            }
        }

        System.out.println("");

        input.close();
    }
}
