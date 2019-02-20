// Einbinden der Klasse Scanner
// Scanner wird benötigt um Eingaben anzunehmen
// Importanweisungen IMMER vor public class!
import java.util.Scanner;

// Klasse TicTacToe dient uns als Hülle für unser Programm
public class TicTacToeZustandsautomat {
    // Golbale Variablen
    // Zweidimensionales Array mit dem namen Feld: Speichert unser Spielfeld ab
    static int[][] feld = new int[3][3];
    // Scanner erstellen, damit wir Eingaben verarbeiten können
    static Scanner derScanner = new Scanner(System.in);
    // freiesFeld gibt an, ob noch mindestens ein freies Feld vorhanden ist
    static boolean freiesFeld = true;
    // aktSpieler wechselt zwischen 1 und -1
    static int aktSpieler = 1;
    // Zustandvariable
    static int zustand = 0;
    // Spielernamen
    static String nameSpieler1;
    static String nameSpieler2;

    // Einstiegspunkt unseres Programms: Wenn wir das Programm ausführen, wird hier begonnen
    public static void main(String[] args) {
        // Zustandsautomat
        while(zustand < 10) {
            switch(zustand) {
                // BootUp
                case 0:
                    bootUp();
                    zustand = 1;
                    break;
                // Spielernamen einlesen
                case 1:
                    leseSpielernamen();
                    zustand = 2;
                    break;
                // Koordinaten einlesen
                case 2:
                    gebeFeld();
                    leseKoordinaten(aktSpieler);
                    break;
                // Prüfungen ausführen
                case 3:
                    pruefeFeld();
                    pruefeGewonnen();
                    break;
                // Spieler 1 gewinnt
                case 4:
                    System.out.println(nameSpieler1 + " hat gewonnen!");
                    break;
                // Spieler 2 gewinnt
                case 5:
                    System.out.println(nameSpieler2 + " hat gewonnen!");
                    break;
                // Unentschieden
                case 6:
                    break;
                // Spiel wiederholen?
                case 7:
                    break;
                // Spiel beenden
                case 8:
                    break;
            }
        }


        // Spielfeld mit 0 füllen
        initFeld();

        // Spielablauf
        // Solange freiesFeld == true, wird die Schleife wiederholt
        while(freiesFeld) {
            // Ausgabe welcher Spieler ist am Zug?
            System.out.print("Spieler " + ((aktSpieler == 1) ? "1" : "2" ) + " ist am Zug!");
            // Alternative
            /* switch (aktSpieler) {
                case -1:
                    System.out.print("2");
                    break;
                case 1:
                    System.out.print("1");
                    break;
            }
            //System.out.print(((aktSpieler == 1) ? "1" : "2" ));
            System.out.println(" ist am Zug!"); */



            // Prüfe, ob noch freie Felder vorhanden
            pruefeFeld();
            // Prüfe, ob jemand gewonne hat
            pruefeGewonnen();
        }
        System.out.println("Keine freien Felder vorhanden!");
    }

    // Begrüßung zu Beginn
    static void bootUp() {
        System.out.println("TicTacToe V1.0");
    }

    // Koordinaten einlesen
    static void leseKoordinaten(int aktSpieler) {
        // Ausgabe des aktuellen Spielers
        System.out.println(((aktSpieler == 1) ? nameSpieler1 : nameSpieler2) + " ist an der Reihe!");
        // Benutzereingaben einlesen: An welche Position soll der Stein?
        System.out.print("X: ");
        int posX = derScanner.nextInt();
        System.out.print("Y: ");
        int posY = derScanner.nextInt();

        // Spielstein setzen
        // Da pruefeFeld(x,y) einen boolean zurückgibt,
        // können wir die Methode direkt in der if-Abfrage aufrufen.
        if(pruefeFeld(posX, posY)) {
            // setzeStein trägt einen Wert in unserem Spielfeld ein.
            setzeStein(posX, posY, aktSpieler);
            // Nachdem ein Stein erfolgreich gesetzt wurde, wird der Spieler getauscht.
            spielerWechseln();
            // Nach erfolgreichem Zug wollen wir in den nächsten Zustand
            zustand = 3;
        }
    }
    // Einlesen der Spielernamen
    static void leseSpielernamen() {
        System.out.println("Bitte Namen eingeben!");
        System.out.print("Spieler 1: ");
        nameSpieler1 = derScanner.nextLine();
        System.out.print("Spieler 2: ");
        nameSpieler2 = derScanner.nextLine();
    }

