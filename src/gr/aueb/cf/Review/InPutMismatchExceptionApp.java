package gr.aueb.cf.Review;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InPutMismatchExceptionApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inPutNum = 0;
        final int MAGIC = 12;

        while(true){
            System.out.println("please insert an int");

            if (in.hasNextInt()){
                inPutNum = in.nextInt();
            } else{
                System.out.println("please insert a valid value");
                    in.nextLine();
                    continue;
            }
            if(inPutNum == MAGIC) break;
            System.out.println(inPutNum );

        }
    }
}
