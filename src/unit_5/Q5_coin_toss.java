package unit_5;
import java.util.Random;
import java.util.random.RandomGenerator;
import javax.swing.JOptionPane;

public class Q5_coin_toss {
    public static void main(String[] args) {

    int flip;
    flip = coinToss();

    if (flip == 0){
        JOptionPane.showMessageDialog(null, "Heads");
    }
    else if (flip == 1){
        JOptionPane.showMessageDialog(null, "Tails");
    }


    }//end main

    public static int coinToss (){

        Random rand = new Random();
        int coin = rand.nextInt(2);
        return coin;
    }





}//end class
