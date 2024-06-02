package gr.aueb.cf.Review;

public class SearchArrayWithMethod {

    public static void main(String[] args) {
        int  [] quantities = {100, 200, 300};
        int position = 0;
        int value = 100;

        position = getElementPosition(quantities , value);
        System.out.printf(" the value %d is in position %d", value , position);
    }

    public static int getElementPosition (int [] arr, int value){
        if (arr == null ) return -1;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }
}
