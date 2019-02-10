import java.util.Scanner;

public class Main {

    // Variablen deklarieren
    static double zahl;


    public static void main(String[] args) {


        eingabe();
        ausgabe();
    }


    static void eingabe(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie eine Zahl ein.");
        zahl = sc.nextDouble();

    }

    static void ausgabe(){

        if ((zahl % 2) == 0){
            System.out.println("Die Zahl: " + zahl + " ist gerade.");
        }else {
            System.out.println("Die Zahl " + zahl + " ist ungerade.");
        }


    }



}
