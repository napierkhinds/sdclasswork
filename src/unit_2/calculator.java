package unit_2;

import javax.swing.*;

public class calculator {
    public static void main(String[] args) {

        String number1, number2, operator;
        int num1, num2, result, op;

        operator = JOptionPane.showInputDialog("Enter Operator 1. Addition, 2. Subtraction, 3. Multiplication, 4. Division");

        op = Integer.parseInt(operator);


        if (op == 1 ) {
            number1 = JOptionPane.showInputDialog("Enter First Number");
            number2 = JOptionPane.showInputDialog("Enter Second Number");


            num1 = Integer.parseInt(number1);
            num2 = Integer.parseInt(number2);

            result = num1 + num2;
            JOptionPane.showMessageDialog(null, "The Sum is " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
        }

        else if (op == 2) {
            number1 = JOptionPane.showInputDialog("Enter First Number");
            number2 = JOptionPane.showInputDialog("Enter Second Number");


            num1 = Integer.parseInt(number1);
            num2 = Integer.parseInt(number2);

            result = num1 - num2;
            JOptionPane.showMessageDialog(null, "The Subtraction is " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (op == 3) {
            number1 = JOptionPane.showInputDialog("Enter First Number");
            number2 = JOptionPane.showInputDialog("Enter Second Number");

         ;
            num1 = Integer.parseInt(number1);
            num2 = Integer.parseInt(number2);

            result = num1 * num2;
            JOptionPane.showMessageDialog(null, "The Multiplication is " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (op == 4) {
            number1 = JOptionPane.showInputDialog("Enter First Number");
            number2 = JOptionPane.showInputDialog("Enter Second Number");


            num1 = Integer.parseInt(number1);
            num2 = Integer.parseInt(number2);

            result = num1 / num2;
            JOptionPane.showMessageDialog(null, "The Division is " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    else {
        JOptionPane.showMessageDialog(null, "Invalid Operator", "Error", JOptionPane.ERROR_MESSAGE);
        }









    }
}
