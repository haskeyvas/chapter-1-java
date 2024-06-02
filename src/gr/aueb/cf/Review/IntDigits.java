package gr.aueb.cf.Review;

import java.util.Scanner;

public class IntDigits {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("please insert three numbers to find the greater");

        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        System.out.println("the greater number is: " +Math.max(num1, Math.max(num2,num3)));
    }
}
