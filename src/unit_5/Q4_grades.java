package unit_5;
import javax.swing.JOptionPane;


public class Q4_grades {
    public static void main (String[] args) {

        String gradeAsString;
        int gradeAsInt;
        char calc;
        String output;

        gradeAsString = JOptionPane.showInputDialog("Enter Grade");
        gradeAsInt = Integer.parseInt(gradeAsString);

        calc = calculateGrade(gradeAsInt);
        output = "Grade is: " + calc ;

        JOptionPane.showMessageDialog(null, output);

    }//end of main

    public static char calculateGrade(int grade){
        char gradeA = 'A';
        char gradeB = 'B';
        char gradeC = 'C';
        char gradeF = 'F';

        if (grade > 0 && grade <= 50) {
            return gradeF;
        }
        else if (grade >= 50 && grade < 60) {
            return gradeC;
        }
         else if (grade >= 60 && grade < 75) {
            return gradeB;
        }
        else {
            return gradeA;
        }

    }






}//end of class
