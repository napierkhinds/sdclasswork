// Demonstrates a method with multiple parameters that returns a value
// Uses JOptionPane for GUI input/output

package unit_5;  // Package declaration

// Import required classes
import javax.swing.JOptionPane;

public class methods_06 {
    public static void main(String[] args) {
        // Variable declarations
        String num1AsString, num2AsString;  // Store user input as strings
        int num1, num2;                     // Store converted integers
        int total;                          // Store calculation result

        // 1. Get first number input
        num1AsString = JOptionPane.showInputDialog(null, "Enter first number");
        num1 = Integer.parseInt(num1AsString);  // Convert to int

        // 2. Get second number input
        num2AsString = JOptionPane.showInputDialog(null, "Enter second number");
        num2 = Integer.parseInt(num2AsString);  // Convert to int

        // 3. Call add() method with two parameters and store result
        total = add(num1, num2);

        // 4. Display result in a message dialog
        JOptionPane.showMessageDialog(null, "The total is " + total);
    } // end main method

    /**
     * Adds two integers and returns the result
     *
     * @param num1 First integer to add
     * @param num2 Second integer to add
     * @return Sum of num1 and num2
     */
    public static int add(int num1, int num2) {
        return num1 + num2;  // Return the sum of the parameters
    } // end add method

} // end class methods_06