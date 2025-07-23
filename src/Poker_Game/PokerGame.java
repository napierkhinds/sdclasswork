// PokerGame.java
package Poker_Game;

import javax.swing.JOptionPane;

public class PokerGame {
    public static void main(String[] args) {
        Player player = new Player(6); // Start with £6
        int menuChoice;

        do {
            menuChoice = showMenu();

            switch (menuChoice) {
                case 1:
                    playBasiceGame(player);
                    break;
                case 2:
                    variableBetGame(player);
                    break;
                case 3:
                    player.showMessage("High score feature not implemented.");
                    break;
            }
        } while (menuChoice != 4);
    }

    public static int showMenu() {
        String menu = "Welcome to Dice Poker!\n"
                + "1. Basic Dice Poker Game.\n"
                + "2. Advanced - Variable Bet amount.\n"
                + "3. High Score Table.\n"
                + "4. Exit";
        String input = JOptionPane.showInputDialog(null, menu);
        return Integer.parseInt(input);
    }

    public static void playBasiceGame(Player player) {
        int maxRounds = 5, rounds =1;

        while (rounds <= maxRounds && player.getBank() > 0) {
            int bet = 1;

            int dice1 = Dice.roll();
            int dice2 = Dice.roll();

            String result = roundResults(player, dice1, dice2, bet);
            player.showMessage(roundMessages(rounds, dice1, dice2, bet, player.getBank(), result));
        rounds++;
        }
        brokeRester(player);
    }

    public static void variableBetGame(Player player) {
        int maxRounds = 5,  rounds =1;
        while (rounds <= rounds  && player.getBank() > 0) {
            int bet = player.askForBet();

            if (!player.canBet(bet)) {
                player.showMessage("You don't have enough to bet that amount.");
                rounds++; // retry round
                continue;
            }


            int dice1 = Dice.roll();
            int dice2 = Dice.roll();

            String result = roundResults(player, dice1, dice2, bet);
            player.showMessage(roundMessages(rounds, dice1, dice2, bet, player.getBank(), result));

        rounds++;
        }
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

    public static String roundMessages(int round, int dice1, int dice2, int bet, int bank, String result) {
        return "Round: " + round + "\n"
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
}
