package unit_5;
import javax.swing.JOptionPane;

public class methods_02 {
    public static void main(String[] args) {


      int yourAge = readAge();
      String output;

      output = "Your age is "+yourAge;
      JOptionPane.showMessageDialog(null, output);


    }//end main

public static int readAge(){
   String ageAsAString;
   int age;

    ageAsAString = JOptionPane.showInputDialog("Enter your age");
     age = Integer.parseInt(ageAsAString);
    return age;

        }//end readAge



}//emd claas methods_2
