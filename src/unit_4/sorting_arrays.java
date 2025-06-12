package unit_4;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class sorting_arrays {
    public static void main(String[] args) {

        String output = "Arrays Sorted:";
        int[] myArray = {1,34,43,546,32,12,64};
                Arrays.sort(myArray);
        for (int counter: myArray) {

            output = output + " " + counter;
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
