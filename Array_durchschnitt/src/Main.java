import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random zufall = new Random();


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

        System.out.println();







        }


    }

