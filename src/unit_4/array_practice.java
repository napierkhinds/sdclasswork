package unit_4;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class array_practice {
    public static void main(String[] args) {
        String inputAsSstring;
        int input;
        String output="";
        String output2="", finalOutput="", finalOutput2="", compare="";
        int[] numbers = {1,2,3,4,5,6};
        int [] numbers2 =new int[numbers.length];


        for (int i=0; i<numbers2.length; i++){
            inputAsSstring=JOptionPane.showInputDialog(null, "Enter Array Numbers : ");
            input=Integer.parseInt(inputAsSstring);
            numbers2[i]=input;
        }

        Arrays.sort(numbers2);
        Arrays.sort(numbers);

        for (int k : numbers2){
            output = (output + k + " ");
        }

        for (int j : numbers){

            output2 =(output2 + " " + j);
        }

            finalOutput= "Array 1 is: " + output;
            finalOutput2= "Array 2 is: " + output2;

           if (Arrays.equals(numbers, numbers2)){
               compare = "Array 1 is equals to Array 2";

        } else
        {
            compare = "Array 1 is not equals to Array 2";
        }



            JOptionPane.showMessageDialog(null, finalOutput + "\n" + finalOutput2 +
                    "\n" + compare);

    }
}

