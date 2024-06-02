package gr.aueb.cf.Review;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileApp {

    public static void main(String[] args) {
        File fd = new File("/Users/vasiliskr/Downloads/Downloads/libinfo.txt");

        try (Scanner in = new Scanner(fd)){
            while (in.hasNextLine()){
                String line = in.nextLine();
                String[] token = line.split("");

            for (String tokens : token){
                System.out.printf("%s" , tokens);
            }
                System.out.println(" ");
            }
        }catch (IOException e){
            e.printStackTrace();

        }

    }
}
