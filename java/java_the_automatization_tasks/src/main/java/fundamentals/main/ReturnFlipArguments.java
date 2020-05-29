package fundamentals.main;

import java.util.Arrays;
import java.util.Scanner;

public class ReturnFlipArguments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder string = new StringBuilder();
        String line;

        do{
            System.out.println("Please, enter arguments in the command line or ':wq' for exit:");
            line = in.nextLine();

            if(!line.equals(":wq")){
                string.append(line + ",");
            } else {
                string.replace(string.length() - 1, string.length(), "");
            }
        } while(!line.equals(":wq"));
        System.out.println("The return arguments: " + Arrays.toString(reverseString((new String(string)))));
    }

    static String[] reverseString(String str){
        String[] stringArray = str.split(",");
        String[] returnString = new String[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            returnString[i] = stringArray[stringArray.length - i - 1];
        }
        return returnString;
    }
}