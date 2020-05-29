package fundamentals.main;

import java.util.Arrays;
import java.util.Scanner;

public class ReturnRandomNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the value of the number of random numbers:");
        int quantity = in.nextInt();

        if(quantity <= 0){
            System.out.println("You entered an invalid value.");
        } else {
            int[] numbers = generateRandomNumbers(quantity);
            System.out.println("Please, select the option to output numbers to the console:\n" +
                    "1) in one line\n" +
                    "2) any number on a new line");
            int consoleValue = in.nextInt();

            switch (consoleValue){
                case 1:
                    System.out.println("Output numbers: " + Arrays.toString(numbers));
                    break;
                case 2:
                    System.out.println("Output numbers: ");
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.println(numbers[i]);
                    }
                    break;
                default:
                    throw new Error("You entered an invalid value.");
            }
        }
    }

    static int[] generateRandomNumbers(int quantity){
        int[] randomArray = new int[quantity];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 100);
        }
        return  randomArray;
    }
}