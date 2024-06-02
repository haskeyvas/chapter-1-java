package gr.aueb.cf.Review;

import java.util.Scanner;

public class StringDeclaration {

    public static void main(String[] args) {

        //δήλωση και αρχικοποίηση
        String s = "Bill + Elina = ";


        //μετατρέπουμε το String s σε Array και με for , κάνουμε traverse
        for (char ch : s.toCharArray()){
            System.out.print(ch + "");
        }
        System.out.println("\u2764");


        for (int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println("");
        for (int i = s.length()-1; i >= 0; i--){
            System.out.print(s.charAt(i) + "");
        }







    }


}
