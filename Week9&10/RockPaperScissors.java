import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[(int)(Math.random() * 3)];
    }

    public static String findWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) return "Draw";
        if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
            (playerChoice.equals("paper") && computerChoice.equals("rock"))) return "Player";
        return "Computer";
    }

    public static String[][] getWinStats(int playerWins, int computerWins, int draws, int totalGames) {
        double playerPct = (double) playerWins / totalGames * 100;
        double computerPct = (double) computerWins / totalGames * 100;
        return new String[][]{
            {"Player", String.valueOf(playerWins), String.format("%.2f", playerPct)},
            {"Computer", String.valueOf(computerWins), String.format("%.2f", computerPct)},
            {"Draw", String.valueOf(draws), "-"}
        };
    }

    public static void displayResults(String[][] stats) {
        System.out.printf("%-12s %-8s %-10s%n", "Player", "Wins", "Percentage");
        for (String[] row : stats) {
            System.out.printf("%-12s %-8s %-10s%n", row[0], row[1], row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int totalGames = sc.nextInt();

        int playerWins = 0, computerWins = 0, draws = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String playerChoice = sc.next();
            String computerChoice = getComputerChoice();
            String winner = findWinner(playerChoice, computerChoice);

            System.out.println("Computer chose: " + computerChoice + " | Winner: " + winner);

            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;
        }

        String[][] stats = getWinStats(playerWins, computerWins, draws, totalGames);
        displayResults(stats);
        sc.close();
    }
}