package gr.aueb.cf.Review;

import java.util.Scanner;

public class SwitchFallThrough {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice;

        System.out.println("please insert a grade");
        choice = in.nextInt();

        //do{
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("fail the exams");
                    break;
                case 5:
                case 6:
                    System.out.println("nice try");
                    break;
                case 7:
                case 8:
                    System.out.println("very good");
                    break;
                case 9:
                case 10:
                    System.out.println("Excellent");
                    break;

                default:
                    System.out.println("please insert a choice from 1 - 10");
                    break;
            }

        //} while(choice != 0);
        System.out.println("your exam grade :" + choice);
    }
}
