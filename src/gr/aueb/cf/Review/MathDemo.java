package gr.aueb.cf.Review;

import java.util.Scanner;

public class MathDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = -5;
        int num2 = 12;
        int num3 = 88;
        int num4 = 3;
        int num5;

        int die = (int) (Math.random() * 6) + 1;

        System.out.println("please insert a number");
        num5 = sc.nextInt();
//
//        System.out.printf("the absolute value of -5 is:" + Math.abs(num1) +"\n");
//        System.out.printf("the max value between num1 and num2 is :" + Math.max(num1,num2) + "\n");
//        System.out.printf("the max value between num1 and num2 is :" + Math.min(num3,num1) + "\n");
//        System.out.printf("the max value between num1 and num2 is :" + Math.pow(num1, num4) + "\n");
//        System.out.println(die);
        System.out.println("the square and cube of num1 is :" + (float) Math.sqrt(num5));

    }
}