    // Einzelnes Feld prüfen
    static boolean pruefeFeld(int x, int y) {
        if(feld[x][y] == 0) {
            // Wenn Feld[x][y] 0 ist, dann ist es frei!
            return true;
            // Nachdem ein Return ausgeführt wurde, springt unser Programm zurück, von wo es kam.
        }
        // Wenn Feld[x][y] ungleich 0 ist, dann ist es belegt!
        return false;
        // else ist hier nicht nötig! Sobald return true ausgeführt wurde,
        // springt das Programm wieder zurück nach oben und kommt somit nie weiter.
        // Wenn das zu prüfende Feld ungleich 0 ist, wird return true gar nicht erst ausgeführt!
        // Somit wird return false zurückgegeben.
    }

    // Spieler wechseln
    static void spielerWechseln() {
        aktSpieler = (aktSpieler == 1) ? -1 : 1;       // Ternärer Operator
        // Bedingung ? Was, wenn Bedingung zutrifft : Was, wenn Bedingung nicht zutrifft
        // Kurzschreibweise für folgendes:
        /*
        if(aktSpieler == 1) {
            aktSpieler = -1;
        }
        else {
            aktSpieler = 1;
        }
         */
    }
    // Spielstein setzen
    static void setzeStein(int x, int y, int wert) {
        // An der Stelle x,y wird der wert eingetragen, den wir übergeben.
        // Das entspricht dem aktuellen Spieler, als 1 oder -1
        feld[x][y] = wert;
    }

    // Spielfeld initialisieren
    static void initFeld() {
        // Äußerer Zähler für die Reihen
        for(int y = 0; y < 3; y++) {
            // Inneren Zähler für die Zeichen innerhalb einer Reihe
            for(int x = 0; x < 3; x++) {
                // Bei jedem Durchgang wird das entsprechende Feld auf 0 gesetzt
                feld[x][y] = 0;
            }
        }
    }




    // Prüfe Feld: Überprüft, ob noch freie Felder vorhanden sind
    // Wenn keine freien Felder gefunden wurde, dann ist unentschieden.
    static void pruefeFeld() {
        // Da wir ein zweidimensionales Array haben, brauchen wir zwei Zähler
        // Einen äußeren, für die Reihen ...
        for(int y = 0; y < 3; y++) {
            // ... und einen inneren, für die Spalten (Positionen in der Reihe)
            for(int x = 0; x < 3; x++) {
                // Wir überprüfen, ob das Feld, auf das die Methode gerade schaut 0 ist
                // Wenn ja, ...
                if(feld[x][y] == 0) {
                    // dann wurde ein freies Feld gefunden
                    // und wir können die Suche nach weiteren freien Feldern abbrechen,
                    // denn es ist uns nicht wichtig, ob ein oder mehrere freie Felder vorhanden sind,
                    // relevant ist nur, DASS mindestens eines frei ist.
                    return;
                    // Mit dem return Statement springen zurück in unser Hauptprogramm
                }
            }
        }

        // Es wurde kein Freies Feld gefunden
        // Wenn die Methode bis jetzt noch nicht abgebrochen wurde,
        // dann wurde kein freies Feld gefunden.
        // Daraus folgt => freiesFeld = false;
        freiesFeld = false;
    }

