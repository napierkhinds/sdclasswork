// Demonstrates method overloading with different parameter orders
// Uses JOptionPane for GUI input/output

package unit_5;  // Package declaration

// Import required class
import javax.swing.JOptionPane;

public class methods_09 {
    public static void main(String args[]) {
        // Variable declarations
        String name;        // Store user's name
        String ageAsString; // Store age input as string
        int age;           // Store converted age as integer

        // 1. Get user input for name
        name = JOptionPane.showInputDialog(null, "Enter your name");

        // 2. Get user input for age
        ageAsString = JOptionPane.showInputDialog(null, "Enter your age");

        // 3. Convert age from String to int
        age = Integer.parseInt(ageAsString);

        // 4. Call printDetails method - the compiler will choose the version
        //    that matches the argument types (String, int)
        printDetails(name, age);

    } // end main method

    /**
     * Overloaded version 1: Displays details with age first, then name
     *
     * @param anAge The user's age (int)
     * @param aName The user's name (String)
     *
     * Note: This method is NOT called in the current main method
     * because the argument types (String, int) match the other overload better.
     */
    public static void printDetails(int anAge, String aName) {
        String output = "Age First Version:\n" +
                "Age: " + anAge + "\n" +
                "Name: " + aName;
        JOptionPane.showMessageDialog(null, output);
    }

    /**
     * Overloaded version 2: Displays details with name first, then age
     *
     * @param aName The user's name (String)
     * @param anAge The user's age (int)
     *
     * This is the version that gets called from main because the argument
     * types (String, int) exactly match this parameter order.
     */
    public static void printDetails(String aName, int anAge) {
        String output = "Name First Version:\n" +
                "Name: " + aName + "\n" +
                "Age: " + anAge;
        JOptionPane.showMessageDialog(null, output);
    }
} // end class methods_09