import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // https://www.java-forum.org/thema/vergleichen-von-strings.1350/


        /*System.out.println("Gib einen Wert ein!");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        System.out.println("Die Zahl " + i + " wurde eingeben.");

        System.out.println("Gib einen Wert ein!");

        Scanner sc = new Scanner(System.in);
        String i = sc.next();

        System.out.println("Die Wert " + i + " wurde eingeben.");*/


        System.out.println("Funktioniert alles wie es soll? Ja oder Nein?");
        Scanner sc = new Scanner(System.in);

        String funktion = sc.next();

        if(funktion.equals("ja")){

            System.out.println("Las es so! Es gibt keine Probleme!");

        }else{
            System.out.println("Hast Du dran rumgefummelt? Ja oder Nein?");
        }

        Scanner sc2 = new Scanner(System.in);
        String rumgefummelt = sc2.next();

        if(rumgefummelt.equals("ja")){
            System.out.println("Du Blödmann!");
            System.out.println("Weiß jemand davon? Ja oder nein?");

            Scanner sc3 = new Scanner(System.in);
            String bescheid = sc3.next();
            if(bescheid.equals("ja")){
                System.out.println("Du armes Schwein!");
            }else{
                System.out.println("Behalts für Dich!");
            }

        }else{
            System.out.println("Bist Du dafür verantwortlich? Ja oder Nein?");

            Scanner sc4 = new Scanner(System.in);
            String verantwortlich = sc4.next();

            if(verantwortlich.equals("ja")){
                System.out.println("Kannst Du es jemand anderem anhängen? Ja oder Nein?");

                Scanner sc5 = new Scanner(System.in);
                String anhaengen = sc5.next();

                if(anhaengen.equals("nein")){
                    System.out.println("Du armes Schwein!");
                }else{
                    System.out.println("Es gibt kein Problem!");
                }


            }else{
                System.out.println("Mehr Glück als Verstand gehabt! Es gibt kein Problem!");
            }
        }


    }
}
