package gr.aueb.cf.Review;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterApp {

    public static void main(String[] args) {

        try(PrintWriter pw = new PrintWriter(("/Users/vasiliskr/Downloads/Downloads/libinfoOut2.txt"))){
            pw.printf("Hello World");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
