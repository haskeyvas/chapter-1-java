package gr.aueb.cf.Review;

import java.util.Locale;
import java.util.Scanner;

public class TypecastsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lexeme;
        int num;
        System.out.println("please insert an int : ");

        lexeme = in.next();

        num = Integer.parseInt(lexeme);

        System.out.println("num is: " + num);

        int num1 = 5;
        float f = 3.14F;
        String s1;
        String s2;

        s1 = String.valueOf(num1);
        System.out.println(s1);
        s2 = String.valueOf(f);
        System.out.println(s2);

        String s6 = "   ATHENS aueb      BiLl   ";
        String s7;
        String s8;

        s7 = s6.toLowerCase();
        System.out.println(s7);

        s8 = s6.trim();
        System.out.println(s8);

    }
}
