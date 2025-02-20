package tristanFernandez;

import java.util.Scanner;

public class CT5 {
    public static void main(String[] args) {
        // Write a program to swap 2 numbers without a temporary variable.
        Scanner scan = new Scanner(System.in);

        // message to the user and asks for the numbers
        System.out.println("This program will switch 2 integer numbers without a temporary variable");
        System.out.print("Please enter the first number. ");
        int a = scan.nextInt();
        System.out.print("Please enter the second number. ");
        int b = scan.nextInt();
        // switching the numbers
        a = b + a;
        b = a - b;
        a = a - b;
        // print out the results
        System.out.println();
        System.out.println("Numbers have been switched.");
        System.out.println("The first number is now " + a);
        System.out.println("The second number is now " + b);
        scan.close();

    }
}
