//Methods: Accept and return a parameter

package unit_5;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class methods_04 {
    public  static void main(String args[]) {

    String output, ageAsString;
    int age, ageNext;

    ageAsString = JOptionPane.showInputDialog(null, "Enter your age");
    age = Integer.parseInt(ageAsString);

    ageNext = addOne(age);
    output = "Your age next birthday is " +ageNext + " You are currently " + age;

    JOptionPane.showMessageDialog(null, output);

    }//end main

    public static int addOne (int anAge){
        return anAge + 1;
    }



}//end of class methods_04
