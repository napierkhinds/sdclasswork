// Demonstrates passing multiple parameters to a method
// Uses JOptionPane for GUI input/output

package unit_5;  // Package declaration

// Import required class for GUI dialogs
import javax.swing.JOptionPane;

public class methods_05 {

    // Main method - program entry point
    public static void main(String args[]) {
        // Variable declarations
        String ageAsString;  // Stores age input as text
        String name;         // Stores user's name
        int age;             // Stores converted age as integer

        // 1. Get user input for name
        name = JOptionPane.showInputDialog(null, "Enter your name");

        // 2. Get user input for age
        ageAsString = JOptionPane.showInputDialog(null, "Enter your age");

        // 3. Convert age from String to int
        age = Integer.parseInt(ageAsString);

        // 4. Call printDetails() method with two arguments
        printDetails(name, age);

    } // end main method

    /**
     * Displays user details in a formatted message
     *
     * @param aName The user's name (String)
     * @param anAge The user's age (int)
     */
    public static void printDetails(String aName, int anAge) {
        String output;  // Stores formatted output message

        // Create formatted output with name and age
        output = "Name: " + aName + "\n" +  // \n creates a new line
                "Age: " + anAge;           // age continues on next line

        // Display the output in a dialog box
        JOptionPane.showMessageDialog(null, output);
    } // end printDetails method

} // end class methods_05