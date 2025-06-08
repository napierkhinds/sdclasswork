package unit_3;
import javax.swing.JOptionPane;
public class imporved_calc {
    public static void main(String[] args) {
        String number1, number2, operator, output="";
        int num1, num2, result, op, anoterGo = 0;

        operator = JOptionPane.showInputDialog("Enter Operator 1. Addition, 2. Subtraction, 3. Multiplication, 4. Division");

        op = Integer.parseInt(operator);


        if (op == 1) {
            do {
                number1 = JOptionPane.showInputDialog("Enter First Number");
                number2 = JOptionPane.showInputDialog("Enter Second Number");


                num1 = Integer.parseInt(number1);
                num2 = Integer.parseInt(number2);

                result = num1 + num2;
                JOptionPane.showMessageDialog(null, "The Sum is " + result, "Addition", JOptionPane.INFORMATION_MESSAGE);
                output = output + "Do you want to go again?";
                anoterGo = JOptionPane.showConfirmDialog(null, output, "Please Answer", JOptionPane.YES_NO_OPTION);
            }
            while (anoterGo == 0);

        } else if (op == 2) {
            do {
                number1 = JOptionPane.showInputDialog("Enter First Number");
                number2 = JOptionPane.showInputDialog("Enter Second Number");


                num1 = Integer.parseInt(number1);
                num2 = Integer.parseInt(number2);

                result = num1 - num2;
                JOptionPane.showMessageDialog(null, "The Subtraction is " + result, "Subtraction", JOptionPane.INFORMATION_MESSAGE);
                output = output + "Do you want to go again?";
                anoterGo = JOptionPane.showConfirmDialog(null, output, "Please Answer", JOptionPane.YES_NO_OPTION);
            }
            while (anoterGo == 0);
        } else if (op == 3) {
            do {
                number1 = JOptionPane.showInputDialog("Enter First Number");
                number2 = JOptionPane.showInputDialog("Enter Second Number");

                ;
                num1 = Integer.parseInt(number1);
                num2 = Integer.parseInt(number2);

                result = num1 * num2;
                JOptionPane.showMessageDialog(null, "The Multiplication is " + result, "Multiplication", JOptionPane.INFORMATION_MESSAGE);
                output = output + "Do you want to go again?";
                anoterGo = JOptionPane.showConfirmDialog(null, output, "Please Answer", JOptionPane.YES_NO_OPTION);
            }
            while (anoterGo == 0);
        } else if (op == 4) {
           do {
               number1 = JOptionPane.showInputDialog("Enter First Number");
               number2 = JOptionPane.showInputDialog("Enter Second Number");


               num1 = Integer.parseInt(number1);
               num2 = Integer.parseInt(number2);

               result = num1 / num2;
               JOptionPane.showMessageDialog(null, "The Division is " + result, "Division", JOptionPane.INFORMATION_MESSAGE);
               output = output + "Do you want to go again?";
               anoterGo = JOptionPane.showConfirmDialog(null, output, "Please Answer", JOptionPane.YES_NO_OPTION);

           }
           while (anoterGo == 0);

        } else {
            JOptionPane.showMessageDialog(null, "Invalid Operator", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }

}
