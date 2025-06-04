package unit_1;
import javax.swing.JOptionPane;

public class Q7_escapeChars {
    public static void main(String[] args) {

        // Corrected escape for backslash
        String output = "Hello this is \\\\";

        // Showing the message for backslash
        JOptionPane.showMessageDialog(null, "The backslash character (\\) is easy to print");

        // Corrected escape for double quotes
        JOptionPane.showMessageDialog(null, "The double quotes are also \"easy\" to print");
    }
}