    // Spielfeld ausgeben
    static void gebeFeld() {
        // Wir erinnern uns an das Zeichnen der Rechtecke
        // Äußer Schleife ist für die Reihen
        // Wir beginnen bei zwei und enden bei 0, das Feld[0][0] unten Links sein soll
        // und das Feld [2][2] oben rechts
        for(int y = 2; y >= 0; y--) {
            // Innere Schleife ist für die Zeichen innerhalb einer Reihe
            // Wir geben die Zeichen von links nach rechts aus
            for(int x = 0; x < 3; x++) {
                // Vor jedem Zeichen (X, O, oder ein Leerzeichen) kommt eine eckige Klammer
                System.out.print("[");
                // Dann kommt unser jeweiliges Zeichen
                switch(feld[x][y]){
                    // Wenn Spieler 1 das Feld belegt hat, soll ein X ausgegeben werden
                    case 1:
                        System.out.print("X");
                        break;
                    // Wenn Spieler 2 das Feld belegt hat, soll ein O ausgegeben werden
                    case -1:
                        System.out.print("O");
                        break;
                    // Wenn das Feld nicht belegt ist, soll ein Leerzeichen ausgegeben werden
                    case 0:
                        System.out.print(" ");
                        break;
                }
                // Nach jedem Zeichen, soll eine eckige Klammer ausgegeben werden.
                System.out.print("]");
            }
            // Nach jeder fertigen Zeile, soll ein Umbruch dafür sorgen,
            // dass wir in die nächste Zeile springen
            System.out.println();
        }
    }

    static void pruefeGewonnen() {
        pruefeReihen();
        pruefeSpalten();
        pruefeDiagonalen();
    }

    static void pruefeReihen() {
        int reihe = 0;
        // Äußerer Zähler: Zeilen
        // 0: Unterste Zeile
        // 1: Mittlere Zeile
        // 2: Obere Zeile
        for(int y = 0; y < 3; y++) {
            // Innerer Zähler: Zeichen innerhalb einer Zeile
            // 0: Linkes Zeichen
            // 1: Zeichen in der Mitte
            // 2: Rechte Zeichen
            for (int x = 0; x < 3; x++) {
                // Wert aus entsprechendem Feld wird auf die Variable reihe addiert
                reihe += feld[x][y];
            }
            // Wenn reihe 3 oder -3 ergibt, haben wir einen Gewinner
            if (reihe == 3) {
                zustand = 4;
            } else if (reihe == -3) {
                zustand = 5;
            }
            // Wenn wir mit der Prüfung einer Reihe fertig sind, dürfen wir nicht vergessen
            // die Variable reihe wieder auf 0 zu setzen, da wir sonst Ergebnisse aus der einen Reihe
            // mit in die nächste addieren.
            reihe = 0;
        }

        zustand = 2;
    }

    static void pruefeSpalten() {
        int spalte = 0;
        // Äußerer Zähler: Reihen
        // 0: Linke Reihe
        // 1: Mittlere Reihe
        // 2: Rechte Reihe
        for(int x = 0; x < 3; x++) {
            // Innerer Zähler: Zeichen innerhalb einer Spalte
            // 0: Unterstes Zeichen
            // 1: Zeichen in der Mitte
            // 2: Oberstes Zeichen
            for (int y = 0; y < 3; y++) {
                // Wert aus entsprechendem Feld wird auf die Variable spalte addiert
                spalte += feld[x][y];
            }
            // Wenn reihe 3 oder -3 ergibt, haben wir einen Gewinner
            if (spalte == 3) {
                zustand = 4;
            } else if (spalte == -3) {
                zustand = 5;
            }
            // Wenn wir mit der Prüfung einer Spalte fertig sind, dürfen wir nicht vergessen
            // die Variable spalte wieder auf 0 zu setzen, da wir sonst Ergebnisse aus der einen Spalte
            // mit in die nächste addieren.
            spalte = 0;
        }

        zustand = 2;
    }

    static void pruefeDiagonalen() {
        // Diagonale links unten nach rechts oben
        int diagonale = 0;
        // Diagonlae links oben nach rechts unten
        int diagonale2 = 0;

        // Wir brauchen nur einen Zähler, da x und y immer gleich sind ([0][0],[1][1],[2][2])
        for(int d = 0; d < 3; d++) {
            diagonale += feld[d][d];    // diagonale  = feld[0][0] + feld[1][1] + feld[2][2]
            diagonale2 += feld[d][2-d]; // diagonale2 = feld[0][2] + feld[1][1] + feld[2][0]
        }
        if (diagonale == 3 || diagonale2 == 3) {
            zustand = 4;
        } else if (diagonale == -3 || diagonale2 == -3) {
            zustand = 5;
        }
        zustand = 2;
    }
}

