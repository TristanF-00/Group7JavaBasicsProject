package tristanFernandez;

import java.util.Scanner;

public class CT8 {
    public static void main(String[] args) {
        // maximum and minimum number in the array
        Scanner scan = new Scanner(System.in);
        int size;
        // message to user to ask for how many integers are in the array
        System.out.println("This program will tell you the minimum and maximum numbers in the array you provide.");
        System.out.print("Please enter the size of the integer array you would like. ");
        size = scan.nextInt();
        // make the array
        int[] numArr = new int[size];
        // asks the user for the elements
        for (int i = 0; i < numArr.length; i++) {
            System.out.print("Please enter value " + (i+1) + ": ");
            numArr[i] = scan.nextInt();
        }
        // find the maximum and minimum
        int max = numArr[0], min = numArr[0];
        for (int a : numArr) {
            if (a > max) {
                max = a;
            } else if (a < min) {
                min = a;
            }
        }
        // print out the results to the user
        System.out.println("The maximum number in the array is: " + max);
        System.out.println("The minimum number in the array is: " + min);
        scan.close();
    }
}
