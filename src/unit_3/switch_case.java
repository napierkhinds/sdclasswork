package unit_3;
import javax.swing.JOptionPane;

public class switch_case {
    public static void main(String[] args) {

        String userGrade, output="";
        char grade;

        userGrade = JOptionPane.showInputDialog("Enter your grade");
        grade = userGrade.charAt(0);

        switch (grade){
            case 'a':
                output = "Excellent";
                break;
            case 'b':
                output = "Good";
                break;
            case 'c':
                output = "Acceptable";
                break;
            case 'd':
                output = "Fair";
                break;
            case 'f':
                output = "Fail";
                break;
            default: output = "Invalid grade";

        }

        JOptionPane.showMessageDialog(null, output);
    }
}