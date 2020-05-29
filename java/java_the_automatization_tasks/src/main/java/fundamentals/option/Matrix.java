package fundamentals.option;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private int dimension;
    private int[][] matrix;

    public Matrix(int dimension, int rangeOfValues){
        this.dimension = dimension;
        matrix = new int[dimension][dimension];
        setRandomMatrixValue(rangeOfValues);
    }

    // The method for setting random matrix values.
    public void setRandomMatrixValue(int range){
        Random rand = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextBoolean() ? rand.nextInt(range) : -rand.nextInt(range);
            }
        }
    }

    // The matrix display method.
    public void displayMatrix(){
        System.out.println("Display matrix:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    // 1. Sort the rows (columns) of the matrix in ascending order
    // of values of the elements of the k-th column (row).
    public void sortRowsOfColumnAscending(){
        var cloneMatrix = matrix.clone();
        for (int i = 0; i < cloneMatrix.length; i++) {
            Arrays.sort(cloneMatrix[i]);
        }
        System.out.println("\n1. The sort matrix:");
        displayMatrix();
    }

    // 2. Find and derive the largest number of increasing (decreasing) matrix elements in a row.
    public void findIncreasingElements(){
        ArrayList<Integer> elements = new ArrayList<>();
        ArrayList<Integer> bufferElements = new ArrayList<>();
        ArrayList<Integer> buffer = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                buffer.add(matrix[i][j]);
            }
        }

        for (int i = 0; i < buffer.size() - 1; i++) {
            if(buffer.get(i) < buffer.get(i + 1)){
                bufferElements.add(buffer.get(i));
                count++;
            } else {
                bufferElements.add(buffer.get(i));
                count++;

                if(count < elements.size()){
                    count = 0;
                    bufferElements.clear();
                } else {
                    elements.clear();
                    elements.addAll(bufferElements);
                    bufferElements.clear();
                    count = 0;
                }
            }
        }
        System.out.println("\n2. The largest number of increasing matrix elements: "
                + elements.toString() + " (length = " + elements.size() + ").");
    }

    // 3. Find the sum of matrix elements located between the first and second positive elements of each row.
    public void findSumBetweenFirstAndSecondPositiveElements(){
        int[] sumArray = new int[dimension];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if(count == 1 && matrix[i][j] >= 0) {
                    sum += matrix[i][j];
                } else if(count == 1 && matrix[i][j] < 0){
                    sumArray[i] = sum;
                }

                if(matrix[i][j] < 0){
                    count++;
                }
            }
            count = 0;
            sum = 0;
        }
        System.out.println("\n3. The sum of matrix elements located between" +
                " the first and second positive elements of each row:\n" + Arrays.toString(sumArray));
    }

    // 4. Find the maximum element in the matrix and remove from the matrix all rows and columns containing it.
    public void removeRowsAndColumnsInMaxValue(){
        int maxValue = matrix[0][0];
        int quantity = 0;

        // Finding the maximum value and its number of repetitions in the matrix.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(maxValue < matrix[i][j]){
                    maxValue = matrix[i][j];
                    quantity = 1;
                } else if(maxValue == matrix[i][j]){
                    quantity++;
                }
            }
        }

        // Finding indexes on which maximum element.
        int[] axisI = new int[quantity];
        int[] axisJ = new int[quantity];
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(maxValue == matrix[i][j]){
                    axisI[counter] = i;
                    axisJ[counter] = j;
                    counter++;
                }
            }
        }

        // Delete lines with maximum value.
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                boolean isIntersectionAxisAndMaxValue = false;
                for (int k = 0; k < axisI.length; k++) {
                    if(i == axisI[k] || j == axisJ[k]){
                        isIntersectionAxisAndMaxValue  = true;
                    }
                }

                if(isIntersectionAxisAndMaxValue ){
                    continue;
                } else {
                    numbers.add(matrix[i][j]);
                }
            }
        }

        // Getting an array from a collection.
        int index = 0;
        int size = (int) Math.sqrt(numbers.size());
        int[][] returnArray = new int[size][size];
        for (int i = 0; i < returnArray.length; i++) {
            for (int j = 0; j < returnArray[i].length; j++) {
                returnArray[i][j] = numbers.get(index);
                index++;
            }
        }

        System.out.printf("\n4. The max value is %d. His quantity is %d.\n", maxValue, quantity);
        System.out.println("The array after removing the maximum number of rows and columns:");
        if(returnArray.length != 0) {
            for (int i = 0; i < returnArray.length; i++) {
                System.out.println(Arrays.toString(returnArray[i]));
            }
        } else {
            System.out.print(" none.\n");
        }
    }
}