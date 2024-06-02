package gr.aueb.cf.Review;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice = 0;

        choice = in.nextInt();

        do {
            printMenu();
            choice = in.nextInt();

            switch (choice) {
                case 1 :
                    System.out.println("επιτυχής εισαγωγή");
                    break;
                case 2:
                    System.out.println("επιτυχής διαγραφή");
                    break;
                case 3:
                    System.out.println("επιτυχής ενημέρωση");
                    break;
                case 4:
                    System.out.println("επιτυχής αναζήτηση");
                    break;
                case 5:
                    System.out.println("επιτυχής έξοδος");
                    break;
                default:
                    System.out.println("λάθος επιλογή");
                    break;
            }
        }while ( choice !=5 );
    }

    public static void printMenu (){

        System.out.println("Επιλέξτε ενα απο τα παραπάνω");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Αναζήτηση");
        System.out.println("4. Ενημέρωση");
        System.out.println("5. Έξοδος");
    }
}
