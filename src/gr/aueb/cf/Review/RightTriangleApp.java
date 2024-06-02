package gr.aueb.cf.Review;

import java.util.Scanner;

public class RightTriangleApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final double EPSILON = 0.000005;
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        boolean isTriangle = false;

        System.out.println("please insert three numbers");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        isTriangle = (Math.abs(a*a - b*b - c*c) <= EPSILON); {
            System.out.println("the triangle is" + isTriangle);
        }

    }
}
