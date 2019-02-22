public class Auto {

    // Attribute
    String marke;
    String modell;
    String farbe;
    String serienNummer;
    double tankVolumen;     // Angabe in l
    double verbrauch;       // Angabe in l / km
    double tankStand;
    double geplanteStrecke;


    // Methode

    double gebeMaxReichweite(){
        return tankVolumen / verbrauch * 100;
    }

    void druckeInfo(){
        System.out.printf(this.marke + this.modell + " kommt %.2fkm weit.\n", this.gebeMaxReichweite());
        System.out.printf("Der " + this.marke + this.modell + " schafft noch %.2fkm. \n", this.gebeAktReichweite());
    }

    double gebeAktReichweite(){
        return tankStand / verbrauch * 100;
    }



}
