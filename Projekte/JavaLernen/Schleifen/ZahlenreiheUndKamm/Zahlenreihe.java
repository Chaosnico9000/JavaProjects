package Projekte.JavaLernen.Schleifen.ZahlenreiheUndKamm;
import java.util.Scanner;

public class Zahlenreihe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Willkommen bei Zahlenreihen generator");
        // Variablendeklaratio
        String temp = "";
        
        // Rechnung
        for (int i = 1; i<= 9; i++)
        {
            System.out.println(temp);
            temp += i;
        }
        System.out.println(temp);
        
        // Anwenderausgaben
        System.out.println("");

        input.close();
    }
}
