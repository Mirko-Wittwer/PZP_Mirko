import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcher betrag soll gewechselt werden?");
        double betrag = sc.nextDouble();

        // 500er
        double rest = betrag % 500;
        double aufteilen = betrag - rest;
        double anzahl500 = aufteilen / 500;

        // 200er
        double rest2 = rest % 200;
        aufteilen = rest - rest2;
        double anzahl200 = aufteilen / 200;

        // 100er
        double rest3 = rest2 % 100;
        aufteilen = rest2 - rest3;
        double anzahl100 = aufteilen / 100;

        // 50er
        double rest4 = rest3 % 50;
        aufteilen = rest3 - rest4;
        double anzahl50 = aufteilen / 50;

        // 20er
        double rest5 = rest4 % 20;
        aufteilen = rest4 - rest5;
        double anzahl20 = aufteilen / 20;

        // 10er
        double rest6 = rest5 % 10;
        aufteilen = rest5 - rest6;
        double anzahl10 = aufteilen / 10;

        // 5er
        double rest7 = rest6 % 5;
        aufteilen = rest6 - rest7;
        double anzahl05 = aufteilen / 5;

        // 2er
        double rest8 = rest7 % 2;
        aufteilen = rest7 - rest8;
        double anzahl02 = aufteilen / 2;

        // 1er
        double rest9 = rest8 % 1;
        aufteilen = rest8 - rest9;
        double anzahl01 = aufteilen / 1;

        // 50ct
        double rest10 = rest9 % 0.5;
        aufteilen = rest9 - rest10;
        double anzahl0_5 = aufteilen / 0.5;

        // 20ct

        // 10ct

        // 5ct

        // 2ct

        // 1ct


        System.out.println(anzahl500);
        System.out.println(anzahl200);
        System.out.println(anzahl100);
        System.out.println(anzahl50);
        System.out.println(anzahl20);
        System.out.println(anzahl10);
        System.out.println(anzahl05);
        System.out.println(anzahl02);
        System.out.println(anzahl01);
        System.out.println(anzahl0_5);

    }
}
