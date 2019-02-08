import java.util.Scanner;

public class Main {

    // Länge und Breite deklarieren
    static int laenge;
    static int breite;
    static Scanner sc = new Scanner(System.in);
    static String gefuellt;
    static String symbol;

    public static void main(String[] args) {

        /*
        Schleifen - For Schleife
        Schleifenkopf:      1. Teil: Zählervariable und Startwert
                            2. Teil: Grenze (Möglich sind hier allle Operatoren <, <=, >, >=; ==, !=)
                            3. Teil: Anweisung nach einem Durchlauf
        Scanner einbinden
        Zwei Zahlen einlesen als laenge und breite abspeichern
        - gefüllt ja oder nein
        - das Symbol auswählen können
        - rahmenbreite wählen können
        */

        willkommen();
        leseLaengeBreite();
        abfrageFuellung();
        zeichnenRechteck();
        beende();

    }

    static void willkommen(){
        System.out.println("Geometrie Zeichner V1.0");
    }

    static void leseLaengeBreite(){
        // 1. Länge und Breite einlesen
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie die Breite ein.");
        breite = sc.nextInt();

        System.out.println("Also die Breite lautet " + breite + ". Gebe Sie die Laenge ein.");
        laenge = sc.nextInt();
        System.out.println("Die Laenge lautet " + laenge + ". Soll die Figur ausgefüllt werden? Ja oder Nein?");
        gefuellt = sc.next();

    }

    static void abfrageFuellung(){
        if (gefuellt.equals("ja")) {
            System.out.println("Ok, die Figur wurd ausgefüllt.");
            System.out.println();

        } else {
            System.out.println("Figur wird nicht gefüllt.");
            System.out.println();
        }

        System.out.println("Mit welchem Symbol soll die Figur erstellt werden?");
        symbol = sc.next();
        System.out.println("Ok, die Figur wird mit folgendem Symbol erstellt: " + symbol);
        System.out.println();

    }

    static void zeichnenRechteck() {







        if (gefuellt.equals("ja")) {

            // Gefülltes Rechteck
            System.out.println();
            for (int a = 0; a < laenge; a++) {
                for (int b = 0; b < breite; b++) {
                    System.out.print(symbol);
                }
                System.out.println();

            }
        } else {

            System.out.println("Geben Sie den Rahmen an.");
            int rahmen = sc.nextInt();
            // 3. Ungefülltes Rechteck
            // Erste Zeile
            for (int b = 0; b < rahmen; b++) {
                for (int c = 0; c < breite; c++) {
                    System.out.print(symbol);
                }
                System.out.println();
            }

            // Rahmen 1. Teil
            for (int d = 0; d < laenge - rahmen * 2; d++) {
                for (int e = 0; e < rahmen; e++) {
                    System.out.print(symbol);
                }
                // Aussparung
                for (int f = 0; f < breite - rahmen * 2; f++) {
                    System.out.print(" ");
                }

                for (int g = 0; g < rahmen; g++) {
                    System.out.print(symbol);
                }

                System.out.println();

            }

            // Letzte Zeile
            for (int z = 0; z < rahmen; z++) {
                for (int y = 0; y < breite; y++) {
                    System.out.print(symbol);
                }
                System.out.println();
            }

        }


    }

    static void beende(){
        System.out.println("Das Programm ist beendet.");
    }

}

