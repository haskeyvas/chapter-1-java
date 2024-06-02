package gr.aueb.cf.Review;

import java.util.Scanner;

public class SnowingAPP {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int temp = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println("please insert the temperature");
        temp = in.nextInt();

        System.out.println("please insert if it raining (true / false");
        isRaining = in.nextBoolean();

        isSnowing = (temp < 0) && (isRaining = true);

        System.out.println("it is snowing :" +isSnowing);


    }
}
