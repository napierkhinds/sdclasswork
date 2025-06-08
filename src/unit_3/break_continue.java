package unit_3;
import javax.swing.JOptionPane;

public class break_continue {
    public static void main(String[] args) {

        String output ="";


        // conditional sttaement. Whhile loops and for loops are interchangable - SEE while_loop_1 file
        for (int counter = 1; counter <=10; counter++) {

            if (counter == 9) {
                continue;
            }
            output = output + "\n" + counter;

        }


        JOptionPane.showMessageDialog(null, output);
    }

}


