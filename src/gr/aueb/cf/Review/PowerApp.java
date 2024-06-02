package gr.aueb.cf.Review;

import java.util.Scanner;

public class PowerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int result = 1;

        System.out.println("please insert two numbers ");

        a = sc.nextInt();
        b = sc.nextInt();

        for(int i = 1; i <= b; i++ ){
            result *= a;
        }
        System.out.println(result);

    }
}
