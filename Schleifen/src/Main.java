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

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        for (int i = 20; i >= 1; i--){

            System.out.print(i + " ");
        }

        System.out.println();
        for (int i = 0; i < 10; i++) {
            for(int j = 1; j <= 10; j++){
                System.out.print("#");
            }
            System.out.println();

        }
/*  - gefüllt ja oder nein
    - das Symbol auswählen können
    - rahmenbreite wählen können
 */
    }
}
