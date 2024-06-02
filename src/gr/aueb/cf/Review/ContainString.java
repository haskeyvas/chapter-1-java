package gr.aueb.cf.Review;

public class ContainString {

    public static void main(String[] args) {

        String s = "Athens University of Economics and Business";
        int index = -1;

        if (s.contains("Economics"))
            System.out.println("Bingo");

        index = s.indexOf("Uni");
        System.out.println("start Index of Uni " + index);

        index = s.indexOf("Eco");
        System.out.println("start index of Eco " + index);

        index = s.indexOf("ness");
        System.out.println("start index of ness " + index);

        index = s.indexOf('s' , 7);
        System.out.println("start index of 's' " + index);

        if(s.startsWith("Athens")) System.out.println("Bingo Athens");
        if(s.endsWith("Business")) System.out.println("Bingo");
    }
}
