package gr.aueb.cf.Review;

public class Substring {

    public static void main(String[] args) {

        String s = "This is 5AUEB";

        for (int i = 0; i < s.length(); i++){
            System.out.print(s.substring(i, i+1));
        }
    }
}
