package unit_4;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class searching_arrays {
    public static void main(String[] args) {

        String output = "", keyAsString;
        int key, search;
        int [] myArray = {10,23,43,12,4,53,65};

        keyAsString = JOptionPane.showInputDialog("Enter a number to search for");
        key = Integer.parseInt(keyAsString);
        Arrays.sort(myArray);

        search = Arrays.binarySearch(myArray, key);

        if (search >= 0) {
            output =  + key + " has been found";
        }else {
            output =  + key + " has NOT been found";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
