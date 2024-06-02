package gr.aueb.cf.Review;

import java.util.Scanner;

public class PositivesCountApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;

        System.out.println("Please insert a num (int)");
        num = sc.nextInt();

        while (num >= 0) {
            positivesCount++;
            System.out.println("Please insert a num (int)");
            num = sc.nextInt();
        }
        System.out.println("Positive counts :" + positivesCount);
    }
}
