public class Main {

    public static void main(String[] args) {

        // Direkte Initialisierung
        String[] namen = {"Hans", "Peter", "Maria", "Mark", "Max"};

        System.out.println(namen[0] + "\n" + namen[1]);

        System.out.println();

        // Indirekte Initialisierung

        int[] alter = new int[5];

        alter[0] = 25;
        alter[1] = 58;
        alter[2] = 12;
        alter[3] = 89;
        alter[4] = 120;

        for(int i = 0; i < namen.length; i++){
            System.out.println(namen[i] + " " + alter[i]);
        }

    }
}
