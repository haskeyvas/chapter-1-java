package gr.aueb.cf.Review;

import java.util.Scanner;

public class ScannerApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int sum;

        System.out.println("please insert the numbers");

        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        sum = num1 + num2 - num3;

        System.out.println(num1 + "+" + num2 + "-"+ num3 + "=" +sum );

    }
}
