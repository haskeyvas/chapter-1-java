package gr.aueb.cf.Review;

import java.util.Scanner;

public class NestedIfApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int totalMark = 0;
        int moduleCount = 0;
        int average = 0;

        System.out.println("please insert the sum of grades");
        totalMark = in.nextInt();

        System.out.println("please insert the modules count");
        moduleCount = in.nextInt();

        if ( moduleCount == 0){
            System.out.println("modules count can not be zero");
            System.exit(1);
        }
        average = totalMark/moduleCount;
        if ( average > 10 || average < 0){
            System.out.println("error in input data");
            System.exit(1);
        }

        if ( average >= 9) {
            System.out.println("Excellent :" + average);
        }
        else if ( average >= 7) {
            System.out.println("Very good :" + average);
        }

        else if ( average >= 5) {
            System.out.println("borderline :" + average);
        }
        else if ( average < 5) {
            System.out.println("failed :" + average);
        }


    }
}
