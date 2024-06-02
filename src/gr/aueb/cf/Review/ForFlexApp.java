package gr.aueb.cf.Review;

import java.util.Scanner;

public class ForFlexApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int startValue = 0;
        int endValue = 0;
        int step = 0;
        int iterations = 0; // how many iterations??

        System.out.println("please insert start, end and step ");
        startValue = sc.nextInt();
        endValue = sc.nextInt();
        step = sc.nextInt();

        for(int i = startValue; i < endValue; i = i + step){
            iterations = (endValue-startValue)/ step;
            System.out.println(" " +i);

            //iterations++;
        }

        System.out.println("iterations are :" +iterations);
    }
}
