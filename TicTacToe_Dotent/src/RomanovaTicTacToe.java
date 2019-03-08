import java.util.Scanner;

public class RomanovaTicTacToe {
    public static final String EMPTY = "   ", CROSS = " X ", ZERO = " O "; //what's in the cell
    public static String PLAYER;                                           //who is playing now
    public static final int ROWS = 3, COLUMNS = 3;                         //size of the field
    public static String[][] field = new String[ROWS][COLUMNS];            //defining the field
    public static int gamestatus;                                          //game status at the moment
    public static final int INPROZ = 0, DRAW = 1, WINX = 3, WINO = 4;      //all possible states
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        gamebegins();

        do {
            PlayersMove();
            WhoWon();
            Printfield();  // making a move, checking the game status, printing the field

            if (gamestatus == WINX) {
                System.out.println("Player X won! Congrats!");
            } else if (gamestatus == WINO) {
                System.out.println("Player O won! Congrats!");
            } else if (gamestatus == DRAW) {
                System.out.println("It's a draw! Good luck next time!");
            }

            PLAYER = (PLAYER == CROSS ? ZERO : CROSS);     // replacing a player
        }
        while (gamestatus == INPROZ);

    }

    public static void Printfield() {                                  // printing the field in console
        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                System.out.print(field[row][column]);                  // printing each cell
                if (column != COLUMNS - 1) {
                    System.out.print("|");                             // printing walls
                }
            }
            System.out.println();
            if (row != ROWS - 1) {
                System.out.println("-----------");                     // printing floor
            }
        }
        System.out.println();
    }

    public static void gamebegins() {                                    // beginning the game
        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                field[row][column] = EMPTY;                               // all the cells are empty
            }
        }
        PLAYER = CROSS;                                                  // crosses begin
        Printfield();                                                    // printing the empty field
    }

    public static void PlayersMove() {     // checking is the move is allowed

        boolean CorrectMove = false;
        do {
            System.out.println("Player" + PLAYER + "is to choose a row (1-3) and a column (1-3) " +
                    "using a space between and press Enter: ");

            int row = in.nextInt() - 1;  // reading from Scanner, subtracting 1 (program counts from 0)
            int column = in.nextInt() - 1;

            if (row >= 0 && row < ROWS && column >= 0 && column < COLUMNS && field[row][column] == EMPTY) {
                field[row][column] = PLAYER;  // putting a move into a cell
                CorrectMove = true;

            } else {
                System.out.println("You can't mak a move here. " +
                        "The cell (" + (row + 1) + "," + (column + 1) + ") is not available. Try again.");
            }

        } while (!CorrectMove);
    }

    public static void WhoWon() {                                     // checking the winner

        String thewinner = Winner();
        if (thewinner.equals(CROSS)) {
            gamestatus = WINX;
        } else if (thewinner.equals(ZERO)) {
            gamestatus = WINO;
        } else if (!Freecells()) {
            gamestatus = DRAW;
        } else {
            gamestatus = INPROZ;
        }
    }

    public static boolean Freecells() {                              // checking if there are free cells
        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                if (field[row][column] == EMPTY) {
                    return true;                                     // when there is a free cell
                }
            }
        }
        return false;                                                  // when there are no free cells
    }

    public static String Winner() {                                   // checking if there is 3-in-a-row

        int threeinarow;   //defining a variable, when it equals 3, then there is a winner

        for (int row = 0; row < ROWS; row++) {                        // checking rows
            threeinarow = 0;
            for (int column = 0; column < COLUMNS; column++) {        // going through columns
                if (field[row][0] != EMPTY && field[row][0] == field[row][column]) {
                    threeinarow++;
                }
            }
            if (threeinarow == 3) {
                return field[row][0]; // it works with these values - WHY???
            }
        }

        for (int column = 0; column < COLUMNS; column++) {   // checking rows
            threeinarow = 0;     // why here?
            for (int row = 0; row < ROWS; row++) {
                if (field[0][column] != EMPTY && field[0][column] == field[row][column]) {
                    threeinarow++;
                }
            }
            if (threeinarow == 3) {
                return field[0][column];
            }
        }

        // diagonal left -> right
        if (field[0][0] != EMPTY && field[0][0] == field[1][1] && field[0][0] == field[2][2]) {
            return field[0][0];
        }

        // diagonal right -> left
        if (field[0][2] != EMPTY && field[1][1] == field[0][2] && field[2][0] == field[0][2]) {
            return field[0][2];
        }

        return EMPTY;
    }
}