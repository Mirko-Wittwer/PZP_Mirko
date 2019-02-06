public class Main {

    public static void main(String[] args) {
        // write your code here

        // Unicode Zeichen
        String usd = "\u0024";
        String eur = "\u20ac";

        // Wechselkurse
        double eurCHF = 1.14;
        double eurUSD = 1.12;

        // Ausgangswerte
        double euro = 150;

        System.out.println(euro + eur + " entsprechen " + euro * eurUSD + usd);
        System.out.printf(euro + eur + " entsprechen " + "%.2f" + "CHF" + "\n", euro * eurCHF);
        System.out.printf(euro + eur + " entsprechen " + "%.2f" + "\n", euro * eurUSD);


        // Wenn mehr als 200 Euro: "Es fallen keine Gebühren an"
        // Wenn weniger als 200 Euro: "Es fallen 3,50€ Gebühren an"

        // Verzweigungen: if else
        if ( // Bedingung
                euro > 1000
        ) { // Wird ausgeführt, wenn die Bedingung erfüllt ist
            System.out.println("Es fallen keine Gebühren an");
            System.out.println("Danke für Ihre Treue.");
        } else if (euro > 200) {
            System.out.println("Es fallen keine Gebühren an");
        } else {
            System.out.println("Es fallen 3,50 " + eur + "Gebühren an.");
        }

    }
}
