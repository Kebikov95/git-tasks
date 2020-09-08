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

        matrix.findIncreasingElements();
        matrix.findSumBetweenFirstAndSecondPositiveElements();
        matrix.removeRowsAndColumnsInMaxValue();
        matrix.sortRowsOfColumnAscending();
    }
}