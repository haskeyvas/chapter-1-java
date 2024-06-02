package gr.aueb.cf.Review;

import java.util.Scanner;

public class PowerPowerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int result = 1;
        int i = 1;

        System.out.println("Please insert two integers");
        a = sc.nextInt();
        b = sc.nextInt();

        while (i <= b){
            result *= a ;
            i++;

        }
        System.out.printf("result of %d ^ %d  = %d ", a , b , result);
    }
}
