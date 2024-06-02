package gr.aueb.cf.Review;

public class StringVsCharArrayApp {

    public static void main(String[] args) {

        int [] ages = {20 , 25 , 32 , 12 , 34 , 23};

        System.out.println();
        printArray(ages , 0 , ages.length);

    }

    public static void printArray (int [] arr, int low , int high) {
        if ((low < 0) || (high > arr.length)) return;

        for ( int i = low; i < high; i++) {
            System.out.println(arr[i] + " ");
        }
    }


}
