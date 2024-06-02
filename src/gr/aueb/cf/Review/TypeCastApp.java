package gr.aueb.cf.Review;

public class TypeCastApp {

    public static void main(String[] args) {

        int num1 = 5;
        long num2 = 10L;
        byte num3 = 20;
        int num4 = 2;
        long num5 = 2000;

        num1 = (int) num2; // i have to do manually typecast, because right part is bigger than left

        num2 = num3; // typecast happens auto

        num3 = (byte) num2;

        System.out.print(num1);
        System.out.println("\n" +num1);
        System.out.printf("%d \n", num1);
        System.out.printf("%8d \n", num5); //prints the number 8 tabs right, startins counting from the the last zero
        System.out.printf("%08d \n", num5);//replace the null tabs with zeros
        System.out.printf("%,d \n", num5);//prints the .
        System.out.printf("%,06d \n", num5);
    }
}
