import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println("this program is for swaping numbers");
        System.out.println("please provide number one ");
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        System.out.println("please provide number two");

        int num2 = scan.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
