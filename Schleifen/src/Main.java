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

        System.out.println("Geben Sie die Laenge ein: ");
        int laenge = sc.nextInt();

        System.out.println("Also die Laenge lautet " + laenge + ". Gebe Sie die Breite ein: ");
        int breite = sc.nextInt();
        System.out.println("Die Breite lautet " + breite + ". Soll die Figur gefüllt sein? Ja oder Nein?");
        String gefüllt = sc.next();


        // Gefülltes Rechteck
        if (gefüllt.equals("ja")) {
            System.out.println(" ");

        } else {
            System.out.println("Figur wird nicht gefüllt.");
            System.out.println();
        }

        System.out.println("Mit welchem Symbol soll die Figur erstellt werden?");
        String symbol = sc.next();
        System.out.println("Ok, die Figur wird mit folgendem Symbol erstellt: " + symbol);

        if (gefüllt.equals("ja")) {

            // Gefülltes Rechteck
            System.out.println();
            for (int i = 0; i < breite; i++) {
                for (int j = 0; j < laenge; j++) {
                    System.out.print(symbol);
                }
                System.out.println();

            }
        } else {

            // Ungefülltes Rechteck
            // Erste Zeile
            System.out.println("Geben Sie die Rahmenstärke an: ");
            int rahmen = sc.nextInt();
            for (int a = 0; a < rahmen; a++) {
                for (int b = 1; b <= breite; b++) {
                    System.out.print(symbol);
                }
                System.out.println();
            }

            // 2. - vorletzte Zeile
            for (int c = 1; c <= breite - rahmen * 2; c++) {
                // Rahmen Teil 1
                for (int g = 0; g <= rahmen; g++) {
                    System.out.println(symbol);
                }
                // Aussparung
                for (int d = 1; d <= laenge - rahmen * 2; d++) {
                    System.out.println(" ");
                }
                // Rahmen Teil 2
                for (int h = 1; h <= rahmen; h++) {
                    System.out.println(symbol);
                }
                // Zeilenumbruch Ende der Zeile
                System.out.println();
            }

            // Letzte Zeile
            for (int e = 0; e <= rahmen; e++) {
                for (int f = 1; f <= laenge - 2; f++) {
                    System.out.print(symbol);
                }
            }
            // Ende der Zeile
            System.out.println();

        }


    }

}

