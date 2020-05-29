package fundamentals.option;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the quantity of numbers:");
        int quantity = in.nextInt();
        int[] array = new int[quantity];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please, enter a number:");
            array[i] = in.nextInt();
        }

        findShortestNumber(array);              // part 1
        findLongestNumber(array);               // part 1
        printArrayInAscendingLength(array);     // part 2
        printNumbersLessAverageLength(array);   // part 3
        findNumberWithMinDigits(array);         // part 4
        findQuantityOfAllEvenNumbers(array);    // part 5
        findNumberWhichAscendingDigits(array);  // part 6
        findNumberWithVariousDigits(array);     // part 7
    }

    // 1. Find the shortest and longest number. Print the found numbers and their length.
    static void findShortestNumber(int[] array) {
        int index = 0;
        int length;

        for (int i = 0; i < array.length; i++) {
            length = String.valueOf(array[i]).length();
            if (length < String.valueOf(array[index]).length()) {
                index = i;
            }
        }
        System.out.printf("1. The shortest number: %d. His length is %d.\n"
                , array[index], String.valueOf(array[index]).length());
    }

    static void findLongestNumber(int[] array) {
        int index = 0;
        int length;

        for (int i = 0; i < array.length; i++) {
            length = String.valueOf(array[i]).length();
            if (length > String.valueOf(array[index]).length()) {
                index = i;
            }
        }
        System.out.printf("   The longest number: %d. His length is %d.\n"
                , array[index], String.valueOf(array[index]).length());
    }

    // 2. Print the numbers in ascending (descending) values of their length.
    static void printArrayInAscendingLength(int[] array) {
        int[] cloneArray = array.clone();
        Arrays.sort(cloneArray);
        System.out.println("2. Print array in ascending values: " + Arrays.toString(cloneArray));
    }

    // 3. Print to the console those numbers whose length is less than (greater than)
    // the average length for all numbers, as well as the length.
    static void printNumbersLessAverageLength(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += String.valueOf(array[i]).length();
        }
        final int averageValue = sum / array.length;

        System.out.printf("3. The average length value is %d." +
                " Display numbers less than average value:\n", averageValue);
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter++;
            if (String.valueOf(array[i]).length() < averageValue) {
                System.out.printf("\tEntered number position #%d - %d;\n", counter, array[i]);
            }
        }
    }

    // 4. Find a number in which the number of different digits is minimal.
    // If there are several such numbers, find the first one.
    static void findNumberWithMinDigits(int[] array) {
        String[] strNumbers = new String[array.length];
        int[] equalQuantity = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            strNumbers[i] = String.valueOf(array[i]);
        }

        for (int i = 0; i < strNumbers.length; i++) {
            String[] letterArray = strNumbers[i].split("");
            int counter = 0;

            for (int j = 0; j < letterArray.length; j++) {
                for (int k = 0; k < letterArray.length; k++) {
                    if (j != k) {
                        if (letterArray[j].equals(letterArray[k])) {
                            counter++;
                        }
                    }
                }
            }
            equalQuantity[i] = counter;
        }

        int maxEqualQuantity = equalQuantity[0];
        int index = 0;
        for (int i = 0; i < equalQuantity.length; i++) {
            if (maxEqualQuantity < equalQuantity[i]) {
                index = i;
            }
        }
        System.out.printf("4. The number with max equal quantity is %d.\n", array[index]);
    }

    // 5. Find the number of numbers containing only even numbers, and among the remaining numbers,
    // the number of numbers with an equal number of even and odd numbers.
    static void findQuantityOfAllEvenNumbers(int[] array) {
        int countOnlyEvenNumeric = 0;
        int countEqualOddEvenNumeric = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isOddDigit = true;
            String[] stringsNumbers = String.valueOf(array[i]).split("");
            for (int j = 0; j < stringsNumbers.length; j++) {
                if (Integer.parseInt(stringsNumbers[j]) % 2 == 1) {
                    isOddDigit = false;
                }
            }

            if (isOddDigit) {
                countOnlyEvenNumeric++;
            } else {
                int countEvenNumbers = 0;
                int countOddNumbers = 0;
                String[] stringNumbers = String.valueOf(array[i]).split("");

                for (int j = 0; j < stringNumbers.length; j++) {

                    if (Integer.parseInt(stringsNumbers[j]) % 2 == 1) {
                        countOddNumbers++;
                    } else {
                        countEvenNumbers++;
                    }
                }
                if (countEvenNumbers == countOddNumbers) countEqualOddEvenNumeric++;
            }
        }
        System.out.printf("5. The quantity of numbers" +
                " containing only even numbers: %d.\n", countOnlyEvenNumeric);
        System.out.printf("   The quantity of numbers" +
                " with an equal number of even and odd digits: %d.\n", countEqualOddEvenNumeric);
    }

    // 6. Find a number in which the digits are in strict ascending order.
    // If there are several such numbers, find the first one.
    static void findNumberWhichAscendingDigits(int[] array) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            int j = 0;
            boolean isNextNumberIncreasing = true;
            String[] strNumber = String.valueOf(array[i]).split("");

            if (strNumber.length > 1) {
                while (j < (strNumber.length - 1) && isNextNumberIncreasing) {
                    if (Integer.parseInt(strNumber[j]) < Integer.parseInt(strNumber[j + 1])) {
                        j++;
                    } else {
                        isNextNumberIncreasing = false;
                    }
                }
            } else {
                isNextNumberIncreasing = false;
            }
            if (isNextNumberIncreasing) {
                number = array[i];
                break;
            }
        }
        System.out.printf("6. The number in which the digits" +
                " are in strict ascending order: %d.\n", number);
    }

    // 7. Find a number consisting only of various digits. If there are several such numbers, find the first one.
    static void findNumberWithVariousDigits(int[] array) {
        int number = 0;

        for (int i = 0; i < array.length; i++) {
            String[] digitsArray = String.valueOf(array[i]).split("");
            boolean isVariousNumbers = true;

            if(digitsArray.length > 1 && number == 0){
                for (int j = 0; j < digitsArray.length; j++) {
                    for (int k = 0; k < digitsArray.length; k++) {

                        if(j != k){
                            if(digitsArray[j].equals(digitsArray[k])){
                                isVariousNumbers = false;
                            }
                        }
                    }
                }
            } else {
                isVariousNumbers = false;
            }

            if(isVariousNumbers) number = array[i];
        }
        System.out.printf("7. The number consisting only of various digits is %d.\n", number);
    }
}