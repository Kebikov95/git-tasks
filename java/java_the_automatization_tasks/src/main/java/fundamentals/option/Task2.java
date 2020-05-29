package fundamentals.option;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter matrix dimension 'n' (Matrix[n][n]):");
        int dimension = in.nextInt();
        System.out.println("Please, enter a range of values 'M' (-M:M):");
        int range = in.nextInt();

        Matrix matrix = new Matrix(dimension, range);
        matrix.displayMatrix();

        matrix.findIncreasingElements();                       // part 2
        matrix.findSumBetweenFirstAndSecondPositiveElements(); // part 3
        matrix.removeRowsAndColumnsInMaxValue();               // part 4
        matrix.sortRowsOfColumnAscending();                    // part 1
    }
}