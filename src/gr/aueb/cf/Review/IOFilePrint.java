package gr.aueb.cf.Review;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class IOFilePrint {

    public static void main(String[] args) {

        try (PrintStream ps = new PrintStream("/vasiliskr/.txt");
            PrintWriter pw = new PrintWriter("/Users/vasiliskr/.txt"))
        {
            ps.println("hello cyber security, from printstream");
            pw.println("hello cyber security, from printwriter");
        } catch(FileNotFoundException ex){
            ex.printStackTrace();
            System.out.println("file not found");

        }
    }
}
