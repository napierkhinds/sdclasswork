package unit_2;

import javax.swing.*;

public class Q3_vowels {
    public static  void main(String args[]) {
        String output;
        String charAsString;
        char theChar;

        charAsString = JOptionPane.showInputDialog("please enter a character");
        theChar = charAsString.charAt(0);

        if (theChar == 'a' || theChar == 'e' || theChar == 'o' || theChar == 'u' || theChar == 'i') {

            JOptionPane.showMessageDialog(null, "The character you entered is a vowel");
        }
        else if (theChar == 'A' || theChar == 'E' || theChar == 'O' || theChar == 'U' || theChar == 'I' ) {
            JOptionPane.showMessageDialog(null, "The character you entered is a vowel");
        }
          else  {
            JOptionPane.showMessageDialog(null, "The character you entered is not a vowel");
          }

    }
}