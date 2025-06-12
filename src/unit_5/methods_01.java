//Methods: No parameters and no return value
package unit_5;
import javax.swing.JOptionPane;

public class methods_01 {
    public static void main(String[] args) {
    //calling the message method created below.
    message();



    }//end main

    //creating a method called messages with no arguments or return value.
    public static void message(){
        String output = "This is a welcome message";
        JOptionPane.showMessageDialog(null, output, "Method", JOptionPane.INFORMATION_MESSAGE);
    }//end message method

}//end class
