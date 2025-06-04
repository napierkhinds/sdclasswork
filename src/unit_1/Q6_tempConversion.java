package unit_1;
import javax.swing.JOptionPane;

public class Q6_tempConversion {
    public static void main(String[] args) {
        // Declare variables
        String temp;
        float tempInt, conversion;


        // User prompted for input
        temp = JOptionPane.showInputDialog("Enter temperature in Celsius:");

        // Convert input to float
        tempInt = Float.parseFloat(temp);

        // Convert Celsius to Fahrenheit, and cast the result to float
        conversion = (float) ((tempInt * 9.0/5.0) + 32);

        // Display the result in Fahrenheit
        JOptionPane.showMessageDialog(null, "The temperature in Fahrenheit is: " + conversion, "Temperature Conversion", JOptionPane.PLAIN_MESSAGE);
    }
}
