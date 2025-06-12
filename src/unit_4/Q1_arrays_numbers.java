package unit_4;
import javax.swing.JOptionPane;


public class Q1_arrays_numbers {
    public static void main(String[] args) {

        //initialize variables
        String output = "Numbers are: ", inputAsSstring;
        int inputAsInt, size = 5;
        int [] numbers = new int[size];

        //Get user input.


        for (int counter = 0; counter < numbers.length; counter++) {
            inputAsSstring = JOptionPane.showInputDialog(null, "Enter five numbers for the array");
            inputAsInt = Integer.parseInt(inputAsSstring);
            numbers[counter] = inputAsInt;

            if (numbers[counter] < 10 ) {
                output = output + numbers[counter] + " ";
            }

        }

JOptionPane.showMessageDialog(null, output);

    }//end of main
}//end of class
