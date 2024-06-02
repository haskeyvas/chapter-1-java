package gr.aueb.cf.Review;

import java.util.Scanner;

public class DigitCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int countNum = 0;
        int inPutNum = 0;

        System.out.println("please insert a num");
        inPutNum = sc.nextInt();
        num = inPutNum;

        do {
            countNum++;
            num = num/10;
        } while (num != 0);
        System.out.printf("Num %d consists of %d digits:", num , countNum);
    }
}
