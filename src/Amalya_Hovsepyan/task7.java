public class task7 {
    public static void main(String[] args) {
         int currentNum = 0;
         int secondNum = 1;
         int nextNum = 0;
        for (int num=0;num<10;num++){
            System.out.print(currentNum + " ");

            nextNum = currentNum + secondNum;
            currentNum = secondNum;
            secondNum = nextNum;
        }
        System.out.println();
    }
}
