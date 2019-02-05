public class Main {

    public static void main(String[] args) {

        String kleiner16 = "Eine Auswahl von Sprudel, Cola, Fanta, Apfelschorle";
        String bis17 = "Eine Auswahl von Sprudel, Cola, Fanta, Apfelschorle, Trollinger, Riesling, Stuttgarter Hofbräu";
        String ueber18 = "Eine Auswahl von Sprudel, Cola, Fanta, Apfelschorle, Trollinger, Riesling, Stuttgarter Hofbräu, Jägermeister, Absinth";

        int gast = 55;

        if( gast < 16 ){
                System.out.print(kleiner16);
        }
        else if( gast < 18 ){
                System.out.print(bis17);
        }
        else{
            System.out.print(ueber18);
        }
}
}
