// Demonstrates a method that accepts a parameter and returns a value
// Uses JOptionPane for GUI input/output

package unit_5;  // Package declaration

// Import required classes
import javax.swing.JOptionPane;

public class methods_04 {
    public static void main(String args[]) {
        // Variable declarations
        String output;          // Stores final output message
        String ageAsString;     // Stores user input (age as String)
        int age;                // Stores current age (converted to int)
        int ageNext;            // Stores age after calculation

        // 1. Get user input for current age
        ageAsString = JOptionPane.showInputDialog(null, "Enter your age");

        // 2. Convert String input to integer
        age = Integer.parseInt(ageAsString);

        // 3. Call addOne() method to calculate next year's age
        ageNext = addOne(age);

        // 4. Prepare and display the output message
        output = "Your age next birthday is " + ageNext +
                ". You are currently " + age + ".";
        JOptionPane.showMessageDialog(null, output);

    } // end main method

    /**
     * Calculates age next birthday by adding 1 to current age
     * @param anAge The current age (input parameter)
     * @return The current age + 1 (next year's age)
     */
    public static int addOne(int anAge) {
        return anAge + 1;
    } // end addOne method

} // end class methods_04