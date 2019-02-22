public class Main {

    public static void main(String[] args) {

        // Erstellen Sie eine neue Klasse auto
        // Attribute: String marke, String modell, String farbe
        // Davon ein Objekt AudiA4
        // Objekt BMW3er
        // Objekt AudiA6

        // Zwei weitere Attribute erstellen
        // mit Tankvolumen und Verbrauch

        // Methoden -> Berechnung der Reichweite (Tankvolumen / Verbrauch * 100 => 30l / 6l/100km * 100 = 500km)

        // Aufgabe: Attribute -> tankStand
        // gebeAktuelleReichweite -> aktuelle Reichweite berechnen und zurückgeben
        // fahre(Anzahl km) -> soll berechnen, wie viel Liter die gefahrene Strecke benötigt und diesen Wert vom tankStand abziehen

        // tanke(Anzahl in litern) -> Die Liter sollen dem Tankstand hinzugefügt werden

        // Erstellen von Objekten
        Auto AudiA4 = new Auto();
        Auto AudiA6 = new Auto();
        Auto BMW3er = new Auto();

        AudiA4.marke = "Audi";
        AudiA4.modell = "A4";
        AudiA4.farbe = "blau";
        AudiA4.serienNummer = "FZD5688974";
        AudiA4.tankVolumen = 64;
        AudiA4.verbrauch = 6.3;
        AudiA4.tankStand = 57;
        AudiA4.geplanteStrecke = 21;

        AudiA6.marke = "Audi";
        AudiA6.modell = "A6";
        AudiA6.farbe = "gelb";
        AudiA6.serienNummer = "DFGH5895642532";
        AudiA6.tankVolumen = 50;
        AudiA6.verbrauch = 5.6;
        AudiA6.tankStand = 33;
        AudiA6.geplanteStrecke = 359;

        BMW3er.marke = "BMW";
        BMW3er.modell = "3er";
        BMW3er.farbe = "schwarz";
        BMW3er.serienNummer = "JIUT456855";
        BMW3er.tankVolumen = 77;
        BMW3er.verbrauch = 4.9;
        BMW3er.tankStand = 76;
        BMW3er.geplanteStrecke = 439;


        System.out.println("In meiner Garage steht ...");
        System.out.println("... ein " + AudiA4.farbe + "er " + AudiA4.marke + " " + AudiA4.modell + " mit der Seriennummer: " + AudiA4.serienNummer);
        System.out.println("... ein " + AudiA6.farbe + "er " + AudiA6.marke + " " + AudiA6.modell + " mit der Seriennummer: " + AudiA6.serienNummer);
        System.out.println("... ein " + BMW3er.farbe + "er " + BMW3er.marke + " " + BMW3er.modell + " mit der Seriennummer: " + BMW3er.serienNummer);

        AudiA4.druckeInfo();
        AudiA6.druckeInfo();
        BMW3er.druckeInfo();
    }
}
