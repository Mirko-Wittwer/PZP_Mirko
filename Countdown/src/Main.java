import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int countdown;

    public static void main(String[] args) throws InterruptedException {

        eingabe();
        anzaehlen();
        ausgabe();

    }

    static void eingabe(){

        System.out.println("Geben Sie einen Wert ein.");
        countdown = sc.nextInt();
    }

    static void anzaehlen()  throws InterruptedException{

        System.out.print("Ihr Countdown startet in 3 ...");
        Thread.sleep(1000);
        System.out.print(" 2 ...");
        Thread.sleep(1000);
        System.out.print(" 1 ...");
        Thread.sleep(1000);
        System.out.println(" GO");
        Thread.sleep(1000);
    }

    static void ausgabe() throws InterruptedException {

        // zur Wiederholung: Countup
        /*for (int a = 1; a <= countdown; a++){
            System.out.println(a);
            Thread.sleep(1000);*/

        // Countdown
        for(int b = countdown; b >= 0; b--){
            System.out.print(b);
            Thread.sleep(1000);
            System.out.print(" ");

        }

    }



}
