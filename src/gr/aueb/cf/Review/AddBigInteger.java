package gr.aueb.cf.Review;

import java.math.BigInteger;

public class AddBigInteger {

    public static void main(String[] args) {

        BigInteger bigNum1 = new BigInteger("123456789099");
        BigInteger bigNum2 = new BigInteger("12345678");

        BigInteger result = bigNum1.add(bigNum2);
        BigInteger result2 = bigNum1.subtract(bigNum2);

        System.out.println("the result is :" + result);
        System.out.println("the result is :" + result2);
    }
}
