package unit_4;

import javax.swing.JOptionPane;

public class arrays {
    public static void main(String[] args) {

        String output = "The numbers are:", aNum;
        int num;
        final int ARRAY_SIZE = 5;
        int[] userNumbers = new int[ARRAY_SIZE];

        for (int counter = 0; counter < userNumbers.length; counter++) {
            aNum = JOptionPane.showInputDialog("Enter number " + counter);
            num = Integer.parseInt(aNum);
            userNumbers[counter] = num;
            output = output + "  " + userNumbers[counter];
        }


    JOptionPane.showMessageDialog(null, output);
    }

}
