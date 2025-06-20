// Demonstrates a method that returns an array of user-entered numbers
// Uses JOptionPane for GUI input and Arrays class for debugging

package unit_5;  // Package declaration

// Import required classes
import javax.swing.JOptionPane;
import java.util.Arrays;  // For toString() method (debugging)

public class methods_08 {
    public static void main(String[] args) {
        // 1. Declare array variable to hold user data
        int[] getUserData;

        // 2. Call method to read user data and get the returned array
        getUserData = readUserData();  // Corrected method name

        // 3. Build output string with array contents
        String output = "User Data:\n";
        for (int i = 0; i < getUserData.length; i++) {
            output += getUserData[i] + "\n";  // Add each number on new line
        }

        // 4. Display the output
        JOptionPane.showMessageDialog(null, output);

        // (Optional) Debugging: Print array using Arrays.toString()
        System.out.println("Array contents: " + Arrays.toString(getUserData));
    } // end main method

    /**
     * Reads 5 integers from the user and returns them in an array
     *
     * @return Array of 5 integers entered by the user
     *
     * Note:
     * - Uses a constant ARRAY_SIZE to determine how many numbers to read
     * - Converts String input to integers
     * - Returns a new array containing the user's numbers
     */
    public static int[] readUserData() {  // Corrected method name
        final int ARRAY_SIZE = 5;  // Constant for array size

        // Create array to store user input
        int[] theArray = new int[ARRAY_SIZE];

        // Loop to read each number
        for (int loop = 0; loop < theArray.length; loop++) {
            // Show input dialog and store response
            String numString = JOptionPane.showInputDialog("Enter number #" + (loop + 1));

            // Convert String to int and store in array
            theArray[loop] = Integer.parseInt(numString);
        }

        // Return the filled array
        return theArray;
    } // end readUserData method

} // end class methods_08