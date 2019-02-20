import java.util.Scanner;
public class Zustandautomat {
    public static void main(String[] args) {
        int zustand = 0;
        Scanner derScanner = new Scanner(System.in);
        double a = 0, b = 0;
        char operation = ' ';

        while(zustand < 5) {
            switch (zustand) {
                    // BootUp: Programmversion ausgeben
                case 0:
                    System.out.println("Rechner V1.0");
                    zustand = 1;
                    break;
                    // Eingaben einlesen
                case 1:
                    System.out.print("A: ");
                    a = derScanner.nextDouble();
                    System.out.print("B: ");
                    b = derScanner.nextDouble();
                    zustand = 2;
                    break;
                    // Entscheiden, was gerechnet werden soll
                case 2:
                    derScanner.nextLine();
                    System.out.print("Operation [+,-,*,/,%]: ");
                    operation = derScanner.nextLine().charAt(0);
                    zustand = 3;
                    break;
                    // Berechnung ausführen
                case 3:
                    switch (operation) {
                        case '+':
                            System.out.println(a + " + " + b + " = " + addiere(a, b));
                            break;
                        case '-':
                            System.out.println(a + " - " + b + " = " + subtrahiere(a, b));
                            break;
                        case '*':
                            System.out.println(a + " * " + b + " = " + multipliziere(a, b));
                            break;
                        case '/':
                            System.out.println(a + " / " + b + " = " + dividiere(a, b));
                            break;
                        case '%':
                            System.out.println(a + " % " + b + " = " + modulo(a, b));
                            break;
                    }
                    zustand = 4;
                    break;
                    // Frage ob nochmal oder beenden?
                case 4:
                    System.out.println("Nochmal? [1] für Ja, [0] für Nein");
                    if(derScanner.nextInt() == 1) {
                        zustand = 1;
                    }
                    else {
                        zustand = 5;
                    }


            }
        }
    }

    static double addiere(double a, double b) {
        return a + b;
    }

    static double subtrahiere(double a, double b) {
        return a - b;
    }

    static double multipliziere(double a, double b) {
        return a * b;
    }

    static double dividiere(double a, double b) {
        return a / b;
    }

    static double modulo(double a, double b) {
        return a % b;
    }
}

