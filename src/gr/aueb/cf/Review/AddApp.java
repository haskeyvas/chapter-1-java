package gr.aueb.cf.Review;

public class AddApp {

    public static void main(String[] args) {

        int c = 10;
        int d = 10;
        int e = -30;
        int z = 50;
        int y = 20;

        int sum = 0;
        int result = 0;
        double power = 0;

        sum = add(c,d);
        result = sub(c,d,e);
        power =  powerNum(z,y);

        System.out.println("the result of c + d = " + sum);
        System.out.println("the result of c + d - e = " + result );
        System.out.println("the result of z ^ y = " + power);

    }
    public static int add (int a , int b){

        return a + b;
    }

    public static  int sub (int a , int b , int c) {

        int sub = 0;

        sub = a + b - c;

        return sub;
    }

    public static double powerNum (double a , double b){

        double power = 0;

        power = Math.pow(a,b);

        return power;
    }
}
