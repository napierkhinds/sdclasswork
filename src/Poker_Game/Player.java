package Poker_Game;

import javax.swing.JOptionPane;

public class Player {
    private int bank;

    public boolean canBet(int amount) {
        return amount <= bank;
    }

    public Player(int defaultAmount) {
        this.bank = defaultAmount;
    }

    public void addToBank(int amount) {
        bank += amount;
    }

    public void subtractFromBank(int amount) {
        bank -= amount;
    }

    public int getBank() {
        return bank;
    }

    public int askForBet() {
        String input = JOptionPane.showInputDialog(null,
                "Your current balance is £" + bank + "\nEnter your bet amount:");
        return Integer.parseInt(input);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
