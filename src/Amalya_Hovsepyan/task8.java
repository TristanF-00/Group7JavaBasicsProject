import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
       int[] numberArray = {14,35,45,67,89,98};
       int largest = numberArray[0];
       int secondLargest =numberArray[0];

       for(int i =1; i<numberArray.length;i++){
             if(numberArray[i]>largest) {
                 secondLargest = largest;
                 largest=numberArray[i];

             }else if (numberArray[i]>secondLargest && numberArray[i] != largest ){
                 secondLargest =numberArray[i];
             }

       }
        System.out.println("The second largest number is " + secondLargest);
    }
}
