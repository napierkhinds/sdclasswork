package unit_1;
import javax.swing.JOptionPane;

public class Q3_float {
    public static void main(String[] args) {

       String realNum;
       float num;
       float answer;

       realNum = JOptionPane.showInputDialog(null, "Enter RealNumber");
       num = Float.parseFloat(realNum);

       answer = num / 2;
       JOptionPane.showMessageDialog(null, "The answer is: " + answer, "Result", JOptionPane.PLAIN_MESSAGE);




    }
}
