package gr.aueb.cf.Review;

public class CompareCharApp {

    public static void main(String[] args) {

        char a = 'α';
        char b = 'b';
        char c = 'r';
        char d = 'Z' ;
        boolean greekIsGreater = false;

        System.out.println((int) a);
        System.out.println((int) b);

        if( a > b){
            greekIsGreater = true;
        }
        System.out.println("the greek 'α' is greater than 'b' :" + greekIsGreater);
        System.out.printf("the char a  in ordinal is %d", (int) a);

        System.out.println();
        if( c > d){
            greekIsGreater = true;
        }
        System.out.println((int) c);
        System.out.println((int) d);
        System.out.println("the greek 'r' is greater than 'Z' :" + greekIsGreater);




    }
}
