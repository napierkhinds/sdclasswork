//Methods: Multiple parameters and returns a value
package unit_5;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class methods_06 {
    public static void main (String[] args) {
    String num1AsString, num2AsString;
    int num1, num2, total;

    num1AsString = JOptionPane.showInputDialog(null, "Enter first number");
    num1 =Integer.parseInt(num1AsString);
    num2AsString = JOptionPane.showInputDialog(null, "Enter second number");
    num2 =Integer.parseInt(num2AsString);

    total = add(num1,num2);
    JOptionPane.showMessageDialog(null, "The total is"  +total);
    }//end main

    public static int add (int num1, int num2){

    return num1 + num2;
    }// end add



}//end class
