package tristanFernandez;

import java.util.Scanner;

public class CT7 {
    public static void main(String[] args) {
        // write a Java Program to print the first 10 numbers of the Fibonacci series.
        Scanner scan = new Scanner(System.in);
        int numf;
        // message to the user
        System.out.println("This program will print out the first ten numbers of the Fibonacci series.");
        int[] fib = new int[10];
        // print out message to the user
        System.out.print("The first 10 numbers of the Fibonacci series are: ");
        // loop to fill in the array with the Fibonacci series
        for (int i = 0; i < 10; i++) {
            if (i < 2){
                fib[i] = i;
            } else {
                fib[i] = fib[i - 2] + fib[i - 1];
            }
            // printing out the series as we fill it out
            System.out.print(fib[i]);
            if (i != 9) {
                System.out.print(", ");
            }
        }
        // additional for fun
        System.out.println();
        // asks the user for how many numbers they want to see
        System.out.print("Please enter how many numbers of the Fibonacci series you'd like to see. ");
        numf = scan.nextInt();
        // makes the array accordingly
        fib = new int[numf];
        System.out.println("The first " + numf + " numbers of the Fibonacci series are.");
        // fill out the array
        for (int i = 0; i < fib.length; i++) {
            if (i < 2) {
                fib[i] = i;
            } else {
                fib[i] = fib[i-2] + fib[i-1];
            }
            // prints out the numbers as they generated
            System.out.print(fib[i]);
            if (i != fib.length -1) {
                System.out.print(", ");
            }
        }
        scan.close();
    }
}
