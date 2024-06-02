package gr.aueb.cf.Review;

public class ReplaceWithMethod {

    public static void main(String[] args) {
        int [] grades = {4, 2 ,8 , 9 , 5};

        upScaleByOne(grades);
        printArray(grades);
    }

    public static void upScaleByOne (int [] arr){
        for (int i = 0; i < arr.length; i++)
            arr[i] += i;
    }

    public static void printArray(int [] arr) {
        for (int item : arr)
            System.out.println(item + " ");
    }


}
