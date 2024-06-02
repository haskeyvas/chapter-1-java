package gr.aueb.cf.Review;

import java.util.Scanner;

public class FactoApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("please insert the number (n!)");
        n = in.nextInt();

        System.out.println("the n! of number is: " + facto(n));
    }

    public static int facto (int n) {

        int facto = 1;

        for (int i = 1; i <= n; i++){
            facto *= i;
        }
        return facto;
    }
}
