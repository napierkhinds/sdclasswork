package unit_2;

import javax.swing.*;

public class Q7_passOrFail {
    public static void main(String[] args) {
        String input;
        int num = 0, passed = 0, failed = 0;

        for (int i = 1; i <= 10; i++) {
            input = JOptionPane.showInputDialog(null, "Enter Mark " + i + " of 10:", "Input Marks", JOptionPane.QUESTION_MESSAGE);

            num = Integer.parseInt(input);

            // Initialize largest and smallest on first input
            if (num >= 50) {
                passed++;
            } else if (num < 50) {
                failed++;
            }
        }
        JOptionPane.showMessageDialog(null, "Marks passed: " + passed + "\nMarks failed: " + failed);
    }
}
