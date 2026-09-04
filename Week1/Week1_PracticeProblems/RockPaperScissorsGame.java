import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    static String playRound(String playerMove, String computerMove) {

        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int n = 5;

        String[] moves = {"Rock", "Paper", "Scissors"};

        String[] playerMoves = new String[n];
        String[] computerMoves = new String[n];
        String[] results = new String[n];

        int wins = 0;
        int losses = 0;
        int draws = 0;

        // Play N rounds
        for (int i = 0; i < n; i++) {

            System.out.print("Enter your move (Rock/Paper/Scissors): ");
            String playerMove = sc.nextLine();

            // Generate computer move randomly
            String computerMove = moves[random.nextInt(3)];

            String result = playRound(playerMove, computerMove);

            // Store round details
            playerMoves[i] = playerMove;
            computerMoves[i] = computerMove;
            results[i] = result;

            System.out.println("Round " + (i + 1) +
                    " - Player: " + playerMove +
                    ", Computer: " + computerMove +
                    " -> " + result);

            // Update score
            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }
        }

        // Final summary
        System.out.println("\nFinal Summary");
        System.out.println("-----------------------------------------------");
        System.out.printf("%-8s %-15s %-15s %-15s%n",
                "Round", "Player Move", "Computer Move", "Result");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-8d %-15s %-15s %-15s%n",
                    (i + 1), playerMoves[i], computerMoves[i], results[i]);
        }

        System.out.println("-----------------------------------------------");

        double winPercentage = ((double) wins / n) * 100;

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.printf("Win Percentage: %.1f%%%n", winPercentage);

        sc.close();
    }
}