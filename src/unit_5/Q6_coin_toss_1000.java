package unit_5;
import java.util.Random;
import javax.swing.JOptionPane;

public class Q6_coin_toss_1000 {
    public static void main(String[] args) {

        int flip;
        int flpAmount = 1000;
        int headCount = 0;
        int tailCount = 0;



    for (int count =0; count < flpAmount; count++) {

        flip = coinToss();

        if (flip == 0) {

            headCount++;
        } else if (flip == 1) {

            tailCount++;
        }

    }
        JOptionPane.showMessageDialog(null, "Head Count: " + headCount + "\n" + " Tail Count: " + tailCount);

    }//end main

    public static int coinToss (){

        Random rand = new Random();
        int coin = rand.nextInt(2);
        return coin;
    }//end coinToss


}
