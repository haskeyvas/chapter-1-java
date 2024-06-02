package gr.aueb.cf.Review;

public class EpsilonApp {

    public static void main(String[] args) {

        final double EPSILON = 0.000005;
        double actual = 0.0;
        double expected = 1.0;

        for ( int i = 0; i <= 10; i++){
            actual += 0.1;
        }


        if ( Math.abs(expected - actual) <= EPSILON ){
            System.out.println("EQUALS");
        } else System.out.println("NOT EQUALS");
    }
}
