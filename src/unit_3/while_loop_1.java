package unit_3;
import javax.swing.JOptionPane;

public class while_loop_1 {
    public static void main(String[] args) {

        int counter = 0;
       String output = "";

       while (counter < 10){

           output = output + counter + "\n";
           counter++;
       }

        JOptionPane.showMessageDialog(null, output);


    }
}
