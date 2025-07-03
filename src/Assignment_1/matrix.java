package Assignment_1;

import javax.swing.JOptionPane;
import java.util.Random;

public class matrix {
    public static void main(String[] args) {
        String rowAsString;
        String colAsString;
        int rowAsInt;
        int ColAsInt;
        int menuChoice;
        int maxNum = 10;

        // Get input from user
        rowAsString = JOptionPane.showInputDialog(null, "Enter M (number of rows):");
        rowAsInt = Integer.parseInt(rowAsString);
        colAsString = JOptionPane.showInputDialog(null, "Enter N (number of columns):");
        ColAsInt = Integer.parseInt(colAsString);

        // Check if input is within the valid range
        if (rowAsInt >= 3 && rowAsInt <= 10 && ColAsInt >= 3 && ColAsInt <= 10) {

            String output = "";
            int[][] matrix = new int[rowAsInt][ColAsInt];
            Random rand = new Random();

            for (int r = 0; r < rowAsInt; r++) {
                for (int c = 0; c < ColAsInt; c++) {
                    int rNum;

                    // Generate correct number depending on row
                    do {
                        rNum = rand.nextInt(maxNum); // 0 to 10
                    } while ((r % 2 == 0 && rNum % 2 == 0) || (r % 2 != 0 && rNum % 2 != 0));

                    matrix[r][c] = rNum;
                    output += matrix[r][c] + "\t ";
                }
                output += "\n"; // New line after each row
            }

            do {
                menuChoice = menu();

                switch (menuChoice) {
                    case 1:
                        JOptionPane.showMessageDialog(null, output);
                        break;

                    case 2:
                        displayAverages(matrix);
                        break;

                   // default:
                       // JOptionPane.showMessageDialog(null, "Invalid Menu Choice", "Try Again", JOptionPane.WARNING_MESSAGE);
                }

            } while (menuChoice != 5);

        } else {
            JOptionPane.showMessageDialog(null, "Must be between 3 and 10",
                    "Invalid Input", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static int menu() {
        String choiceAsString;
        int choice;
        String menu = "Welcome to Matrix Calculator\n"
                + "1. Display Matrix\n"
                + "2. Display Row, Column, and Overall Matrix Averages\n"
                + "3. Display Second Largest Average [Not Implemented Yet]\n"
                + "4. [Reserved]\n"
                + "5. Exit Program";

        choiceAsString = JOptionPane.showInputDialog(null, menu);
        choice = Integer.parseInt(choiceAsString);
        return choice;
    }

    // New Method for Case 2
    public static void displayAverages(int[][] matrix) {
        int rows = matrix[0].length;
        int cols = matrix[1].length;

        String rowAvgOutput = "Average of each row:\n";
        String colAvgOutput = "Average of each column:\n";
        int totalSum = 0;

        // Row averages
        for (int r = 0; r < rows; r++) {
            int rowSum = 0;
            for (int c = 0; c < cols; c++) {
                rowSum += matrix[r][c];
            }
            double rowAvg = (double) rowSum / cols;
            rowAvgOutput += "Row " + r + ": " + String.format("%.2f", rowAvg) + "\n";
        }

        // Column averages
        for (int c = 0; c < cols; c++) {
            int colSum = 0;
            for (int r = 0; r < rows; r++) {
                colSum += matrix[r][c];
            }
            totalSum += colSum;
            double colAvg = (double) colSum / rows;
            colAvgOutput += "Column " + c + ": " + String.format("%.2f", colAvg) + "\n";
        }
    // Matrix average
        double matrixAvg = (double) totalSum / (rows * cols);

        JOptionPane.showMessageDialog(null,
                rowAvgOutput + colAvgOutput + "\nMatrix Average: " + String.format("%.2f", matrixAvg));
    }

}
