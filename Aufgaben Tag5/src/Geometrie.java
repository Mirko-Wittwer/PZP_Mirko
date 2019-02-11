import java.util.Scanner;

public class Geometrie {
    // Dreieck
    static int hoehe;
    static Scanner derScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Höhe des Dreieicks: ");
        hoehe = derScanner.nextInt();

        zeichneDreieckLinksOrientiert();
        zeichneDreieckRechtsOrientiert();
        zeichneDreieckMittigOrientiert();
        zeichneDreieckLinksOrientiertZahlen();
    }

    static void zeichneDreieckLinksOrientiert() {
        // Zeilen
        for(int i = 1; i <= hoehe; i++) {
            // Zeichen innerhalb einer Zeile
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    static void zeichneDreieckRechtsOrientiert() {
        for(int i = 1; i <= hoehe; i++) {
            // 1. Leerzeichen einfügen
            for(int j = hoehe - i; j >= 1; j -- ) {
                System.out.print("  ");
            }
            // 2. Rauten einfügen
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }



            System.out.println();
        }
    }

    static void zeichneDreieckMittigOrientiert() {
        for (int i = 1; i <= hoehe; i++) {
            for (int j = 1; j <= hoehe - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    static void zeichneDreieckMittigOrientiertZahlen() {
        for (int i = 1; i <= hoehe; i++) {
            for (int j = 1; j <= hoehe - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    static void zeichneDreieckRechtsOrientiertZahlen() {
        for(int i = 1; i <= hoehe; i++) {
            // 1. Leerzeichen einfügen
            for(int j = hoehe - i; j >= 1; j -- ) {
                System.out.print("  ");
            }
            // 2. Rauten einfügen
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }



            System.out.println();
        }
    }
    static void zeichneDreieckLinksOrientiertZahlen() {
        for(int i = 1; i <= hoehe; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i % 10) + " ");
            }
            System.out.println();
        }
    }
}
