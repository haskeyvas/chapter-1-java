package gr.aueb.cf.Review;

import java.util.Scanner;

public class EuroUsdConverter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final int PARITY = 99;
        int inPutEuros ;
        int totalUsaCents;
        int usaCents;
        int usaDollars;

        System.out.println("Please insert the number in euros");
        inPutEuros = in.nextInt();

       totalUsaCents = inPutEuros * PARITY;
       usaDollars = totalUsaCents / 100;
       usaCents = totalUsaCents % 100;

        System.out.printf("%deuros = %d usa cents =  %d usa dollars & %d usa cents",
                inPutEuros , totalUsaCents, usaDollars, usaCents);

    }
}
