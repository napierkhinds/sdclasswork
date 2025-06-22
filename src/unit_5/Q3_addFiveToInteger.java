package unit_5;
import javax.swing.JOptionPane;


public class Q3_addFiveToInteger {
    public static void main(String[] args) {

        String inputString;
        int input;
        int answer;


        inputString = JOptionPane.showInputDialog(null, "Enter an integer");
        input = Integer.parseInt(inputString);

    answer =  addFiveToInteger(input);
    JOptionPane.showMessageDialog(null, "The answer is: " + answer);


    }//end of main

    public static int addFiveToInteger(int num) {
        int result = 0;
        String output;
        result = 5 + num;
      return result;

    }
}//end of class
