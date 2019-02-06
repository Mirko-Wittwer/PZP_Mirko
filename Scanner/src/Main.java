import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Scanner
        Scanner derScanner = new Scanner(System.in);

        System.out.println("Wie heißt du?");
        String name = derScanner.nextLine();
        System.out.println("Also dein Name ist " + name + ".");

        System.out.println("Woher kommst du?");
        String herkunft = derScanner.nextLine();
        System.out.println("Du kommst also aus " + herkunft + ".");

        System.out.println("Wie alt bist du?");
        int alter = derScanner.nextInt();
        System.out.println("Dein Alter beträgt also " + alter + " Jahre.");

    }
}
