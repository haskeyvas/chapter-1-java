package gr.aueb.cf.Review;

public class PowerRecursive {

    public static void main(String[] args) {

        int a = 5;
        int b = 2;
        System.out.println("the result a ^ b = " + pow(a,b));

    }

    public static int pow (int a , int b){

        if ( b == 0 ){
            return 1;
        } else {
            return a * pow( a, b - 1 );
        }
    }
}
