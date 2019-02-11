import java.util.Scanner;

public class Wechselgeld {
    public static void main(String[] args) {
        Scanner derScanner = new Scanner(System.in);

        System.out.print("Welcher Betrag soll aufgeteilt werden? ");
        double betrag = derScanner.nextDouble();

        // 500er
        double rest = betrag % 500;             // rest: Was bleibt nach der Modulo Operation
        double aufteilen = betrag - rest;        // restWert: Was bleibt, wenn ich Rest vom Betrag abziehe
        double anzahl500 = aufteilen / 500;      // anzahl500: Anzahl an 500er - Scheinen

        // 200er
        double rest2 = rest % 200;
        aufteilen = rest - rest2;
        double anzahl200 = aufteilen / 200;

        // 100er
        rest = rest2 % 100;
        aufteilen = rest2 - rest;
        double anzahl100 = aufteilen / 100;

        // 50er

        // 20er

        // 10er

        // 5er

        // 2er

        // 1er

        // 50ct

        // 20ct

        // 10ct

        // 5ct

        // 2ct

        // 1ct



        System.out.println("500: " + anzahl500);
        System.out.println("200: " + anzahl200);
        System.out.println("100: " + anzahl100);
    }
}
