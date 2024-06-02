package gr.aueb.cf.Review;

import java.util.Scanner;

public class BreakContinueApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while(true) {
            System.out.println("please provide a number");
            num = sc.nextInt();

            if ( num == 5) {
                continue;
            }
            sum += num;

            if (num == 10){
                break;
            }

        }
        System.out.println("sum : " + sum);
    }
}
