package tristanFernandez;

import java.util.Scanner;

public class CT1 {
    public static void main(String[] args) {

        /* Create a program that uses an array to store a list of temperatures for a week,
        and then uses a loop to find the highest and the lowest temperature for the week.
         */

        Scanner fetch = new Scanner(System.in);
        double[] temps = new double[14];
        int day = 0;
        // informing the user
        System.out.println("This is a program to find the highest and lowest temperatures of the week.");
        // loop to obtain the temperatures from the user
        for (int i = 0; i < temps.length; i++) {
            if (i % 2 == 0) {
                day += 1;
                System.out.println("Day: " + day);
                System.out.print("Please enter the high for the day: ");
            } else {
                System.out.print("Please enter the low for the day: ");
            }
            temps[i] = fetch.nextDouble();
        }
        // message to the user
        System.out.println("Thank you for entering the temperatures for the week.  We will now calculate the highest and lowest temperatures for this week.");
        // variables for the highest and lowest temperatures of the week.
        double high = temps[0], low = temps[0];
        // loop to find the high and low of the week
        for (double a : temps) {
            if (a > high) {
                high = a;
            } else if (a < low) {
                low = a;
            }
        }
        day = 0;
        for (int i = 0; i < temps.length; i++) {
            if (i % 2 == 0) {
                day += 1;
            }
            if (high == temps[i]) {
                System.out.print("The highest temperature of the week was: " + high);
                System.out.println("  recorded on day :" + day);
            }
            if (low == temps[i]) {
                System.out.print("The lowest temperature of the week was: " + low);
                System.out.println("  recorded on day :" + day);
            }
        }
        fetch.close();
    }
}
