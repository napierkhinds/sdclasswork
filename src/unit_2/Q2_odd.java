package unit_2;
import javax.swing.JOptionPane;


public class Q2_odd {
    public static void main(String args[]) {

        String number;
        int num;

        number = JOptionPane.showInputDialog(null, "Enter Number");

        num = Integer.parseInt(number);

        if (num % 2 != 0) {
            JOptionPane.showMessageDialog(null, num +" is an \"odd\" number ","result",JOptionPane.PLAIN_MESSAGE,null);
        }
        else {
            JOptionPane.showMessageDialog(null, num + " is an \"Even\" number", "result",JOptionPane.PLAIN_MESSAGE,null);
        }


    }
}
