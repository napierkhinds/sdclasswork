// This program demonstrates a simple Java method with no parameters and no return value.
// It uses JOptionPane to display a message dialog.

// Package declaration (organizes classes into a folder structure)
package unit_5;

// Import the JOptionPane class from the javax.swing library for GUI dialogs
import javax.swing.JOptionPane;

// Main class definition
public class methods_01 {

    // Main method - the starting point of the program
    public static void main(String[] args) {

        // Calling the 'message()' method defined below
        message();

    } // end main method

    /**
     * This method displays a welcome message in a dialog box.
     * - It takes no parameters (no input).
     * - It returns no value (void).
     * - It uses JOptionPane to show a pop-up message.
     */
    public static void message() {
        // Store the message in a String variable
        String output = "This is a welcome message";

        // Display the message in a dialog box:
        // - null → Center the dialog on the screen
        // - output → The message to display
        // - "Method" → Title of the dialog box
        // - JOptionPane.INFORMATION_MESSAGE → Type of dialog (shows an "info" icon)
        JOptionPane.showMessageDialog(null, output, "Method", JOptionPane.INFORMATION_MESSAGE);
    } // end message method

} // end class