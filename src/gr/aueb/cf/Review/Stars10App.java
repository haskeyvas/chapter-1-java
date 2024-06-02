package gr.aueb.cf.Review;

public class Stars10App {

    public static void main(String[] args) {

        int i = 1;
        int sum1 = 10;
        int sum2 = 0;
        int j = 1;

        while(i < 10) {
            System.out.println(" * ");
            System.out.print(" * ");
            i++;
        }

        while(j <= 10) {
            System.out.println(sum2);
            sum2 +=  i;
            i++;
        }
    }
}
