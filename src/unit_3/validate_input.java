package unit_3;
import javax.swing.JOptionPane;

public class validate_input {
    public static void main(String[] args) {

        String userNumber, output;
        int userNum;
        int maxNum = 100;
        int minNum = 1;

        //prompt user for number
        userNumber=JOptionPane.showInputDialog("Enter a number between" + minNum + " and " + maxNum);

        //cover string input to integer
        userNum=Integer.parseInt(userNumber);


        while (userNum < minNum || userNum > maxNum){

            //prompt user for number
            userNumber=JOptionPane.showInputDialog("INVALID INPUT. Enter a number between" + minNum + " and " + maxNum);

            //cover string input to integer
            userNum=Integer.parseInt(userNumber);

        }

        //display output
        JOptionPane.showMessageDialog(null, "Your number is: " + userNum);


    }
}
