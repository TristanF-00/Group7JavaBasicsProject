package tristanFernandez;

import java.util.Scanner;

public class CT10 {
    public static void main(String[] args) {
        // Write a program to print out duplicate elements from an array of Strings.
        Scanner scan = new Scanner(System.in);
        int size;
        // message out to the user
        System.out.println("This program will print out duplicate elements from an array of strings.");
        System.out.print("Please enter the size of the String array you would like. ");
        size = scan.nextInt();
        scan.nextLine();
        // makes the array according to size
        String[] strings = new String[size];
        // asks the user for the elements
        for (int i = 0; i < strings.length; i++) {
            System.out.print("Please enter string " + (i+1) + ": ");
            strings[i] = scan.nextLine();
        }
        int dups = 0;
        // check if there are any duplicates
        for (int i = 0; i < strings.length; i++) {
            for (int j = i +1; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    dups += 1;
                    System.out.println("There was a duplicate found on string " + (i+1) + " and string " + (j+1));
                    System.out.println("Duplicate string: " + strings[i]);
                }
            }
        }
        // tells the user how many duplicates were found
        System.out.println("There were " + dups + " duplicates found.");
        scan.close();
    }
}
