
//Methods: Passing one parameter into a method
package unit_5;
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Scanner;

public class methods_03 {
    public  static void main(String args[]) {
        String ageAsString;
        int age;

        //read in age
        ageAsString = JOptionPane.showInputDialog("Enter your age");
        age = Integer.parseInt(ageAsString);

        //call method printAge to display age
        printAge(age);

    }//end main

    public static void printAge(int anAge){

        String output;

        output = ("You are " +anAge + " years old");
        JOptionPane.showMessageDialog(null, output);

    }//end of prtintAge


}//end class method_08
