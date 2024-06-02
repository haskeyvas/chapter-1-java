package gr.aueb.cf.Review;

import java.util.Scanner;

public class CalculatorVersion2App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int result = 0;
        int num1;
        int num2;
        int choice = getUserChoice();

        do {
            printMenu();
            choice = getUserChoice();

            if (choice > 6 || choice < 1) {
                System.out.println("Λάθος επιλογή");
                continue;
            }

            System.out.println("please insert the numbers");
            num1 = getOneNumber();
            num2 = getOneNumber();
            result = getResult(choice, num1 , num2);
            System.out.println("Result = " + result);

        } while (choice != 6);
        System.out.println("Καλή συνέχεια, ευχαριστούμε!!");
    }

    public static void printMenu() {

        System.out.println("Επιλέξτε ενα απο τα παρακάτω");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Υπόλοιπο διαίρεσης");
        System.out.println("'Εξοδος");
    }

    public static int getUserChoice() {
        return in.nextInt();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            System.out.println("invalid number : 0");
            return 0;
        }
        return a / b;
    }

    public static int mod(int a, int b) {
        if (b == 0) {
            System.out.println("invalid number : 0");
            return 0;
        }
        return a % b;
    }

    public static int getResult(int choice, int num1, int num2) {

        int result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;

            case 2:
                result = sub(num1, num2);
                break;

            case 3:
                result = mul(num1, num2);
                break;

            case 4:
                result = div(num1, num2);
                break;

            case 5:
                result = mod(num1, num2);
                break;

            case 6:
                System.out.println("Επιλέξτε έξοδο");

            default:
                System.out.println("Λάθος επιλογή");
        }
        return result;
    }

    public static int getOneNumber(){
        return in.nextInt();
    }

}