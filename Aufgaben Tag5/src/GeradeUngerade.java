import java.util.Scanner;

public class GeradeUngerade {

    public static void main(String[] args) {
        Scanner derScanner = new Scanner(System.in);

        System.out.println("Erste Methode");
        System.out.print("Zu prüfende Zahl: ");
        int zahl = derScanner.nextInt();

        // Gerade
        if(zahl % 2 == 0) {
            System.out.println(zahl + " ist gerade!");
        }
        // Ungerade
        else {
            System.out.println(zahl + " ist ungerade!");
        }

        // Zweite Möglichkeit

        // Was passiert, wenn Kommazahlen in int Variablen abgespeichert werden?
        // int zahl = 7 / 2 ( = 3)
        // Wir speichern die Division in einer Int Variable
        // Wir multiplizieren wieder mit 2
        // Wenn das Ergebnis gleich dem Ausganswert ist, dann ist die Zahl gerade
        System.out.println("\nZweite Methode");

        System.out.print("Zu prüfende Zahl: ");
        zahl = derScanner.nextInt();
        int ergebnis = zahl / 2;

        // Gerade
        if(ergebnis * 2 == zahl) {
            System.out.println(zahl + " ist gerade!");
        }
        // Ungerade
        else {
            System.out.println(zahl + " ist ungerade!");
        }
        System.out.println(zahl + " : 2 = " + ergebnis);

        // Dritte Möglichkeit: Prüfung des letzten Bits

        System.out.println("\nDritte Methode");

        System.out.print("Zu prüfende Zahl: ");
        zahl = derScanner.nextInt();

        if((zahl & 1) == 0) {
            System.out.println(zahl + " ist gerade!");
        }
        else {
            System.out.println(zahl + " ist ungerade!");
        }
    }
}
