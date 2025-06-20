// This program demonstrates a method that takes user input (age) and returns it.
// Uses JOptionPane for input/output dialogs.

package unit_5;  // Organizes this class into the unit_5 package

// Import JOptionPane for GUI dialog boxes (input and message dialogs)
import javax.swing.JOptionPane;

public class methods_02 {

    // Main method - program entry point
    public static void main(String[] args) {

        // Call readAge() to get the user's age and store it in 'yourAge'
        int yourAge = readAge();

        // Create an output message
        String output = "Your age is " + yourAge;

        // Display the output in a dialog box
        JOptionPane.showMessageDialog(null, output);

    } // end main method

    /**
     * Prompts the user to enter their age via a dialog box.
     * @return The age entered by the user (as an integer).
     * @throws NumberFormatException If the input is not a valid number.
     */
    public static int readAge() {
        String ageAsAString;  // Stores age input as text
        int age;              // Stores converted age as an integer

        // Show input dialog and store the user's response
        ageAsAString = JOptionPane.showInputDialog("Enter your age");

        // Convert the String input to an integer
        age = Integer.parseInt(ageAsAString);

        // Return the integer age value to the caller
        return age;

    } // end readAge method

} // end class methods_02