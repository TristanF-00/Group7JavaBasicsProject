package tristanFernandez;

import java.util.Scanner;

public class CT2 {
    public static void main(String[] args) {
        /*
        Create an array of integer values. After the array is created, calculate the
        sum of all the stored elements in that array.
         */
        Scanner input = new Scanner(System.in);
        int arraySize;
        // message for the user
        System.out.println("This program will calculated the sum of all integer values in the array.");
        System.out.print("Please enter the size of the array: ");
        arraySize = input.nextInt();
        // creates array according to user input
        int[] array = new int[arraySize];
        // loop to get values from the user
        for (int i = 0; i < array.length; i++) {
            System.out.print("Please enter value number " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        // variable and loop to calculate the sum of the values in the array
        int sum = 0;
        for (int a : array) {
            sum += a;
        }
        // print out message to user with the sum of the elements
        System.out.println("Thank you for your input and the sum of all the values is: " + sum);
        input.close();
    }
}
