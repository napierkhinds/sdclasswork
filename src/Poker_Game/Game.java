package Poker_Game;

import javax.swing.JOptionPane;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    public static void main(String[] args) {

        int bank = 6, dice1 = 0, dice2 = 0, betAsInt = 0, gameRounds = 0, earnings = 0, diceSum = 0, menuChoice = 0;
        String betAsString, diceRollMsg = "", roundOutput = "";

        JOptionPane.showMessageDialog(
                null, "Welcome to the Poker Game " + "\n" +
                        "Your starting balance is £" + bank + ".00");

        do {
            menuChoice = menu();

            switch (menuChoice) {
                case 1:
                    gameRounds = 5; // Reset game rounds

                    while (gameRounds > 0 && bank > 0) {

                        betAsInt = 1; // Auto-bet $1 each round

                        dice1 = diceroll();
                        dice2 = diceroll();
                        diceSum = dice1 + dice2;

                        if (Math.abs(dice1 - dice2) == 1 || Math.abs(dice2 - dice1) == 1) {
                            earnings = 2;
                            bank += earnings;
                            diceRollMsg = "You win £2";
                        } else if (dice1 == dice2) {
                            earnings = 3;
                            bank += earnings;
                            diceRollMsg = "You won £3";
                        } else {
                            bank -= betAsInt;
                            diceRollMsg = "You lost this round";
                        }

                        roundOutput = buildRoundOutput(6 - gameRounds, dice1, dice2, diceRollMsg, bank, betAsInt);
                        showMessage(roundOutput, "Game Result");
                        gameRounds--;
                    }

                    if (bank <= 0) {
                        showMessage("You're out of money! Returning to the main menu.", "Game Over");
                        bank = 6;
                    } else {
                        showMessage("Game over! Returning to main menu.", "Game Complete");
                    }
                    break;

                case 2:
                    gameRounds = 5; // reset rounds for every new game session

                    while (gameRounds > 0 && bank > 0) {

                        betAsString = getBetFromUser(bank);
                        betAsInt = Integer.parseInt(betAsString);

                        if (betAsInt > bank) {
                            showInvalidBet();
                            continue;
                        }

                        dice1 = diceroll();
                        dice2 = diceroll();
                        diceSum = dice1 + dice2;

                        if (Math.abs(dice1 - dice2) == 1) {
                            earnings = 2;
                            bank += earnings;
                            diceRollMsg = "You win £2";
                        } else if (dice1 == dice2) {
                            earnings = 3;
                            bank += earnings;
                            diceRollMsg = "You won £3";
                        } else {
                            bank -= betAsInt;
                            diceRollMsg = "You lost this round";
                        }

                        roundOutput = buildRoundOutput(6 - gameRounds, dice1, dice2, diceRollMsg, bank,  betAsInt);
                        showMessage(roundOutput, "Game Result");
                        gameRounds--;
                    }

                    // After game loop ends
                    if (bank <= 0) {
                        showMessage("You're out of money! Returning to the main menu.", "Game Over");
                        bank = 6; // Reset bank if you want them to start fresh next game
                    } else {
                        showMessage("Game over! Returning to main menu.", "Game Complete");
                    }
                    break;

                case 3:


            }
        } while (menuChoice != 4);

    } // end of main

    // ========== Modular Methods ==========

    public static String getBetFromUser(int bank) {
        return JOptionPane.showInputDialog(null, "Bank Balance: £" + bank + ".00"
                + "\n" + "Please enter your bet amount", "Bet", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void showInvalidBet() {
        JOptionPane.showMessageDialog(null, "Opps you don't have that amount to bet",
                "Invalid Bet", JOptionPane.INFORMATION_MESSAGE);
    }

    public static String buildRoundOutput(int round, int dice1, int dice2, String result, int bank, int betAsInt) {
        return "Round: " + round + "\n"
                + "Bet Amount: " +betAsInt + "\n"
                + "Dice 1: " + dice1 + "\n"
                + "Dice 2: " + dice2 + "\n"
                + "Result: " + result + "\n"
                + "Bank Balance: £" + bank + ".00";
    }

    public static void showMessage(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static int diceroll() {
        Random toss = new Random();
        return toss.nextInt(6) + 1;
    }

    public static int menu() {
        String choiceAsString;
        int choice;
        String menu = "Welcome to Dice Poker!\n"
                + "1. Basic Dice Poker Game. \n"
                + "2. Advanced - Variable Bet amount.\n"
                + "3. Advanced High Score Table.\n";

        choiceAsString = JOptionPane.showInputDialog(null, menu);
        choice = Integer.parseInt(choiceAsString);
        return choice;
    }

} // end of Poker_Game
