package unit_1;
import javax.swing.JOptionPane;

public class output {

    public static void main(String[] args) {
        // Calculating the area of a rectangle.
        double length = 12.00;
        double width = 4.50;

        double area = length * width;


        String output = "The area of the rectangle is " + area + " inches.";

        JOptionPane.showMessageDialog(null, output, "A Message", JOptionPane.INFORMATION_MESSAGE);
    }

}
