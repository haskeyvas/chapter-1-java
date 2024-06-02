package gr.aueb.cf.Review;

public class ReplaceDeleteApp {

    public static void main(String[] args) {

//        String fname = "Elina - Eleni";
//        String simpleName;
//        String nickname;
//        String fullName;
//
//        simpleName = fname.replace(" - ", " or ");
//        System.out.println(simpleName);
//
//        nickname = fname.replace("Elina - Eleni", "Kitten");
//        System.out.println("my nickname is : " + nickname);
//
//        fullName = fname.concat(" / " + nickname);
//        System.out.print("my full name is : " + fullName);
//
//
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = "Rome";
        String s4 = "ATHENS";


        boolean isEqual;
        boolean isEquals = false;

        isEqual = s1.equals(s2);
        System.out.println(isEqual);

        isEqual = s1.equals(s3);
        System.out.println(isEqual);

        isEqual = s1.equalsIgnoreCase(s4);
        System.out.println(isEqual);

        System.out.println(" ");

        if ( s1 == s2) {
            System.out.println(isEquals);
        }

        if ( s1.compareTo(s4) > 0) System.out.println(" 'a' from athens is greater than 'A'  from Athens");

        if ( s1.compareTo(s2) == 0) System.out.println(" equals Strings");


        String cf = "Coding Factory";
        String clone;

        clone = cf;

        System.out.println(" clone is " + clone);





    }
}
