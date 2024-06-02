package gr.aueb.cf.Review;

import java.util.Scanner;

public class FactorialApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;
        int facto = 1;
        int i = 1;

        System.out.println("please insert a n!");
        n = sc.nextInt();

        while( i<= n){
            facto *= i;
            i++;
        }
        System.out.printf("%d! = %d", n, facto);
    }

}
