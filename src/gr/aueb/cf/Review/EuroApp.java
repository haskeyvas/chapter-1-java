package gr.aueb.cf.Review;

import java.util.Scanner;

public class EuroApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inPutEuro;
        int euro500;
        int euro100;
        int euro50;
        int euro20;
        int euro10;
        int euro1;
        int remainingEuro;

        System.out.println("please insert the value in euros");
        inPutEuro = sc.nextInt();

        remainingEuro = inPutEuro;

        euro500 = remainingEuro / 500;
        remainingEuro = remainingEuro % 500;

        euro100 = remainingEuro / 100;
        remainingEuro = remainingEuro % 100;

        euro50 = remainingEuro / 50;
        remainingEuro = remainingEuro % 50;

        euro20 = remainingEuro / 20;
        remainingEuro = remainingEuro % 20;

        euro10 = remainingEuro / 10;
        remainingEuro = remainingEuro % 10;

        euro1 = remainingEuro / 1;
        remainingEuro = remainingEuro % 1;


        System.out.printf("the euros are: %d :500 euro, %d : 100 euro, %d : 50 euro, %d : 20 euro" +
                "%d: 10 euro , %d: 1 euro", euro500, euro100, euro50, euro20, euro10, euro1);


    }
}
