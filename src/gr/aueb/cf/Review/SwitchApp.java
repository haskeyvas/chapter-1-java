package gr.aueb.cf.Review;

import java.util.Scanner;

public class SwitchApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        System.out.println("Please insert one of the following");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("Exit");
        System.out.println("please insert your choice");

        choice = sc.nextInt();

        switch ( choice ) {
            case 1:
                System.out.println("1");
                break;

            case 2:
                System.out.println("2");
                break;

            case 3:
                System.out.println("3");
                break;

            case 4:
                System.out.println("4");
                break;

            case 5:
                System.out.println("Exit");
                break;

            default:
                System.out.println("Error in choice. Try again");
                break;
        }
    }
}