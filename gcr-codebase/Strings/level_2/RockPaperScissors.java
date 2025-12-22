// java program for rock paper scissor

import java.util.Scanner;

public class RockPaperScissors {

    // method to get computer choice using Math.random()
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);

        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    // method to find winner of a game
    public static String findWinner(String userChoice, String computerChoice) {

        if (userChoice.equalsIgnoreCase(computerChoice)) {
            return "Draw";
        }

        if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
            (userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
            (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // method to calculate stats and percentage
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {

        double userPercentage = ((double) userWins / totalGames) * 100;
        double computerPercentage = ((double) computerWins / totalGames) * 100;

        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercentage) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercentage) + "%";

        return stats;
    }

    // method to display game results and statistics
    public static void displayResults(String[][] games, String[][] stats) {

        System.out.println("\nGame Results:");
        System.out.println("Game\tUser Choice\tComputer Choice\tWinner");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "\t" + games[i][0] + "\t\t" +
                               games[i][1] + "\t\t" + games[i][2]);
        }

        System.out.println("\nFinal Statistics:");
        System.out.println("Player\tWins\tWinning Percentage");
        System.out.println("-----------------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {

      
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int numberOfGames = input.nextInt();

        String[][] gameResults = new String[numberOfGames][3];

        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < numberOfGames; i++) {

            System.out.print("\nGame " + (i + 1) + " - Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = input.next();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;

            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
        }

        String[][] stats = calculateStats(userWins, computerWins, numberOfGames);
        displayResults(gameResults, stats);

        input.close();
    }
}
