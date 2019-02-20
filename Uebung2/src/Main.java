import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double beliebigerWert = 15260.125987;
        System.out.printf("Mein Kontostand ist wie folgt: %.5f" + "\u20AC" + " und " + "%.5f" + "\u20AC", beliebigerWert, 56894.1222899);

        System.out.println();

        int zahl;
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib einen Wert ein.");
        zahl = sc.nextInt();

        /*if(zahl < 2 || zahl < 10){
            System.out.println("Es funktioniert.");
        }else{
            System.out.println("Schitt!");
        }*/

        if (zahl > 2 && zahl < 10) {
            System.out.println("& funktioniert");
        } else {
            System.out.println("& funktioniert nicht.");
        }

    }
}
