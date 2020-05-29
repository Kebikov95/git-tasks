package collections.optional;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

// 2. Enter a number, put its numbers on the stack.
// Print a number whose numbers go in the reverse order (example: '4321').
public class PrintNumberWithReverseOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Integer> stack = new ArrayDeque<>();
        boolean answer = false;
        while(!answer){
            System.out.println("Please, enter a number: ");
            int number = in.nextInt();
            String digits[] = splitNumberIntoDigits(number);
            for (String digit:digits) {
                stack.add(Integer.parseInt(digit));
            }
            if (displayNumberWithReverseOrder(number)) {
                answer = true;
                System.out.println("The number whose numbers go in the reverse order: " + number);
            }
        }
        System.out.println("The stack: " + stack);
    }

    static boolean displayNumberWithReverseOrder(int number){
        String[] digitArray = splitNumberIntoDigits(number);
        boolean isReverseOrder = true;
        if(digitArray.length > 1) {
            int i = 0;
            while(digitArray.length - 2 >= i && isReverseOrder == true) {
                if(Integer.parseInt(digitArray[i]) != (Integer.parseInt(digitArray[i + 1]) + 1)) {
                    isReverseOrder = false;
                }
                i++;
            }
        } else {
            isReverseOrder = false;
        }
        return isReverseOrder;
    }

    static String[] splitNumberIntoDigits(int number){
        return String.valueOf(number).split("");
    }
}
