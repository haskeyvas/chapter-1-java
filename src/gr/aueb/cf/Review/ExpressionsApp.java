package gr.aueb.cf.Review;

public class ExpressionsApp {

    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 5;
        int sum = 0;
        int sub = 0;
        int div = 0;
        int mul = 0;
        int mod = 0;

        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;
        int result5 = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        div = num1 / num2;
        mul = num1 * num2;
        mod = num1 % num2;

        result1 = num1++; // result1 = 12
        //result1 = num1++ + num2++;
        result2 = ++num1; // final result2 = num1 = 14
        result3 += num1; // final result3 = result3 + num1
        result4 = num1 / num2;
        result5 = num1 % num2;

        System.out.printf("the result of sum: %d , sub: %d, div: %d, mul: %d, mod: %d\n", sum, sub, div, mul, mod);
        System.out.printf("result1: %d, result2: %d, result3: %d, result4: %d, result5: %d", result1,
                result2, result3, result4, result5);
    }
}