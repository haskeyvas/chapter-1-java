package gr.aueb.cf.Review;

public class EternalWhile {

    public static void main(String[] args) {

        int i = 1;

        while ( i < 0) {
            System.out.println("Never gets in");
        }
        while (i <= 1 ){
            System.out.println("Only one iteration");
        }
        while (true) {
            System.out.println("I am eternal");
        }
    }
}
