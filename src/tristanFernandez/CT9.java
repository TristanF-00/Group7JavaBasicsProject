package tristanFernandez;

import java.util.Scanner;

public class CT9 {
    public static void main(String[] args) {
        // Write a java program to find the second-largest number in the array.
        Scanner scan = new Scanner(System.in);
        int size;
        // message out to the user and asks for the size of the array
        System.out.println("This program will find the second largest number in the array you provide.");
        System.out.print("Please enter the size of the integer array you would like. ");
        size = scan.nextInt();
        // makes the array to size
        int[] nums = new int[size];
        // asks the user for the elements
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Please enter value " + (i+1) + ": ");
            nums[i] = scan.nextInt();
        }
        // find the second-largest number of the array
        int largest = nums[0], sndLargest = nums[0];
        for (int a : nums) {
            if (a > largest) {
                sndLargest = largest;
                largest = a;
            } else if (a > sndLargest) {
                sndLargest = a;
            } else if (a < largest && largest == sndLargest) {
                sndLargest = a;
            }
        }
        // message out to the user
        System.out.println("The second largest number in the array you provided is " + sndLargest);
        scan.close();
    }
}
