package unit_2;
import javax.swing.JOptionPane;

public class Q1 {
    public static void main(String[] args) {

        String number1, number2, output;
        int num1,  num2, addition, multiplication;

        number1 = JOptionPane.showInputDialog(null, "Enter First Number");
        number2 = JOptionPane.showInputDialog(null, "Enter Second Number");
        num1 = Integer.parseInt(number1);
        num2 = Integer.parseInt(number2);

        addition = num1 + num2;
        multiplication = num1 * num2;

        output = " Addition is: " + addition + "\n" + " Multiplication is: " + multiplication;
        JOptionPane.showMessageDialog(null, output, "Result is", JOptionPane.INFORMATION_MESSAGE);

        if (addition > multiplication) {
            JOptionPane.showMessageDialog(null, "Addition is more", "Result is", JOptionPane.INFORMATION_MESSAGE);

        }
        else if (multiplication > addition) {
            JOptionPane.showMessageDialog(null, "Multiplication is more", "Result is", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (addition == multiplication) {
            JOptionPane.showMessageDialog(null, "Results are the same", "Result is", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "ERROR!", "Result is", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
