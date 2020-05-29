package collections.optional;

import java.util.Arrays;
import java.util.List;

// 5. Without using auxiliary objects,
// rearrange the negative elements of this list to the end,
// and positive ones to the beginning of the list.
public class PermutationNegativeAndPositiveElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(
                1, 2, 3, 4, 5 , 1, 1, 9, 2, -2, 1, -5, 2, 6, -4, 4, 2, -8, -2, 1, -9, 0, -8
        );
        list.sort((number1, number2) -> number1.intValue() - number2.intValue());
        System.out.println("The sorted list: " + list);
    }
}
