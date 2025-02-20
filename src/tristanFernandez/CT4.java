package tristanFernandez;

import java.util.Scanner;

public class CT4 {
    public static void main(String[] args) {
        /*
        Create a 2D array of integers. Develop a program which will calculate the
        sum of even and odd numbers for that array.
        odd and even separate
         */
        Scanner input = new Scanner(System.in);
        int rows, columns;
        // message for the user and asks for the rows and columns for the 2D array
        System.out.println("This program will create a 2D integer array and then calculate the sum of all even numbers and then the sum of all odd numbers entered.");
        System.out.print("Please enter the number of rows for the 2D array. ");
        rows = input.nextInt();
        System.out.print("Please enter the number of columns for the 2D array. ");
        columns = input.nextInt();
        // creates 2D array according to user input
        int[][] dDarray = new int[rows][columns];
        // asks user for values
        for (int i = 0; i < dDarray.length; i++) {
            System.out.println("Row " + (i + 1));
            for (int j = 0; j < dDarray[i].length; j++) {
                System.out.print("Please enter value " + (j + 1) + ": ");
                dDarray[i][j] = input.nextInt();
            }
            System.out.println();
        }
        // calculates the sum of all even numbers and the same for odd
        int evenSum = 0, oddSum = 0;
        for (int[] a : dDarray) {
            for (int b : a) {
                if (b % 2 == 0) {
                    evenSum += b;
                } else {
                    oddSum += b;
                }
            }
        }
        // print the results to the user
        System.out.println("Thank you for your input and we will now give you the results.");
        System.out.println("The sum of all the even numbers in the 2D array is: " + evenSum);
        System.out.println("The sum of all the odd numbers in the 2D array is: " + oddSum);
        input.close();
    }
}
