package gr.aueb.cf.Review;

import java.util.Scanner;

public class TemperatureApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isTemperatureBelowZero = false;

        System.out.println("please insert the temperature");
        temp = in.nextInt();

        isTemperatureBelowZero = (temp < 0);

        System.out.println("the temperature is below zero " + isTemperatureBelowZero );

    }
}
