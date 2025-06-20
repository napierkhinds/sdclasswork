// Demonstrates passing a parameter (age) to a method in Java.
// Uses JOptionPane for input/output dialogs.

package unit_5;  // Package declaration (organizes related classes)

// Import JOptionPane for GUI dialogs
import javax.swing.JOptionPane;

public class methods_03 {

    // Main method - program entry point
    public static void main(String args[]) {
        String ageAsString;  // Stores user input (age as text)
        int age;            // Stores converted age (as integer)

        // 1. Read age from user via input dialog
        ageAsString = JOptionPane.showInputDialog("Enter your age");

        // 2. Convert String input to integer (throws NumberFormatException if invalid)
        age = Integer.parseInt(ageAsString);

        // 3. Call printAge() and pass the 'age' as an argument
        printAge(age);

    } // end main method

    /**
     * Displays the user's age in a dialog box.
     * @param anAge The age to display (passed from main method).
     */
    public static void printAge(int anAge) {
        String output;

        // Create the output message
        output = "You are " + anAge + " years old";

        // Show the message in a dialog box
        JOptionPane.showMessageDialog(null, output);

    } // end printAge method

} // end class methods_03