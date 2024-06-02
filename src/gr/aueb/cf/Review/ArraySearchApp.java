package gr.aueb.cf.Review;

public class ArraySearchApp {

    public static void main(String[] args) {

        int[] arr = {1, 5, 6, 9, 10, 12};
        final int KEY = 10;
        boolean keyIsFound = false;

        for (int item : arr){
            if ( item == KEY) {
                keyIsFound = true;
                break;
            }
        }
        if (keyIsFound) {
            System.out.println("key is found");
        } else {
            System.out.println("key is not found");
        }
    }
}