package gr.aueb.cf.Review;

public class ForbreakApp {

    public static void main(String[] args) {
        int count = 0;

//        for(int i = 0; i <= 10; i++){
//            System.out.println(i + " ");
//            if(i == 5){
//                break;
//            }
//        }

        for(;;){
            System.out.println("forever");
            count++;
            if (count % 20 == 0)
                System.out.println();
            if (count == 100)
                break;
        }
    }
}
