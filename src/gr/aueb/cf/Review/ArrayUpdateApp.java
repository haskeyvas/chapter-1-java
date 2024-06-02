package gr.aueb.cf.Review;

public class ArrayUpdateApp {

    public static void main(String[] args) {
        int [] arr = {1,5,8,9,10,15};
        final int KEY = 10;
        boolean keyIsFound = false;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == KEY){
                arr[i] = KEY * 2;
                break;
            }
        }

        for (int item : arr){
            System.out.println(item + " ");
        }
    }
}
