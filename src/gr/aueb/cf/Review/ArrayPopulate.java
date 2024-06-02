package gr.aueb.cf.Review;

public class ArrayPopulate {

    public static void main(String[] args) {

        int [] ages = new int[5];
        ages[0] = 70;
        ages[1] = 64;
        ages[2] = 41;
        ages[3] = 37;
        ages[4] = 34;

        int [] marks = {20, 18, 15, 19 ,13};

        int[] score;
        score = new int [] {4, 5 , 9 , 12 , 45};


        for ( int i = 0; i < ages.length; i++ ) {
            System.out.println(ages[i] + " ");
        }

        System.out.println(" ");

        for (int j = 0; j < marks.length; j++){
            System.out.println(marks[j] + " ");
        }

        System.out.println(" ");

        for (int z = 0; z < score.length; z++){
            System.out.println(score[z] + " ");
        }

        System.out.println(" ");

        for (int newAge : ages) {
            System.out.println(newAge + " " );
        }
    }
}
