package gr.aueb.cf.Review;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger w = new BigInteger("0");

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ZERO;
        BigInteger result = BigInteger.ONE;

        System.out.println("Please inser two big integers");
        a = sc.nextBigInteger();
        b = sc.nextBigInteger();

        for(int i = 1; i <= b.intValue(); i++){
            result = result.multiply(a);
        }
        System.out.println(result);

    }
}
