package unit_1;
import javax.swing.JOptionPane;

public class input2 {
    public static void main(String[] args) {
        //declare variables
        String userName;
        String userAge;
        String output;
        int age, ageNextBirthday;

        //prompt user for name and age
        userName = JOptionPane.showInputDialog("Enter your user name");
        userAge = JOptionPane.showInputDialog("Enter your age");

       //convert userage from string to int
        age = Integer.parseInt(userAge);

      ageNextBirthday = age + 1;
        //construct otput
        output = "hello " + userName + " " + "You will be " + ageNextBirthday + " years old on your next birthday.";

        //print message
        JOptionPane.showMessageDialog(null, output, "Welcome", JOptionPane.PLAIN_MESSAGE);

    }
}
