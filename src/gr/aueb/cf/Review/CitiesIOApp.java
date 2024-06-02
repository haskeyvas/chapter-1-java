package gr.aueb.cf.Review;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class CitiesIOApp {

    public static void main(String[] args) {

        String line = "";
        String [] cities;
        File dir = new File("/Users/vasiliskr/Downloads/Downloads");

        if (!dir.exists()){
            if(!dir.mkdir()){
                System.out.println("error in mkdir");
                System.exit(1);
            }
        }

        try(BufferedReader bf = new BufferedReader(new FileReader("/Users/vasiliskr/"))){
            File grFile, deFile,usaFile;

            while((line = bf.readLine()) != null){
                cities = line.split(" +");
                switch (cities[0]){
                    case "Greece":
                        grFile = new File(dir + "/" + "gr.txt");
                        PrintStream gr = new PrintStream(grFile, StandardCharsets.UTF_8);
                        print(gr, "GR cities");
                        print(gr, cities);
                        break;
                    case "USA":
                        usaFile = new File(dir + "/" + "usa.txt");
                        PrintStream usa = new PrintStream(usaFile, StandardCharsets.UTF_8);
                        print(usa,"USA cities");
                        print(usa, cities);
                        break;
                    case "Germany":
                        deFile = new File(dir + "/" + "de.txt");
                        PrintStream de = new PrintStream(deFile, StandardCharsets.UTF_8);
                        print(de, "DE cities");
                        print(de, cities);
                        break;
                    default:
                }
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void print(PrintStream ps, String[] tokens){
        for (int i = 0; i < tokens.length; i++){
            ps.print(tokens[i] + " ");
        }
    }
    public static void print (PrintStream ps, String message){
        ps.printf(message);
    }

}
