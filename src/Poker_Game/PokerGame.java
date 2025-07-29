package Poker_Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class PokerGame {
    public static void main(String[] args) {

        Player player = new Player(6); // Start with £6

        int menuChoice;
        String playerName = JOptionPane.showInputDialog(null, "Enter your player name");

        if (playerName == null || playerName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Player name cannot be empty, please enter your player name");
        } else {
            player.setName(playerName);
            do {
                menuChoice = showMenu();

                switch (menuChoice) {
                    case 1:
                        playBasicGame(player);
                        HighScore();
                        break;
                    case 2:
                        variableBetGame(player);
                        HighScore();
                        break;
                    case 3:
                        HighScore();
                        break;
                }
            } while (menuChoice != 4);
        }
    }

    public static int showMenu() {
        String menu = "Welcome to Dice Poker! \n "
                + "1. Basic Dice Poker Game.\n"
                + "2. Advanced - Variable Bet amount.\n"
                + "3. Display High Score Table.\n"
                + "4. Exit";
        String input = JOptionPane.showInputDialog(null, menu);
        return Integer.parseInt(input);
    }

    public static void playBasicGame(Player player) {
        int maxRounds = 5, rounds = 1;

        while (rounds <= maxRounds && player.getBank() > 0) {
            int bet = 1;

            int dice1 = Dice.roll();
            int dice2 = Dice.roll();

            String result = roundResults(player, dice1, dice2, bet);
            player.showMessage(roundMessages(player, rounds, dice1, dice2, bet, player.getBank(), result));
            rounds++;
        }

        writeHighSCore(player.getName(), player.getBank());
        brokeRester(player);
    }

    public static void variableBetGame(Player player) {
        int maxRounds = 5, rounds = 1;
        while (rounds <= maxRounds && player.getBank() > 0) {
            int bet = player.askForBet();

            if (bet < 1) {
                player.showMessage("Minimum bet is £1.");
                continue;
            }

            if (bet > 4) {
                player.showMessage("Maximum bet is £4.");
                continue;
            }

            if (!player.canBet(bet)) {
                player.showMessage("You don't have enough to bet that amount.");
                continue;
            }

            int dice1 = Dice.roll();
            int dice2 = Dice.roll();

            String result = roundResults(player, dice1, dice2, bet);
            player.showMessage(roundMessages(player, rounds, dice1, dice2, bet, player.getBank(), result));
            rounds++;
        }

        writeHighSCore(player.getName(), player.getBank());
        brokeRester(player);
    }

    public static String roundResults(Player player, int dice1, int dice2, int bet) {
        if (Math.abs(dice1 - dice2) == 1) {
            player.addToBank(2 * bet);
            return "You won double your bet! (sequential).";
        } else if (dice1 == dice2) {
            player.addToBank(3 * bet);
            return "You won triple your bet! (double).";
        } else {
            player.subtractFromBank(bet);
            return "You lost the round.";
        }
    }

    public static String roundMessages(Player player, int round, int dice1, int dice2, int bet, int bank, String result) {
        String playerName = player.getName();
        return "Player Name: " + playerName + "\n"
                + "Round: " + round + "\n"
                + "Bet: £" + bet + "\n"
                + "Dice 1: " + dice1 + ", Dice 2: " + dice2 + "\n"
                + result + "\n"
                + "Bank: £" + bank;
    }

    public static void brokeRester(Player player) {
        if (player.getBank() <= 0) {
            player.showMessage("You ran out of money! :( ");
            player.addToBank(6);
        }
    }

    public static void writeHighSCore(String playerName, int bank) {
        try {
            FileWriter writer = new FileWriter("high_scores.txt", true); // append mode
            writer.write(playerName + " - £" + bank + "\n");
            writer.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error writing high score: " + e.getMessage());
        }
    }

    public static void HighScore() {
        ArrayList<String> high_score = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("high_scores.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                high_score.add(line);
            }
            reader.close();

            // Sort by score descending
            Collections.sort(high_score, new Comparator<String>() {
                public int compare(String a, String b) {
                    try {
                        int score1 = Integer.parseInt(a.split("£")[1].trim());
                        int score2 = Integer.parseInt(b.split("£")[1].trim());
                        return Integer.compare(score2, score1); // Descending order
                    }

                    catch (Exception e) {
                        return 0; // In case of bad formatting
                    }
                }
            });

        } catch (IOException e) {
            high_score.add("Could not load high scores.");
        }

        StringBuilder scores = new StringBuilder();
        for (String row : high_score) {
            scores.append(row).append("\n");
        }

        JOptionPane.showMessageDialog(null, scores.toString(), "High Score Table", JOptionPane.INFORMATION_MESSAGE);
    }

}
