package unit_2;

import javax.swing.JOptionPane;

public class while_loop {
    public static void main(String[] args) {

        int counter = 0;
        String output = "The answer is: ";

        while (counter <= 10) {
            output = output + counter + "\n";
            counter++;

        }
        JOptionPane.showMessageDialog(null, output, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
