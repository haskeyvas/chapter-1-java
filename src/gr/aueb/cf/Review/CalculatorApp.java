package gr.aueb.cf.Review;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        char operator = ' ';
        int choice = 0;
        boolean isError = false;

        System.out.println("please insert an int, an operator, and a second operator");

        num1 = sc.nextInt();
        operator = sc.next().charAt(0);
        num2 = sc.nextInt();

        switch (operator){
            case '+' :
                result = num1 + num2;
                break;

            case '-' :
                result = num1 - num2;
                break;

            case '*' :
                result = num1 * num2;
                break;

            case '/' :
                if( num2 == 0) {
                    System.out.println("the mod is error");
                }
                result = num1 / num2;
                break;

            case '%' :
                if( num2 == 0) {
                    System.out.println("the mod is error");
                }
                result = num1 % num2;
                break;

            default:
                System.out.println("error in operator");
                isError = true;
                break;

        }
        //if(!isError)
            System.out.printf("%d %c %d = %d" , num1 , operator, num2 , result);
    }
}
