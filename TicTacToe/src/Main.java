public class Main {

    // Globale Variablen
    static int[][] feld = new int[3][3];

    public static void main(String[] args) {

        // Aufruf von Speilfeld
        initFeld();

        // Spielstein setzen
        setzeStein(0, 0, 1);

        // Spielfeld ausgeben
        gebeSpielfeld();

    }

    // Spielstein setzen
    static void setzeStein(int x, int y, int wert){
        feld[x][y] = wert;
    }

    //Spielfeld initialisieren
    static void initFeld() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                feld[x][y] = 0;

            }
        }
    }

    // Spielfeld ausgeben
    static void gebeSpielfeld() {
        for (int y = 2; y >= 0; y--) {
            for (int x = 0; x < 3; x++) {
                System.out.print("[");
                switch (feld[x][y]) {
                    case 1:
                        System.out.print("X");
                        break;
                    case -1:
                        System.out.print("0");
                        break;
                    case 0:
                        System.out.print(" ");
                        break;
                }
                System.out.print("]");
            }
            System.out.println();
        }

    }
}
