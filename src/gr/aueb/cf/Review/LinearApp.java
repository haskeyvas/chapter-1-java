package gr.aueb.cf.Review;

import java.util.Scanner;

public class LinearApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("please insert two numbers");
        num1 = in.nextInt();
        num2 = in.nextInt();

        do {
            if (num2 == 0) {
                System.out.println("ERROr, the denominator can not be zero ");
                break;
            }
            result = num1 / num2;
            System.out.printf("the result %d ^ %d = %d\n", num1, num2, result);
            System.out.println("please insert two numbers\n");
            num1 = in.nextInt();
            num2 = in.nextInt();
        } while (num2 != 0);
    }
}