package unit_4;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Q3_arrays_studentmarks {
     public static void main(String[] args) {

    String marksAsString, output="Marks: " + "\n", output2="Grades: " ;
    int marksAsInt = 01, size = 10;
    int [] marksArray = new int[size];
    int aCount = 0, bCount = 0, cCount = 0, fCount = 0;


        for (int marksCounter = 0; marksCounter < size; marksCounter++) {

            marksAsString = JOptionPane.showInputDialog("Enter Marks:");
                marksAsInt = Integer.parseInt(marksAsString);

                    marksArray[marksCounter] = marksAsInt;
                    output = output + " " + marksArray[marksCounter] + "\n";

                    if (marksArray[marksCounter] >= 0 && marksArray[marksCounter] < 50) {
                        fCount++;

                    } else if (marksArray[marksCounter] >= 50 && marksArray[marksCounter] < 60) {
                        cCount++;

                    } else if (marksArray[marksCounter] >= 60 && marksArray[marksCounter] < 75) {
                        bCount++;

                    } else if (marksArray[marksCounter] >= 75 && marksArray[marksCounter] <= 100) {
                        aCount++;
                    } else {
                        output2 = output2 + "N/A" + " ";
                    }


                    output2 = "Grades Summary: " + "\n"
                            + "A:" + aCount + "\n"
                            + "B:" + bCount + "\n"
                            + "C:" + cCount + "\n"
                            + "F:" + fCount + "\n";


        }


    JOptionPane.showMessageDialog(null, output + "\n" + output2 +"\n");
     }
}
