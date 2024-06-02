package gr.aueb.cf.Review;

public class App {

    public static void main(String[] args) {
        int [][] arr = {{2,7,6},
                        {9,5,1},
                        {4,3,8}
        };


        int hSum = 0;
        int diagonal1Sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            //hSum += arr[i][j];

            diagonal1Sum += arr[i][i];
//                //System.out.println(arr[i][j]);
//                System.out.println(" ");
//                //System.out.println(hSum);
//
//                System.out.println(" ");

                System.out.println(diagonal1Sum);

            }
        }





    }
}
