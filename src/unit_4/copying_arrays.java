package unit_4;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class copying_arrays {
    public static void main(String[] args) {

    String output = "Array1: ";
    String output2 = "Array2: ";
    int [] array1 = {1, 2, 3, 4, 5, 6};
    int [] array2 = new int[array1.length];

    //copy array1 into array2
        System.arraycopy(array1, 0, array2, 0, array1.length);

    //increment array1 by 1
        for (int loop = 0; loop < array1.length; loop++){

            array1[loop] = array1[loop] + 1;
        }
    //Modify array2

        for (int loop = 0; loop < array2.length; loop++){

            array2[loop] = array2[loop] + 99;
        }
    //create output for array1
        for(int loop : array1){
            output = (output + " "+ loop);
        }
        //create output for array2
        for(int loop : array2){
            output2 = (output2 + " " +loop);
        }

        //Arrays output
        JOptionPane.showMessageDialog(null, output);
        JOptionPane.showMessageDialog(null, output2);


    }//end main
}//end class
