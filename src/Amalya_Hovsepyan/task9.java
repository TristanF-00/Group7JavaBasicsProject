import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        String[] array = new String[5];
        System.out.println("Please enter 10 names for checking dublicates functionality!");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0;i<array.length;i++){
            System.out.print("Enter Name " + (i + 1) + ": ");

            String name = scanner.nextLine();
            array[i] = name;
        }



        for (int i=0; i< array.length;i++){

            for(int j=i + 1;j< array.length;j++){
                if(array[i].equals(array[j])){
                    System.out.println("Dublicated Value: " + array[i]);
                }
            }

        }
    }
}
