package Practice;
import javax.swing.JOptionPane;
import java.util.*;

public class Practice {
    public static void main(String[] args) {

        String output3 = "";
        String output = "";
        String output2 = "";
        int[][] array = new int[3][3];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            output += "\n";
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(5); // 0 to 5
                output += array[i][j] + "\t";
            }
        }

    //columm sum
        for (int i = 0; i < array.length; i++) {
            int cSum = 0;
            for (int j = 0; j < array[0].length; j++) {
                cSum += array[j][i];
            }
            output2 += cSum;

        }

        //Row sum
        for (int j = 0; j < array[0].length; j++) {
           int rSum = 0;
            for (int i = 0; i < array.length; i++) {
                rSum += array[j][i];
            }
            output3 += rSum;
        }

        JOptionPane.showMessageDialog(null, output + "\n \n" + output2 + "\n \n" + output3);
    }
}
