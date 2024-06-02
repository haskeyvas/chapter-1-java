package gr.aueb.cf.Review;

public class WithoutEpsilon {

    public static void main(String[] args) {
        double  actual = 0.0;
        double expected = 1.0;


        for (int i = 0; i < 10; i++){
            actual += 0.1;
        }
        if (actual == expected)
            System.out.println("actual and expected are equals , actual is = " + actual);
        else System.out.println("NOT EQUALS, actual is = " + actual);

    }
}
