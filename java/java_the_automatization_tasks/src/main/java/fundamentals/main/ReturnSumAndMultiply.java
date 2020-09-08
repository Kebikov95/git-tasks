package fundamentals.main;

import java.util.Scanner;

public class ReturnSumAndMultiply {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of the number of input numbers:");
        int quantity = in.nextInt();
        int[] array = new int[quantity];

        System.out.println("Enter integers on the command line:");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.printf("The sum of this array is %d.\n", arraySum(array));
        System.out.printf("The multiply of this array is %d.\n", arrayMultiply(array));
    }

    static int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static int arrayMultiply(int[] array) {
        int mult = 1;
        for (int i = 0; i < array.length; i++) {
            mult *= array[i];
        }
        return mult;
    }
}