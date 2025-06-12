package unit_4;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Q2_arrays_salary {
    public  static void main(String args[]) {

        String output = " The Percentage for the salary is: ", salaryAsString;
        String output2 = "The Salaries are: ";
        int salaryAsInt, size = 5;
        double percentage = 0.25;
        int [] salaryArray = new int[size];
        double calculation = 0;


        for (int counter = 0; counter < salaryArray.length; counter++) {

            salaryAsString = JOptionPane.showInputDialog("Enter salary");
            salaryAsInt = Integer.parseInt(salaryAsString);
            salaryArray[counter] = salaryAsInt;
            calculation = percentage * salaryArray[counter];
            output = output + calculation + " ";

        }

    for (int counter : salaryArray) {
        output2 = output2 + counter + " ";
    }

    JOptionPane.showMessageDialog(null, output2 + "\n" + output);


    }
}
