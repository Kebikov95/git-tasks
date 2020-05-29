package fundamentals.main;

import java.util.Scanner;

public class HelloUsers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter your name:");
        String userName = in.next();
        System.out.printf("Hello, %s!", userName);
    }
}
