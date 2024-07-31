package gr.aueb.cf.Review;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Again {

    public static void main(String[] args) throws FileNotFoundException{


        PrintStream ps = new PrintStream(new FileOutputStream("/Users/vasiliskr/Downloads/libinfo123.txt", true));
        PrintWriter pw = new PrintWriter(new FileOutputStream("/Users/vasiliskr/Downloads/review.txt", false));

        ps.print("hello world");
        pw.println("java lessons");

        ps.close();
        pw.close();

    }
}