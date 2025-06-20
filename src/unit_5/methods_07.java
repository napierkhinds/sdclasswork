// Passing an array to a method
package unit_5;
import javax.swing.JOptionPane;

public class methods_07 {
     public static void main(String[] args) {

         String output;
         int [] array = {1,2,3,4,5,6};

         output = "Array contents before call to method \n";
         for (int loop = 0; loop < array.length; loop++) {
             output = output + array[loop] + " ";
         }
    JOptionPane.showMessageDialog(null, output);

         addOneToEach(array);

         output = "Array contents after the call to method \n";
         //print array
         for (int loop = 0; loop < array.length; loop++) {
             output = output + array[loop] + " ";
         }
JOptionPane.showMessageDialog(null, output);

    }//end main

    public static void  addOneToEach (int [] anArray){
         for (int counter = 0; counter < anArray.length; counter++) {
            anArray[counter] = anArray[counter] + 1;
         }
    }

}//end class
