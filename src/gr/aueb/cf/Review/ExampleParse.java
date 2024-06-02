package gr.aueb.cf.Review;

public class ExampleParse {

    public static void main(String[] args) {

        String str = "-23";

        try {
            int tempNum = Integer.parseInt(str);
            System.out.println(tempNum);
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(Integer.parseInt(str));

    }
}
