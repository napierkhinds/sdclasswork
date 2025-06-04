package unit_1;
import javax.swing.JOptionPane;

public class input {
    public static void main(String[] args) {
       //declare variables
        String userName;
        String output;


        //prompt user for name
        userName = JOptionPane.showInputDialog("Enter your user name");
        //construct otput
        output = "hello " + userName;

        //print message
        JOptionPane.showMessageDialog(null, output, "Welcome", JOptionPane.PLAIN_MESSAGE);

    }
}
