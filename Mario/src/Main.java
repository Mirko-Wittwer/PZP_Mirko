public class Main {

    public static void main(String[] args) {
        // Variablen definieren
        // Wir definieren die Unicode Zeichen in eigenen Variablen,
        // damit wir unseren Programmcode lesen können
        String name = "Mario";
        String euroZeichen = "\u20ac";
        String copyright = "\u00A9";
        // Alle Regeln für Print Ausdrücke gelten genau so für String Variablen
        String preisZeile = "Copyright: \t\t\t" + copyright + "PZP2019\n";


        // Titel des Bildes: "Mario vor einer Treppe"
        System.out.print("Titel des Bildes:\t\"Mrio vor einer Treppe!\"\n");  // \t Tab in der Ausgabe
        System.out.print("Copyright: \t\t\t" + copyright + "PZP2019\n");
        System.out.print(preisZeile);
        // \n innerhalb eines print oder println Ausdrucks führt zu einem zusätzlichen Zeilenumbruch
        System.out.println("                        ##\n                       ###\n     ( )              ####");
        // Mehrere Strings können innerhalb einer Ausgabe mit einem Pluszeichen (+) verbunden werden.
        System.out.println("      |              #####" + "\n" + "    -----           ######" + "\n " + "     |            #######");
        // Das nennt sich String Konkatenation
        System.out.print("      |   ");
        System.out.print("_____" );
        System.out.println("   ########");
        System.out.print("     / \\  ");
        System.out.print(" | |   ");
        System.out.println("#########");
        System.out.println("--------------------------");
        System.out.println("");

        System.out.println("Erste Zeichen auf der Konsole\nNachmittag Tag 1"); // \n fügt ein Zeilenumbruch, in System.out.println, ein
    }
}


