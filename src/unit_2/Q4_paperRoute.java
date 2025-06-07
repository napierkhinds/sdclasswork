package unit_2;
import javax.swing.JOptionPane;

public class Q4_paperRoute {
    public static void main(String[] args) {

        String name, papers;
        double difference;
        double papersDelivered, payment;
        double rate1 = 0.10, rate2 = 0.15, rate3 = 0.20;


        name = JOptionPane.showInputDialog(null, "Enter your name:", "Name", JOptionPane.QUESTION_MESSAGE);
        papers = JOptionPane.showInputDialog(null, "Enter the amount of papers delivered:", "Papers", JOptionPane.QUESTION_MESSAGE);

        papersDelivered = Double.parseDouble(papers);

        if (papersDelivered <= 100) {

            payment = rate1 * papersDelivered;
            JOptionPane.showMessageDialog(null, "The payment for " + name + " is: " + "$" + payment, "Payment Details", JOptionPane.INFORMATION_MESSAGE);

        } else if (papersDelivered > 100 && papersDelivered <= 150) {

            difference = papersDelivered - 100;
            payment = (rate1 * 100) + (rate2 * difference);

            JOptionPane.showMessageDialog(null, "The payment for " + name + " is: " + "$" + payment, "Payment Details", JOptionPane.INFORMATION_MESSAGE);

        } else if (papersDelivered > 150) {

            difference = papersDelivered - 150;
            payment = (rate1 * 100) + (rate2 * 50) + (rate3 * difference);

            JOptionPane.showMessageDialog(null, "The payment for " + name + " is: " + "$" + payment, "Payment Details", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid input", "Payment Details", JOptionPane.INFORMATION_MESSAGE);
        }

    }
    }