package gr.aueb.cf.Review;

import java.util.Scanner;

public class GenericWhileWhileApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int startValue = 0;
        int endValue = 0;
        int step = 0;
        int counter = 0;
        int times = 1;


        while (times <= 3) {
            System.out.println("please insert startvalue, endvalue and step");
            startValue = in.nextInt();
            endValue = in.nextInt();
            step = in.nextInt();

            while (startValue <= endValue) {
                counter += 1;
                startValue += step;
            }

            System.out.println("the iterations are: " + counter);
            times++;
        }
    }
}