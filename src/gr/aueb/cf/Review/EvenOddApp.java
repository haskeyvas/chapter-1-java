package gr.aueb.cf.Review;

import java.util.Scanner;

public class EvenOddApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = 0;

        System.out.println("please insert a number");
        a = in.nextInt();
        System.out.printf("Ο %d%s είναι άρτιος,", a, isEven(a) ? " " : "δεν " );

    }

    public static boolean isEven (int a){
        return (a % 2) == 0;
    }

    public static boolean isOdd (int a){
        return !isEven(a);
    }
}
