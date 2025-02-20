package tristanFernandez;

import java.util.Scanner;

public class CT3 {
    public static void main(String[] args) {
        /*
        Create a 2D array of integer type where you will store odd and even
        numbers. Develop a program which will identify/print the even numbers
        only.
         */
        Scanner fetch = new Scanner(System.in);
        int rows, columns;
        // message for the user and asks for rows and columns of the 2D array
        System.out.println("This program will create a 2D integer array and then print only the even numbers.");
        System.out.print("Please enter the numbers of rows you would like in the 2D array. ");
        rows = fetch.nextInt();
        System.out.print("Please enter the number of columns you would like in the 2D array. ");
        columns = fetch.nextInt();
        // creates the 2D array according to the users input
        int[][] tDArray = new int[rows][columns];
        // asks the user to fill out the 2D array
        for (int i = 0; i < tDArray.length; i++) {
            System.out.println("Row: " + (i + 1));
            for (int j = 0; j < tDArray[i].length; j++) {
                System.out.print("Please enter value " + (j + 1) + ": ");
                tDArray[i][j] = fetch.nextInt();
            }
            System.out.println();
        }
        // prints out only the even numbers from the 2D array
        System.out.println("Thank you for your input and we will now print out the even numbers only.");
        for (int[] a : tDArray) {
            for (int b : a) {
                if (b % 2 == 0) {
                    System.out.println(b);
                }
            }
        }
        fetch.close();
    }
}
