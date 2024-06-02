package gr.aueb.cf.Review;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class IOIntDemo {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("Users/vasiliskr/.txt"));
        PrintStream ps = new PrintStream("Users/vasiliskr/out.txt.");
        String token;
        int num = 0;
        int sum = 0;
        int count = 0;
        double average = 0;

        while (sc.hasNext()) {
            token = sc.next();
            if (isInt(token)) {
                num = Integer.parseInt(token);
                count++;
                sum += num;
            }
        }
        average = (double) sum / count;
        ps.printf("the sum is %d%n: ", sum);
        ps.printf(Locale.ENGLISH, "Ο μέσος όρος είναι %d.2f", average);

        sc.close();
        ps.close();
    }
    private static boolean isInt(String token) {
        try{
            Integer.parseInt(token);
            System.out.println("file found");
                return true;
        } catch (NumberFormatException ex){
            ex.printStackTrace();
            System.out.println("file not found");
            return false;

        }
    }
}