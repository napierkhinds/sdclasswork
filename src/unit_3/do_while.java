package unit_3;
import javax.swing.JOptionPane;

public class do_while {
    public static void main(String[] args) {

        int counter = 0;
        String output = "";

        do {
            output = output + counter + "\n";
            counter++;
        } while (counter < 10);

        JOptionPane.showMessageDialog(null, output);
    }
}
