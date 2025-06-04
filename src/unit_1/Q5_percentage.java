package unit_1;
import javax.swing.JOptionPane;

public class Q5_percentage {
    public static void main(String[] args) {

    String number;
    double num;
    double percentage = 0.25;
    double answer;

    number = JOptionPane.showInputDialog("Enter number");

    num = Double.parseDouble(number);

    answer = (num * percentage) + num;

    String output = "Your percentage is: " + answer;

    JOptionPane.showMessageDialog(null, output, "Percentage", JOptionPane.INFORMATION_MESSAGE);

    }
}
