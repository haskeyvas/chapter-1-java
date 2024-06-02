package gr.aueb.cf.Review;

import java.util.Scanner;

public class GenericWhileApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int startValue = 0;
        int endValue = 0;
        int step = 0;
        int counter = 0;
        //int iterations = 0;





        System.out.println("please insert startvalue, endvalue and step");
        startValue = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        while(startValue < endValue) {
            counter++;
            startValue += step;
        }

        System.out.println("the iterations are: " + counter);
    }
}
