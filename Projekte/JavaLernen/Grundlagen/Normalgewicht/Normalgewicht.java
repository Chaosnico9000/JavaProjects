package Projekte.JavaLernen.Grundlagen.Normalgewicht;
import java.util.Scanner;

public class Normalgewicht {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Eingabe von Gewicht und Größe
        System.out.print("Bitte geben Sie Ihr Gewicht in kg ein: ");
        double gewicht = input.nextDouble();
        
        System.out.print("Bitte geben Sie Ihre Größe in m ein: ");
        double größe = input.nextDouble();
        
        System.out.print("Bitte geben Sie Ihr Alter ein: ");
        int alter = input.nextInt();
        
        System.out.print("Bitte geben Sie Ihr Geschlecht (m für männlich, w für weiblich) ein: ");
        char geschlecht = input.next().charAt(0);

        // Berechnungen
        double bmi = berechneBMI(gewicht, größe);
        double bsa = berechneBSA(gewicht, größe);
        double grundumsatz = berechneGrundumsatz(gewicht, größe, alter, geschlecht);
        double idealgewicht = berechneIdealgewicht(größe, geschlecht);

        // Ergebnisse ausgeben
        System.out.printf("Ihr Body-Mass-Index (BMI) beträgt: %.2f%n", bmi);
        System.out.printf("Ihre Körperoberfläche (BSA) beträgt: %.2f m²%n", bsa);
        System.out.printf("Ihr Grundumsatz beträgt: %.2f kcal/Tag%n", grundumsatz);
        System.out.printf("Ihr Idealgewicht beträgt: %.2f kg%n", idealgewicht);

        input.close();
    }

    // BMI = Gewicht (kg) / (Größe (m) ^ 2)
    public static double berechneBMI(double gewicht, double größe) {
        return gewicht / (größe * größe);
    }

    // BSA nach Du Bois Formel
    public static double berechneBSA(double gewicht, double größe) {
        return 0.007184 * Math.pow(gewicht, 0.425) * Math.pow(größe * 100, 0.725); // Größe in cm
    }

    // Grundumsatz nach Harris-Benedict-Formel
    public static double berechneGrundumsatz(double gewicht, double größe, int alter, char geschlecht) {
        if (geschlecht == 'm') {
            return 88.362 + (13.397 * gewicht) + (4.799 * größe * 100) - (5.677 * alter); // Größe in cm
        } else {
            return 447.593 + (9.247 * gewicht) + (3.098 * größe * 100) - (4.330 * alter); // Größe in cm
        }
    }

    // Idealgewicht nach Broca-Formel
    public static double berechneIdealgewicht(double größe, char geschlecht) {
        if (geschlecht == 'm') {
            return (größe * 100) - 100; // Größe in cm
        } else {
            return (größe * 100) - 105; // Größe in cm
        }
    }
}

