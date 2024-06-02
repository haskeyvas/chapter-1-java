package gr.aueb.cf.Review;

import java.util.Scanner;

public class TankApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean isEmptyTank1 = false;
        boolean isEmptyTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("please insert the tank 1 status (true/false)");
        isEmptyTank1 = in.nextBoolean();

        System.out.println("please insert the tank 2 status (true/false)");
        isEmptyTank2 = in.nextBoolean();

        isOrange = (isEmptyTank1) ^ (isEmptyTank2);
        System.out.println("the tank is full: " + isOrange );

        isRed = (isEmptyTank1) && (isEmptyTank2);
        System.out.println("the tank is full: " + isRed );



    }
}
