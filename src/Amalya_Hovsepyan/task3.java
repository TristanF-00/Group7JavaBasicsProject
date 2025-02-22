public class task3 {
    public static void main(String[] args) {
        int[][] number = {
                {1,3,6,14,20},
                {4,5,8,30,44,24},
                {2,11,12,88}
        };
        for(int i =0; i<number.length;i++){
            for(int e =0;e<number[i].length;e++){
                if(number[i][e]%2==0){
                    System.out.println(number[i][e]);
                }
            }
        }
    }
}
