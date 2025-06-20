package unit_5;
import javax.swing.*;
import java.util.Scanner;

public class calculator_v3 {
    public static void main(String args[]) {

        String number1, number2, operator;
        int num1, num2, result, op;

        operator = JOptionPane.showInputDialog("Enter Operator 1. Addition, 2. Subtraction, 3. Multiplication, 4. Division");

        op = Integer.parseInt(operator);


        if (op == 1) {
            number1 = JOptionPane.showInputDialog("Enter First Number");
            number2 = JOptionPane.showInputDialog("Enter Second Number");


            num1 = Integer.parseInt(number1);
            num2 = Integer.parseInt(number2);

            result = add(num1,num2);
            JOptionPane.showMessageDialog(null, "The Sum is " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
        } else if (op == 2) {
            number1 = JOptionPane.showInputDialog("Enter First Number");
            number2 = JOptionPane.showInputDialog("Enter Second Number");


            num1 = Integer.parseInt(number1);
            num2 = Integer.parseInt(number2);

            result = sub(num1,num2);
            JOptionPane.showMessageDialog(null, "The Subtraction is " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
        } else if (op == 3) {
            number1 = JOptionPane.showInputDialog("Enter First Number");
            number2 = JOptionPane.showInputDialog("Enter Second Number");

            ;
            num1 = Integer.parseInt(number1);
            num2 = Integer.parseInt(number2);

            result = multiply(num1,num2);
            JOptionPane.showMessageDialog(null, "The Multiplication is " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
        } else if (op == 4) {
            number1 = JOptionPane.showInputDialog("Enter First Number");
            number2 = JOptionPane.showInputDialog("Enter Second Number");


            num1 = Integer.parseInt(number1);
            num2 = Integer.parseInt(number2);

            result = div(num1,num2);
            JOptionPane.showMessageDialog(null, "The Division is " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Operator", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//end main

    public static int add (int num1, int num2) {
       int result;
      result = num1 + num2;

        return result;
    }
    public static int sub (int num1, int num2) {
        int result;
        result = num1 - num2;

        return result;
    }
    public static int div (int num1, int num2) {
        int result;
        result = num1 + num2;

        return result;
    }

    public static int multiply (int num1, int num2) {
        int result;
        result = num1 + num2;

        return result;
    }

}//end class

