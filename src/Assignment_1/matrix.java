package Assignment_1;

import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Arrays;

public class matrix {
    public static void main(String[] args) {
        String rowAsString;
        String colAsString;
        int rowAsInt;
        int colAsInt;
        int menuChoice;
        int maxNum = 10;

        // Get input from user
        rowAsString = JOptionPane.showInputDialog(null, "Enter M (number of rows):");
        rowAsInt = Integer.parseInt(rowAsString);
        colAsString = JOptionPane.showInputDialog(null, "Enter N (number of columns):");
        colAsInt = Integer.parseInt(colAsString);

        // Check if input is within the valid range
        if (rowAsInt >= 3 && rowAsInt <= 10 && colAsInt >= 3 && colAsInt <= 10) {

            String output = "";
            int[][] matrix = new int[rowAsInt][colAsInt];
            Random rand = new Random();

            for (int r = 0; r < rowAsInt; r++) {
                for (int c = 0; c < colAsInt; c++) {
                    int rNum;
                    do {
                        rNum = rand.nextInt(maxNum);
                    } while ((r % 2 == 0 && rNum % 2 == 0) || (r % 2 != 0 && rNum % 2 != 0));

                    matrix[r][c] = rNum;
                    output += matrix[r][c] + "\t ";
                }
                output += "\n";
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

                    case 3:
                        displaySecondLargestAverages(matrix);
                        break;
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
                + "3. Display Second Largest Row and Column Average\n"
                + "4. [Reserved]\n"
                + "5. Exit Program";

        choiceAsString = JOptionPane.showInputDialog(null, menu);
        choice = Integer.parseInt(choiceAsString);
        return choice;
    }



    public static void displayAverages(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        String rowAvgOutput = "Average of each row:\n";
        String colAvgOutput = "Average of each column:\n";
        int totalSum = 0;

        for (int r = 0; r < rows; r++) {
            int rowSum = 0;
            for (int c = 0; c < cols; c++) {
                rowSum += matrix[r][c];
            }
            double rowAvg = (double) rowSum / cols;
            rowAvgOutput += "Row " + r + ": " + String.format("%.2f", rowAvg) + "\n";
        }

        for (int c = 0; c < cols; c++) {
            int colSum = 0;
            for (int r = 0; r < rows; r++) {
                colSum += matrix[r][c];
            }
            totalSum += colSum;
            double colAvg = (double) colSum / rows;
            colAvgOutput += "Column " + c + ": " + String.format("%.2f", colAvg) + "\n";
        }

        double matrixAvg = (double) totalSum / (rows * cols);

        JOptionPane.showMessageDialog(null,
                rowAvgOutput + colAvgOutput + "\nMatrix Average: " + String.format("%.2f", matrixAvg));
    }




    public static void displaySecondLargestAverages(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        double[] rowAverages = new double[rows];
        double[] colAverages = new double[cols];

        // Compute row averages
        for (int r = 0; r < rows; r++) {
            int rowSum = 0;
            for (int c = 0; c < cols; c++) {
                rowSum += matrix[r][c];
            }
            rowAverages[r] = (double) rowSum / cols;
        }

        // Compute column averages
        for (int c = 0; c < cols; c++) {
            int colSum = 0;
            for (int r = 0; r < rows; r++) {
                colSum += matrix[r][c];
            }
            colAverages[c] = (double) colSum / rows;
        }

        // Make sorted copies
        double[] sortedRowAverages = Arrays.copyOf(rowAverages, rowAverages.length);
        double[] sortedColAverages = Arrays.copyOf(colAverages, colAverages.length);

        Arrays.sort(sortedRowAverages);
        Arrays.sort(sortedColAverages);

        // Get second highest values
        double secondHighestRowAvg = sortedRowAverages[rows - 2];
        double secondHighestColAvg = sortedColAverages[cols - 2];

        // Find original index of second highest row average
        int secondRowIndex = 0;
        for (int i = 0; i < rowAverages.length; i++) {
            if (rowAverages[i] == secondHighestRowAvg) {
                secondRowIndex = i;

            }
        }

        // Find original index of second highest column average
        int secondColIndex = 0;
        for (int i = 0; i < colAverages.length; i++) {
            if (colAverages[i] == secondHighestColAvg) {
                secondColIndex = i;

            }
        }

        // Show result
        String message = "Second Highest Row Average \n" + "Row: " + secondRowIndex + "\n"
                 + "Value: "  + String.format("%.2f", secondHighestRowAvg) + "\n \n"
                + "Second Highest Column Average \n" + "Column: " + secondColIndex + "\n"
                +  "Value: "  + String.format("%.2f", secondHighestColAvg);

        JOptionPane.showMessageDialog(null, message);
    }
}
