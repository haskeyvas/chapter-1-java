package gr.aueb.cf.Review;

import java.util.Scanner;

public class PowerVersion2App {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = 0;
        int b = 0;

        a = in.nextInt();
        b = in.nextInt();

        System.out.println("the a ^ b = " + pow(a,b));
    }

    public static int pow (int a , int b){

        int result = 1;

        for (int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }
}