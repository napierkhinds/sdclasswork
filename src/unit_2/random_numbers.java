package unit_2;
import java.util.Random;
import javax.swing.JOptionPane;


public class random_numbers {
    public static void main(String[] args) {

        String output;
        int number;
        Random numGenerator = new Random();

        for (int count = 0; count < 5; count++){
        number = numGenerator.nextInt(9);
        output = "The number generated is: " + number;
        JOptionPane.showMessageDialog(null, output);
}
     }
}
