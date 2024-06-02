package gr.aueb.cf.Review;

public class UnicodeApp {
    public static void main(String[] args) {

        int codePoint = 0x1F600; //smiley

        System.out.println("smiley : \uD83D\uDE00");    //1st

        System.out.print("smiley is :");
        System.out.println(Character.toChars(codePoint));   //2nd


    }
}
