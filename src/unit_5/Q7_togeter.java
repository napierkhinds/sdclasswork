package unit_5;
import javax.swing.JOptionPane;


public class Q7_togeter {
    public  static void main(String args[]) {
        String inputAsString;
        int choice;
String menue = "Please Select an Option \n"
                + "1. Int \n"
                + "2. Double \n"
                + "3. String \n";

inputAsString =JOptionPane.showInputDialog(null, menue);
choice = Integer.parseInt(inputAsString);

switch(choice) {
    case 1:
        int total = 0;
        int number1 = 0, number2 = 0, number3 = 0;
        number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Number1"));
        number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Number2"));
        number3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Number3"));

        total = addTogether(number1, number2, number3);
        JOptionPane.showMessageDialog(null, "Your Total is: " + total);
        break;


    case 2:
        double totalDouble = 0;
        double double1 = 0, double2 = 0, double3 = 0;
        double1 = Double.parseDouble (JOptionPane.showInputDialog(null, "Please Enter Number1"));
        double2 = Double.parseDouble (JOptionPane.showInputDialog(null, "Please Enter Number2"));
        double3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Number3"));

        totalDouble = addTogether(double1, double2, double3);
        String message = String.format("Total: %.2f", totalDouble);
        JOptionPane.showMessageDialog(null, "Your Total is: " + message);
        break;

        case 3:
            String totalString = "";
            String string1 = JOptionPane.showInputDialog(null, "Please Enter String1");
            String string2 = JOptionPane.showInputDialog(null, "Please Enter String2");
            String string3 = JOptionPane.showInputDialog(null, "Please Enter String3");
            totalString = addTogether(string1, string2, string3);
            JOptionPane.showMessageDialog(null, "Your String is: " + totalString);

         default:
        JOptionPane.showMessageDialog(null, "Invalid choice.");

}

    } //end main

public static int addTogether(int num1,int num2, int num3){

        int total=0;
        total = num1+num2+num3;
        return total;
}//end of addTogether

    public static double addTogether(double num1, double num2, double num3){

        double total=0;
        total = num1+num2+num3;
        return total;
    }
public static String addTogether(String st1, String st2, String st3){

        String total="";
        total = st1+" "+st2+" "+st3;
        return total;
}

}//end class
