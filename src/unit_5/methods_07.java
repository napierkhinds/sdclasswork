// Demonstrates passing an array to a method and modifying its elements
// Shows how arrays are passed by reference in Java

package unit_5;  // Package declaration

// Import required class for GUI dialogs
import javax.swing.JOptionPane;

public class methods_07 {
    public static void main(String[] args) {
        // 1. Initialize an array with values 1-6
        int[] array = {1, 2, 3, 4, 5, 6};
        String output;  // String to build output messages

        // 2. Display array BEFORE method call
        output = "Array contents BEFORE call to method:\n";
        for (int loop = 0; loop < array.length; loop++) {
            output += array[loop] + " ";  // Append each element
        }
        JOptionPane.showMessageDialog(null, output);

        // 3. Call method to modify the array (pass by reference)
        addOneToEach(array);

        // 4. Display array AFTER method call
        output = "Array contents AFTER call to method:\n";
        for (int loop = 0; loop < array.length; loop++) {
            output += array[loop] + " ";  // Append each modified element
        }
        JOptionPane.showMessageDialog(null, output);
    } // end main method

    /**
     * Increments each element of an integer array by 1
     *
     * @param anArray The array to modify (passed by reference)
     *
     * IMPORTANT: Since arrays are objects in Java, this method modifies
     * the original array, not a copy. Changes will be visible to the caller.
     */
    public static void addOneToEach(int[] anArray) {
        for (int counter = 0; counter < anArray.length; counter++) {
            // Increment each element by 1
            anArray[counter] = anArray[counter] + 1;

            // This could also be written as:
            // anArray[counter] += 1;
            // or
            // anArray[counter]++;
        }
    } // end addOneToEach method

} // end class methods_07