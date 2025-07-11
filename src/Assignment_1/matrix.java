
//Student ID: 40723880
// MODULE NUMBER: SET09802 2024-5 TR3 001

package Assignment_1;

import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Arrays;

public class matrix {
    public static void main(String[] args) {
        // Variables to store user input as strings and then convert to integers
        String rowString;
        String colString;
        int rowInt;
        int colInt;
        int choice; // Used in switch case menu
        int maxNum = 1000; // Upper limit for random numbers

        // Ask user to enter number of rows
        rowString = JOptionPane.showInputDialog(null, "Enter M (number of rows):");
        rowInt = Integer.parseInt(rowString);

        // Ask user to enter number of columns
        colString = JOptionPane.showInputDialog(null, "Enter N (number of columns):");
        colInt = Integer.parseInt(colString);

        //  Continue only if rows and columns are between 3 and 10
        if (rowInt >= 3 && rowInt <= 10 && colInt >= 3 && colInt <= 10) {

            String output = ""; // This will store the matrix as a formatted string
            int[][] matrix = new int[rowInt][colInt]; // Create a 2D array
            Random rand = new Random(); // Create a Random object

            // Fill the matrix with random numbers
            for (int r = 0; r < rowInt; r++) {
                for (int c = 0; c < colInt; c++) {
                    int rNum;
                    // Even rows get odd numbers, odd rows get even numbers
                    do {
                        rNum = rand.nextInt(maxNum);
                    } while ((r % 2 == 0 && rNum % 2 == 0) || (r % 2 != 0 && rNum % 2 != 0));

                    matrix[r][c] = rNum;
                    output = output + matrix[r][c] + "\t ";
                }
                output = output + "\n";
            }

            // Show menu repeatedly until user chooses to exit
            do {
                choice = menu();

                switch (choice) {
                    case 1:
                        // Show the matrix
                        JOptionPane.showMessageDialog(null, output);
                        break;

                    case 2:
                        // Show averages
                        displayAverages(matrix);
                        break;

                    case 3:
                        // Show second highest averages
                        SecondLargestAverage(matrix);
                        break;

                    case 4:
                        // Modify matrix based on averages
                        modMatrixAvg(matrix);
                        break;
                }

            } while (choice != 5); // Exit if user chooses option 5

        } else {
            // Show error if input is outside the valid range
            JOptionPane.showMessageDialog(null, "Must be between 3 and 10",
                    "Invalid Input", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Method to show the menu and get user's choice
    public static int menu() {
        String choiceAsString;
        int choice;
        String menu = "Welcome to Matrix Calculator\n"
                + "1. Display Matrix\n"
                + "2. Display Row, Column, and Overall Matrix Averages\n"
                + "3. Display Second Largest Row and Column Average\n"
                + "4. Modify Matrix By Averages\n"
                + "5. Exit Program";

        choiceAsString = JOptionPane.showInputDialog(null, menu);
        choice = Integer.parseInt(choiceAsString);
        return choice;
    }

    // Method to calculate and display row, column, and matrix averages
    public static void displayAverages(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        String rowAvgOutput = "Average of each row:\n";
        String colAvgOutput = "Average of each column:\n";
        int totalSum = 0;

        // Calculate row averages
        for (int r = 0; r < rows; r++) {
            int rowSum = 0;
            for (int c = 0; c < cols; c++) {
                rowSum = rowSum + matrix[r][c];
            }
            double rowAvg = (double) rowSum / cols;
            rowAvgOutput = rowAvgOutput + "Row " + r + ": " + String.format("%.2f", rowAvg) + "\n";
        }

        // Calculate column averages
        for (int c = 0; c < cols; c++) {
            int colSum = 0;
            for (int r = 0; r < rows; r++) {
                colSum = colSum + matrix[r][c];
            }
            totalSum = totalSum + colSum;
            double colAvg = (double) colSum / rows;
            colAvgOutput = colAvgOutput + "Column " + c + ": " + String.format("%.2f", colAvg) + "\n";
        }

        // Calculate overall matrix average
        double matrixAvg = (double) totalSum / (rows * cols);

        // Show all averages
        JOptionPane.showMessageDialog(null,
                rowAvgOutput + colAvgOutput + "\nMatrix Average: " + String.format("%.2f", matrixAvg));
    }

    // Method to find and show the second largest row and column averages
    public static void SecondLargestAverage(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        double[] rowAvgs = new double[rows];
        double[] colAvgs = new double[cols];

        // Calculate row averages
        for (int r = 0; r < rows; r++) {
            int rowSum = 0;
            for (int c = 0; c < cols; c++) {
                rowSum = rowSum + matrix[r][c];
            }
            rowAvgs[r] = (double) rowSum / cols;
        }

        // Calculate column averages
        for (int c = 0; c < cols; c++) {
            int colSum = 0;
            for (int r = 0; r < rows; r++) {
                colSum = colSum + matrix[r][c];
            }
            colAvgs[c] = (double) colSum / rows;
        }

        // Copy and sort averages to find the second largest
        double[] sortedRowAverages = Arrays.copyOf(rowAvgs, rowAvgs.length);
        double[] sortedColAverages = Arrays.copyOf(colAvgs, colAvgs.length);
        Arrays.sort(sortedRowAverages);
        Arrays.sort(sortedColAverages);

        double secondHighestRowAvg = sortedRowAverages[rows - 2];
        double secondHighestColAvg = sortedColAverages[cols - 2];

        // Find the row and column index for the second largest average
        int secondRowIndex = 0;
        for (int i = 0; i < rowAvgs.length; i++) {
            if (rowAvgs[i] == secondHighestRowAvg) {
                secondRowIndex = i;
            }
        }

        int secondColIndex = 0;
        for (int i = 0; i < colAvgs.length; i++) {
            if (colAvgs[i] == secondHighestColAvg) {
                secondColIndex = i;
            }
        }

        // Show the second highest row and column averages
        String message = "Second Highest Row Average \n" + "Row: " + secondRowIndex + "\n"
                + "Value: " + String.format("%.2f", secondHighestRowAvg) + "\n \n"
                + "Second Highest Column Average \n" + "Column: " + secondColIndex + "\n"
                + "Value: " + String.format("%.2f", secondHighestColAvg);

        JOptionPane.showMessageDialog(null, message);
    }

    // Method to change values in matrix based on averages
    public static void modMatrixAvg(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        double[] rowAvgs = new double[rows];
        double[] colAvgs = new double[cols];

        // Calculate row averages
        for (int r = 0; r < rows; r++) {
            int sum = 0;
            for (int c = 0; c < cols; c++) {
                sum = sum + matrix[r][c];
            }
            rowAvgs[r] = (double) sum / cols;
        }

        // Calculate column averages
        for (int c = 0; c < cols; c++) {
            int sum = 0;
            for (int r = 0; r < rows; r++) {
                sum = sum + matrix[r][c];
            }
            colAvgs[c] = (double) sum / rows;
        }

        // Counters for the number of each modified value
        int PCount = 0; // Positive counter
        int ZCount = 0; // Zero counter
        int NCount = 0;// Negative counter

        // Modify matrix based on rules
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int value = matrix[r][c];
                double rowAvg = rowAvgs[r];
                double colAvg = colAvgs[c];

                if (value > rowAvg && value > colAvg) {
                    matrix[r][c] = 1;
                    PCount++;
                } else if (value < rowAvg && value < colAvg) {
                    matrix[r][c] = -1;
                    NCount++;
                } else {
                    matrix[r][c] = 0;
                    ZCount++;
                }
            }
        }

        // Create string to display modified matrix and value counts
        String output = "Modified Matrix:\n";
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                output = output + matrix[r][c] + "\t   ";
            }
            output = output + "\n";
        }

        String output2 = "\nValue Counts:\n"
                + "+1: " + PCount + "\n"
                + " 0: " + ZCount + "\n"
                + "-1: " + NCount;

        // Show the final results
        JOptionPane.showMessageDialog(null, output + "\n" + output2);
    }//end of modMatrixAvg
}//end o main
