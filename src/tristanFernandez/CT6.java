package tristanFernandez;

import java.util.Scanner;

public class CT6 {
    public static void main(String[] args) {
        // Write a java program to check whether a given numbers is prime or not.
        Scanner scan = new Scanner(System.in);
        int num;
        // message for the user and asks for the given number.
        System.out.println("This program will check if the number given is prime or not.");
        System.out.print("Please enter the number you would like to check. ");
        num = scan.nextInt();
        System.out.println();
        // check if the number is prime
        if (num < 2) {
            System.out.println(num + " is not a prime number.");
        }
        for (int i = 2; i <= num; i++) {
            if (num == i && num % i == 0) {
                System.out.println(num + " is a prime number.");
                break;
            } else if (num % 2 == 0) {
                System.out.println(num + " is not a prime number.");
                break;
            } else if (num % i == 0) {
                System.out.println(num + " is not a prime number.");
                break;
            }
        }
        scan.close();
    }
}
