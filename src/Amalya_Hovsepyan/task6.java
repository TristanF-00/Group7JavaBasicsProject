import java.util.Scanner;
import java.util.SortedMap;

public class task6 {
    public static void main(String[] args) {
        System.out.println("check the whether number is it prime or not");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scanner.nextInt();


        if (num%2==0){
            System.out.println(num + " is a prime number ");

        }else {
            System.out.println(num + " is not prime number");
        }
    }
}
