package gr.aueb.cf.Review;

import java.util.Scanner;

public class WinApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        boolean found = false;

        while(!found){
            System.out.println("please insert the lucky numbers");
            num = in.nextInt();
            if(num != 5 && num != 12 && num != 70) {
                System.out.println("no lucky number found");
                break;
            }
            if (num == 5){
                found = true;
            }
            if (num == 12){
                found = true;
            }
            System.out.println("no lucky numbers found");
        }
        if(found) System.out.println("found" + found);
            else System.out.println("no lucky number found");
        }
    }
