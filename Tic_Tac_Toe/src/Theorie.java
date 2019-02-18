public class Theorie {
    public static void main(String[] args) {
        // Variablen
//        int zahl1 = 5;
//        int zahl2 = 10;
//        int zahl3 = 4;
//
//        System.out.println(zahl1);
//        System.out.println(zahl2);
//        System.out.println(zahl3);
//
//        // Arrays
//        int[] zahlen = new int[5];
//        zahlen[0] = 5;
//        zahlen[1] = 6;
//        zahlen[2] = 3;
//        zahlen[3] = 2;
//        zahlen[4] = 0;
//
//        System.out.println(zahlen[0]);
//        System.out.println(zahlen[1]);
//        System.out.println(zahlen[2]);
//        System.out.println(zahlen[3]);
//        System.out.println(zahlen[4]);
//
//        String[] namen = new String[7];
//        namen[0] = "Hänsel";
//        namen[1] = "Gretel";
//        namen[2] = "Maria";
//        namen[3] = "Alex";
//        namen[4] = "Axel";
//        namen[5] = "Max";
//        namen[6] = "Peter";
//
//        System.out.println(namen[2] + " und " + namen[4] + " gehen in den Wald!");
//
//        for(int i = 0; i < 3; i++) {
//            System.out.println(namen[i]);
//        }
//
//        // Zweidimensionales Array
//        // Erste Dimension: Spalten (X Wert)
//        // Zweite Dimension: Reihen (Y Wert)
//
//        int[][] feld= new int[3][3];
//
//        feld[0][0] = 1;
//        feld[0][2] = -1;
//        feld[0][1] = 1;
//        feld[1][2] = -1;
//        feld[1][1] = 1;

//        // Schleifen abbrechen
//        for (int i = 1; i <= 50; i++) {
//            System.out.println(i);
//            if(i == 20) {
//                break;
//            }
//        }

     //   String meinString = "Hallo PZP_FEB19";
    //    gebeAus(meinString, "Wie geht's?");
        System.out.println(addiere(10,15));

    }

    // Methode mit Parameter
    static void gebeAus(String ausgabe, String ausgabe2) {
        System.out.println(ausgabe);
        System.out.println(ausgabe2);
    }

    // Methode mit Rückgabetyp
    static String gebeTextZurueck() {
        return "Unsere zweite Rückgabe";
    }

    // Methode mit Rückgabetyp und Parameter
    static int addiere(int a, int b) {
        return a+b;
    }
}
