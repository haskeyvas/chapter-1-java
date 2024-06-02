package gr.aueb.cf.Review;

import java.util.Scanner;

public class DoMenuApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        System.out.println("Please insert your choice");
        choice = sc.nextInt();

        do {
            System.out.println("Επιλέξτε ενα απο τα παρακάτω");
            System.out.println("1. Εισαγωγή προιόντος");
            System.out.println("2. Διαγραφή προιόντος");
            System.out.println("3. Έξοδος");
            choice = sc.nextInt();
        } while (choice != 3);

    }
}
