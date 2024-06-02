package gr.aueb.cf.Review;

import java.util.Scanner;

public class NumberFormatExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        String inPutStr = " ";

        try {
            System.out.println("please insert an int");
            inPutStr = in.nextLine();
            num = Integer.parseInt(inPutStr);
            System.out.println("input number" + num);
        } catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
}
