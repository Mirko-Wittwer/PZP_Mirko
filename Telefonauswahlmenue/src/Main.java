import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Telefonmenü
        // 1 - Info über Produkte
            // 1 - Neues Microsoft Surface
            // 2 - Neues Office Suite
            // 3 - Zurück zum Hauptmenü
        // 2 - Produktregistrierung
            // 1 - Frage nach der Seriennummer
            // 2 - Ausgabe: Seriennummer wurde aktiviert
        // 3 - Verbindung zum Kundensupport
        // 4 - Beenden


        Scanner sc = new Scanner(System.in);



        boolean nochmal = true;



        while (nochmal){
            System.out.println("Wählen Sie zwischen: \n 1. Info über Produkte. \n 2. Produktregistrierung. \n 3. Verbindung zum Kundensupport. \n 4. Beenden.");

            int auswahl = sc.nextInt();

            switch (auswahl){

                case 1:
                    System.out.println("Info über Produkte");
                    System.out.println("1. Neues Microsoft Surface");
                    System.out.println("2. Neues Office Suite");
                    System.out.println("3. Zurück zum Hauptmenü");
                    int auswahl2 = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Produktregistrierung");
                    System.out.println("1. Frage nach der Seriennummer");
                    System.out.println("2. Ausgabe: Seriennummer wurde aktiviert");
                    System.out.println("3. Zurück zum Hauptmenü");
                    int auswahl3 = sc.nextInt();
                    break;
                case 3:
                    System.out.println("Verbindung zum Kundensupport");
                    int auswahl4 = sc.nextInt();
                    break;
                case 4:
                    System.out.println("Benden");
                    int auswahl5 = sc.nextInt();
                    break;

            }

        }


        }
    }