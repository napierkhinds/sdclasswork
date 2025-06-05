package unit_2;
import javax.swing.JOptionPane;

public class cw_if_statements {
    public static void main(String[] args) {

        String prompt;
        int number;

        prompt = JOptionPane.showInputDialog("Enter your number");

        number = Integer.parseInt(prompt);
         if (number > 40) {

             JOptionPane.showMessageDialog(null, number + " is greater than 40", "Warning", JOptionPane.WARNING_MESSAGE);
         } else {
             JOptionPane.showMessageDialog(null, number + " is NOT greater than 40", "Warning", JOptionPane.WARNING_MESSAGE);


         }
    }

}
