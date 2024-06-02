package gr.aueb.cf.Review;

/**
 * wrapper class which show type,size,min.max
 */
public class IntApp {

    public static void main(String[] args) {
//        System.out.printf("Type: %s , Size: %d , Min: %d, Max%d\n",
//                Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
//
//        System.out.printf("Type: %s , Size: %d , Min: %d, Max%d\n",
//                Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
//
//        System.out.printf("Type: %s , Size: %d , Min: %d, Max%d\n",
//                Short.TYPE, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
//
//        System.out.printf("Type: %s , Size: %d , Min: %d, Max%d\n",
//                Long.TYPE, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);


    int num = 517;
    int num1 = 517 / 100;
    int num2 = num % 100;
    int remaining = num2;
    int remaining1 = remaining / 10;
    remaining = remaining % 10;



        System.out.println(num1);
        System.out.println(num2);
        System.out.println(remaining);
        System.out.println(remaining1);


    }



}
