import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Erstellung von Objekten
        Durchschnitt derDurchschnitt = new Durchschnitt();
        Durchschnitt derDurchschnitt2 = new Durchschnitt();

        //Zugriff auf unsere Methode aus der Klasse Durchschnitt
        derDurchschnitt.gebeText();
        System.out.println(derDurchschnitt.zahl);
        derDurchschnitt2.zahl = 20;
        System.out.println(derDurchschnitt2.zahl);

        derDurchschnitt.berechneDurchschnitt();
        derDurchschnitt.druckeDurchschnitt();

        // Übergabe von Parametern zwischen Klassen
        derDurchschnitt.druckeText("Unser erster Parameter.", 2);

        // Holen von Werten aus anderen Objekten
        System.out.println(derDurchschnitt.gebeText2());







       /* Random zufall = new Random();


        int[] zahl = new int[10];       // größes des Array deklariert
        double ergebnis = 0;
        double durchschnitt = 0;


        for (int i = 0; i < zahl.length; i++) {
            zahl[i] = zufall.nextInt(20);
            System.out.print(zahl[i] + " ");
            ergebnis += zahl[i];

        }

        System.out.println("\n" + ergebnis);

        durchschnitt = ergebnis / zahl.length;

        System.out.printf("Der Durchschnitt lautet: %.2f", durchschnitt);

        System.out.println();*/


    }


}

