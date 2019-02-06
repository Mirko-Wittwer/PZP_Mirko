import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner einbinden
        // Zwei Zahlen einlesen als laenge und breite abspeichern


        /*Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie die Laenge ein: ");
        int laenge = sc.nextInt();

        System.out.println("Geben Sie die Breite ein: ");
        int breite = sc.nextInt();

        System.out.println("Länge: " + laenge + " Breite: " + breite");*/


        // Schleifen - For Schleife
        // Schleifenkopf:   1. Teil: Zählervariable und Startwert
        //                  2. Teil: Grenze (Möglich sind hier allle Operatoren <, <=, >, >=; ==, !=)
        //                  3. Teil: Anweisung nach einem Durchlauf

        /*  - gefüllt ja oder nein
        - das Symbol auswählen können
        - rahmenbreite wählen können
        */


        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie mit der Anzahl der Symbole die Laenge ein: ");
        int laenge = sc.nextInt();

        System.out.println("Also die Laenge lautet " + laenge + " Symbole. Gebe Sie die Breite ein: ");
        int breite = sc.nextInt();
        System.out.println("Also die Breite lautet " + breite + " Symbole. Soll die Figur gefüllt sein? Ja oder Nein?");
        String gefüllt = sc.next();


        if (gefüllt.equals("ja")) {
            System.out.println("Figur wird gefüllt.");

        } else {
            System.out.println("Figur wird nicht gefüllt.");
        }

        System.out.println("Mit welchem Symbol soll die Figur erstellt werden?");
        String symbol = sc.next();
        System.out.println("Ok, die Figur wird mit folgendem Symbol erstellt: " + symbol);

        if (gefüllt.equals("ja")) {
            System.out.println();
            for (int i = 0; i <= breite; i++) {
                for (int j = 0; j <= laenge; j++) {
                    System.out.print(symbol);
                }
                System.out.println();
            }
        } else {


        }


    }

}

