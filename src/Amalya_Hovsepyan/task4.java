public class task4 {
    public static void main(String[] args) {
        int[][] num ={
                {2,5,7,12},
                {1,10,4,3},
                {8,9,15,14}
        };
        int evenSum=0;
        int oddSum=0;
        for (int a = 0; a < num.length;a++){
            for(int i =0; i < num[a].length;i++){
                if (num[a][i]%2 == 0){
                  evenSum += num[a][i];

                 }
                if(num[a][i]%2>0){
                    oddSum +=num[a][i];
                }
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
