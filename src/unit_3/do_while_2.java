package unit_3;
import javax.swing.JOptionPane;

public class do_while_2 {
    public static void main(String[] args) {

        String output = "";
        int anoterGo;

        do {
            JOptionPane.showMessageDialog(null, "Hello player");
            output = output + "Do you want to go again?";
            anoterGo = JOptionPane.showConfirmDialog(null, output, "Please Answer", JOptionPane.YES_NO_OPTION);
        }
       //if yes is returned, it is a 0
        while (anoterGo == 0);

        JOptionPane.showMessageDialog(null, "Goodbye player");
    }




}
