public class Durchschnitt {
    // Attribute
    int zahl = 10;

    // Methoden
    public void gebeText(){
        System.out.println("Erstes Objekt erfolgreich erstellt!");
    }

    // Aufgabe: Klausurdurchschnitt berechnen
    // Attribute
    double[] noten = {1.7, 2.7, 3.3, 3.7, 5.0, 2.7, 2.3, 1.7, 2.0, 1.7, 1.0, 2.3, 3.3, 1.7, 3.3, 4.3, 2.3, 2.7, 1.3, 3.0, 2.7};
    double durchschnitt = 0;

    // Methoden
    void berechneDurchschnitt(){
        for(int i = 0; i < noten.length; i++){
            durchschnitt += noten[i];
        }

        durchschnitt /= noten.length;
        // Kurzschreibweise von:
        // durchschnitt = durchschnitt / noten.length;
    }

    void druckeDurchschnitt() {
        System.out.printf("Der Durchschnitt der Klausur beträgt: %.1f\n", durchschnitt);
    }

    void druckeText(String text, int zahl1){
        for (int i = 0; i < zahl1; i++)
        System.out.println(text);
    }

    String gebeText2(){
        return "Hallo";
    }
}
