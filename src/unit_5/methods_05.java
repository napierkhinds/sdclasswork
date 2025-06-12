//
package unit_5;
import javax.swing.JOptionPane;

public class methods_05 {
    public  static void main(String args[]) {

    String ageAsString, name;
    int age;

    name = JOptionPane.showInputDialog(null, "Enter your name");
    ageAsString = JOptionPane.showInputDialog(null, "Enter your age");
    age = Integer.parseInt(ageAsString);


    printDetails(name, age);

    }//ed main

        public static void printDetails (String aName, int anAge) {

        String output;
        output = "Name: " + aName + "\n" + "Age: " + anAge;
        JOptionPane.showMessageDialog(null, output);

        }

}//end class
