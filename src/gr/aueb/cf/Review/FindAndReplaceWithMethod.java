package gr.aueb.cf.Review;

public class FindAndReplaceWithMethod {

    public static void main(String[] args) {
        int [] arr = new int[] {1,2,3,4,5,6,7,8,9};

        replace (arr, 9 , 10);
        printArray(arr);
    }

    /**
     *        Με αυτή τη μέθοδο βρίσκουμε τη θέση (στον πίνακα), της τιμής που μασ ζητήθηκε
     * @param arr
     * @param value η τιμή που θέλουμε να βρούμε και εν συνεχεία να αντικαταστήσουμε
     * @return  επιστρέφει τη θέση της τιμής που αναζητούμε
     */
    public static int getElementPosition (int [] arr, int value) {
        if ( arr == null) return -1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static void replace (int[] arr, int oldValue , int newValue){

        int positionToUpDate = -1;

        if (arr == null) return;
        positionToUpDate = getElementPosition(arr, oldValue);
        if (positionToUpDate != -1)
            arr[positionToUpDate] = newValue;
    }

    public static void printArray (int arr[]){
        for (int item : arr){
            System.out.println(item + " ");
        }
    }


}
