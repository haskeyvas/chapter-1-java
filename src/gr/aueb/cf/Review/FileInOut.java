package gr.aueb.cf.Review;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInOut {

    public static void main(String[] args) {

        File fdIn = new File("/Users/vasiliskr/Downloads/Downloads/libinfo.txt");
        File fdOut = new File("/Users/vasiliskr/Downloads/Downloads/libinfoOut.txt");

        try (Scanner in = new Scanner(fdIn);
             PrintWriter pw = new PrintWriter(fdOut, StandardCharsets.UTF_8)){
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] tokens = line.split("");

                for (String token : tokens) {
                    pw.printf("%s", token);
                }
                pw.println();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
