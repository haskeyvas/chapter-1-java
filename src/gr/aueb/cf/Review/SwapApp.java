package gr.aueb.cf.Review;

public class SwapApp {

    public static void main(String[] args) {

        int a = 5;
        int b = 7;
        swap(a,b);

        System.out.printf(" a = %d and  b = %d " , a , b);

    }

    public static void swap (int a , int b) {

        int temp = a;
        a = b ;
        b = temp;
    }
}
