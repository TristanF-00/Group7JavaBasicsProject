public class task1 {
    public static void main(String[] args) {
        double[] temperature = {21.5, 23.0, 25.5, 26.0, 30.0, 32.0, 35.5};

        double theSmallnumber = temperature[0];
        double theHighestnumber = temperature[0];

        for (double tem : temperature){
            if (tem < theSmallnumber){
                theSmallnumber = tem;
            }

            if (tem > theHighestnumber){
                theHighestnumber = tem;
            }

        }
        System.out.println(theSmallnumber);
        System.out.println(theHighestnumber);
    }
}
