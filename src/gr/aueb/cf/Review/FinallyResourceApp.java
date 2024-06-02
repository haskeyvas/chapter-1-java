package gr.aueb.cf.Review;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyResourceApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        try {
            num = in.nextInt();;
            System.out.println();
        } catch (InputMismatchException e){
            e.printStackTrace();
        } finally {
            in.close();
        }
    }
}
