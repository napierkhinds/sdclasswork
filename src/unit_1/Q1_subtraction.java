package unit_1;
import javax.swing.JOptionPane;

public class Q1_subtraction {
    public static void main(String[] args) {

        String numberOne, numberTwo, output;
        int num1, num2, answer;


        //user is prompted to enter two numbers
        numberOne = JOptionPane.showInputDialog("Enter the first number");
        numberTwo = JOptionPane.showInputDialog("Enter the second number");

        // Converts string input into int to be used in calculation
        num1 = Integer.parseInt(numberOne);
        num2 = Integer.parseInt(numberTwo);

        answer = num1- num2;

        output = "The answer is: " + answer;

        //Print message to screen
        JOptionPane.showMessageDialog(null, output, "Question 1", JOptionPane.INFORMATION_MESSAGE);



    }

}
