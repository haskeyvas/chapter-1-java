package gr.aueb.cf.Review;

import java.util.Scanner;

public class BingoDoWhile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inPutNum = 0;
        final int SECRET = 10;
        boolean bingo = false;

        while (true) {
            System.out.println("please guess the bingo number");
            inPutNum = in.nextInt();

            if (inPutNum == SECRET) {
                bingo = true;
                System.out.println("BINGO");
                break;
            }
            System.out.println("try again");
        }
    }
}