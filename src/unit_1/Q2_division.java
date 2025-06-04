package unit_1;
import javax.swing.JOptionPane;

public class Q2_division {
    public static void main(String[] args) {

        String number;
        int num;
        int answer;

        number = JOptionPane.showInputDialog("Enter number");

        num = Integer.parseInt(number);

        answer = num / 2;
        JOptionPane.showMessageDialog(null,"The answer is: " + answer, "Result", JOptionPane.PLAIN_MESSAGE);


    }
}
