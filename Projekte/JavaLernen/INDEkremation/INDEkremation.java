package Projekte.JavaLernen.INDEkremation;

public class INDEkremation {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;
        int d = 5;

        // Postinkrement
        System.out.println("Postinkrement: " + (a++));  // Ausgabe: 5, a ist danach 6
        System.out.println("a nach Postinkrement: " + a);  // Ausgabe: 6

        // Präinkrement
        System.out.println("Präinkrement: " + (++b));  // Ausgabe: 6, b ist 6

        // Postdekrement
        System.out.println("Postdekrement: " + (c--));  // Ausgabe: 5, c ist danach 4
        System.out.println("c nach Postdekrement: " + c);  // Ausgabe: 4

        // Prädekrement
        System.out.println("Prädekrement: " + (--d));  // Ausgabe: 4, d ist 4
    }
}
