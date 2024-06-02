package gr.aueb.cf.Review;

import java.util.Scanner;

public class ArrayPopulateKeyboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] ages = new int[5];

        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i] + " ");

            ages[i] = in.nextInt();
        }
        for ( int i = 0; i < ages.length; i++){
            System.out.println(ages[i] + " " );
        }

        in.close();
    }
}
