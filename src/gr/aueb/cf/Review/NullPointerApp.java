package gr.aueb.cf.Review;

public class NullPointerApp {

    public static void main(String[] args) {

        String s = " ";
        int secret = 12;

        s = getBravoOrNull(secret);


        if (s == null){
            System.out.println("not lucky");
            return;
        }

        if (s.equals("Bravo")){
            System.out.println("lucky");
            return;
        }

    }

    private static String getBravoOrNull(int secret) {

        final int SECRET = 12;

        if (secret != 12) return null;
        return "Bravo";
    }
}
