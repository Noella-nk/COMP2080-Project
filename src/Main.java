import java.util.Objects;
import java.util.Scanner;

public class Main {

    // Imported ANSI escape codes to change the text color of the console
    static Scanner scanner = new Scanner(System.in);
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";

    public static void main(String[] args) {

        // Name of members and ids:
        // Ricardo Alvear | 101536306
        // Sayuni Wimaladharma | 101563313

        System.out.println(BLUE + "Hello! Welcome To The TicTacToe Game" + RESET);
        System.out.print(GREEN + "Enter 1 for single player or 2 for two players: " + RESET);
        String choice = scanner.nextLine();

        // While the user input does not equal to "1" or "2",
        // Continue asking them for the valid input
        while(!Objects.equals(choice, "1") && !Objects.equals(choice, "2")){
            System.out.println(RED + "\nSorry, invalid input." + RESET);
            System.out.println("Please enter 1 for single player or 2 for two players: ");
            choice = scanner.nextLine();
        }

        // Selects the correct method depending on the user input
        switch (choice){
            case "1":
                System.out.println(YELLOW + "\nNow loading single player game..." + RESET);
                OnePlayer();
                break;
            case "2":
                System.out.println(YELLOW + "\nNow loading two player game..." + RESET);
                TwoPlayer();
        }
    }

    public static void OnePlayer(){
          System.out.println(GREEN + "Starting the game!" + RESET);
//        Sayuni will do this:
//        2) If the user selects 1 player (versus minimax AI)
//        a. The Human player should be asked their name
//        b. The player must be prompted to choose their symbol (‘X’ or ‘O’)
//        c. The player with symbol ‘X’ should go first (computer or human player).
//        d. The present board state will be displayed and:
//        1. If the computer is to play, it will now show the board updated with the
//        computer’s symbol.
//        2. If it is the player’s turn, the player will be prompted for a row and column
//        location to play.
//        e. The board will then be checked for a winning state or draw and if it is not in a winning
//        state or draw(tie), go to step d otherwise display the winner or declare a draw (tie).

    }

    public static void TwoPlayer(){

        // RICARDO WILL DO THIS

        // 3) If the user selects 2 player (2 Human players)
        //a. Each human player must be prompted to choose their name and symbol (‘X’ or ‘O’)
        //b. An empty board will then be displayed.
        //c. The next player to move will be prompted for a row and column location to play.
        //d. The present board state will be displayed showing their updated play.
        //e. The board will then be checked for a winning state or draw and if it is not in a winning
        //state or draw, go to step c otherwise display the winner or declare a draw

        System.out.println(GREEN + "Starting the game!\n" + RESET);
        String winner = "";
        boolean draw = false;

        System.out.print("Player 1 | Please enter your name: ");
        String p1 = scanner.nextLine();

        while (!p1.matches("^[a-zA-Z]+$") ){
            System.out.println(RED + "\nSorry, invalid input." + RESET);
            System.out.print("Please enter your name: ");
            p1 = scanner.nextLine();

        }

        System.out.print("Please enter your symbol: ");
        String p1Symbol = scanner.nextLine().toLowerCase();

        // While the input for 'p1' does not contain only letters,
        // Continue asking for the valid input
        while (!Objects.equals(p1Symbol, "o")  && !Objects.equals(p1Symbol, "x")){
            System.out.println(RED + "\nSorry, invalid input." + RESET);
            System.out.print("Please enter your symbol: ");
            p1Symbol = scanner.nextLine();
        }

        System.out.print("Player 2 | Please enter your name: ");
        String p2 = scanner.nextLine();

        // While the input for 'p2' does not contain only letters,
        // Continue asking for the valid input
        while (!p2.matches("^[a-zA-Z]+$") ){
            System.out.println(RED + "\nSorry, invalid input." + RESET);
            System.out.print("Please enter your name: ");
            p2 = scanner.nextLine();

        }

        System.out.print("Please enter your symbol: ");
        String p2Symbol = scanner.nextLine().toLowerCase();;

        // While the input for 'p2Symbol' does not contain either X or O,
        // Continue asking for the valid input
        while (!Objects.equals(p2Symbol, "o")  && !Objects.equals(p2Symbol, "x")){
            System.out.println(RED + "\nSorry, invalid input." + RESET);
            System.out.print("Please enter your symbol: ");
            p2Symbol = scanner.nextLine();
        }

        // While the winner is not either player one or player two or a draw has not been reached,
        // Continue the game
        while (!Objects.equals(winner, p1) || !Objects.equals(winner, p2) || !Objects.equals(draw, true)){

        }
    }
}

