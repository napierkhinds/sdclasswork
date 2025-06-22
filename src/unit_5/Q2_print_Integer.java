package unit_5;
import javax.swing.JOptionPane;


public class Q2_print_Integer {
    public static void main(String args[]) {

        String num1AsString;
        int num;
        String output;

        num1AsString = JOptionPane.showInputDialog("Enter a number");
        num = Integer.parseInt(num1AsString);

        printInteger(num);

    }//end main

    public static void printInteger(int num1) {
        String output;

        JOptionPane.showMessageDialog(null, "The number is: " + num1);
    }




}//end class
