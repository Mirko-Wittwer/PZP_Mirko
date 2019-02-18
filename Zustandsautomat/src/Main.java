import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zustand = 0;
        Scanner sc = new Scanner(System.in);

        while (zustand < 3){
            switch (zustand) {
                case 0:
                    System.out.println("Wilkommen bei unserem ersten Zustandsautomat.");
                    zustand = 1;
                    break;
                case 1:
                    System.out.println("Drücke 1 für nochmal, 2 um zu beenden: ");
                    zustand = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Programm wurde beendet");
                    zustand = 10;
                    break;
            }
        }
    }
}
