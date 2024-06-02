package gr.aueb.cf.Review;

import java.util.Scanner;

public class SentinelApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("please provide a num(-1) for quiet");
        num = sc.nextInt();

        while (num != -1) {
            iterations++;
            System.out.println("please provide a num");
            num = sc.nextInt();
        }
        System.out.printf("%d iterations" , iterations);
    }
}
