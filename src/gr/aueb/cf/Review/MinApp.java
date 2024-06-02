package gr.aueb.cf.Review;

import java.util.Scanner;

public class MinApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int min = 0;
        int num1 = 0;
        int num2 =0;

        System.out.println("please insert two numbers");
        num1= in.nextInt();
        num2 = in.nextInt();


        if (num1 == num2){
            System.out.println("the min1 and min2 are equals");
        }
        else if  (num2 < num1){
            min = num2;
        } else {
            min = num1;
        }
        System.out.println("the min number is: " + min);
    }
}
