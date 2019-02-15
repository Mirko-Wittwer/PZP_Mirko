import java.util.Scanner;
public class TicTacToe {
    // Golbale Variablen
    static int[][] feld = new int[3][3];
    static Scanner derScanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Spielfeld mit 0 füllen
        initFeld();
        // Spielstein setzen
        System.out.print("X: ");
        int x = derScanner.nextInt();
        System.out.print("Y: ");
        int y = derScanner.nextInt();

        setzeStein(x, y, 1);
        // Spielfeld ausgeben
        gebeFeld();
    }

    // Spielstein setzen
    static void setzeStein(int x, int y, int wert) {
        feld[x][y] = wert;
    }

    // Spielfeld initialisieren
    static void initFeld() {
        for(int y = 0; y < 3; y++) {
            for(int x = 0; x < 3; x++) {
                feld[x][y] = 0;
            }
        }
    }

    // Spielfeld ausgeben
    static void gebeFeld() {
        for(int y = 2; y >= 0; y--) {
            for(int x = 0; x < 3; x++) {
                System.out.print("[");
                switch(feld[x][y]){
                    case 1:
                        System.out.print("X");
                        break;
                    case -1:
                        System.out.print("O");
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

