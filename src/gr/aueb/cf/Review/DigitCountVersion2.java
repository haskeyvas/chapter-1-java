package gr.aueb.cf.Review;

import java.util.Scanner;

public class DigitCountVersion2 {

    public static void main(String[] args) {

        int num = 0;
        int count = 0;
        int inPutNum = 0;

        System.out.println("please insert a number");
        Scanner sc = new Scanner(System.in);
        inPutNum = sc.nextInt();

        num = inPutNum;

        for ( int i = 1; i <= num; i++ ) {
            num = num%10;
            count ++;
            //System.out.println("the number of digits are:" +count);
        }
        System.out.printf("Num: %d the number %d digits:", inPutNum , count  );
    }
}
