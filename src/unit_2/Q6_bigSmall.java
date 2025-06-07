package unit_2;
import javax.swing.*;

public class Q6_bigSmall {
    public static void main(String[] args) {
        String input;
        int num = 0, largest = 0, smallest = 0;

        for (int i = 1; i <= 10; i++) {
            input = JOptionPane.showInputDialog(null, "Enter number " + i + " of 10:", "Input Number", JOptionPane.QUESTION_MESSAGE);

            num = Integer.parseInt(input);

            // Initialize largest and smallest on first input
            if (i == 1) {
                largest = num;
                smallest = num;
            }
               else if (num > largest) {
                    largest = num;
                }
                else if (num < smallest) {
                    smallest = num;
                }

        }

        JOptionPane.showMessageDialog(null, "Largest number: " + largest + "\nSmallest number: " + smallest, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
