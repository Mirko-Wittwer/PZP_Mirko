public class Main {

    public static void main(String[] args) {
        int anzahl = 1;

        while (anzahl <= 3) {

            int zufall = (int) Math.round(Math.random() * 5 + 1);

            switch (zufall) {
                // Verloren
                case 1:
                case 2:
                    System.out.println("Leider verloren, du hast eine " + zufall + " gewürfelt.");
                    break;
                case 3:
                    System.out.println("Gewonnen, du hast eine " + zufall + " gewürfelt.");
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println("Du hast eine " + zufall + " gewürfelt und darfst es noch einmal versuchen.");
                    break;

            }
            anzahl++;

        }


    }
}
