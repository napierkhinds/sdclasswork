package unit_4;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class comparing_arrays {
    public static  void main(String args[]) {

        String output;

        int [] array1 = {1,2,3,4,5,6,7,8,9,10};
        int [] array2 = {1,2,3,4,5,6,8,9,10};

        if(Arrays.equals(array1, array2)){

            output = "The numbers are the same";
        }else {
            output = "The numbers are not the same";
        }
        JOptionPane.showMessageDialog(null, output);

    }
}
