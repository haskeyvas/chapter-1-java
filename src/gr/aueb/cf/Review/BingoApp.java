package gr.aueb.cf.Review;

import java.util.Scanner;

public class BingoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inPutNum = 0;
        int key = 10;

        System.out.println("please guess the key number");
        inPutNum = in.nextInt();


        if (inPutNum == key) {
            System.out.println("BINGO");
        } else {
            System.out.println("Please guess again");

        }

    }
}
