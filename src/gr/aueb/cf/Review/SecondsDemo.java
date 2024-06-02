package gr.aueb.cf.Review;

import java.util.Scanner;

public class SecondsDemo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int inPutSeconds;
        final int MINUTES = 60;
        final int HOURS = 3600;
        final int DAYS = 24 * 3600;

        int day;
        int hour;
        int minute;
        int remainingSeconds;

        System.out.println("please insert the value in seconds");
        inPutSeconds = in.nextInt();

        remainingSeconds = inPutSeconds;

        day = remainingSeconds / DAYS;
        remainingSeconds = remainingSeconds % DAYS;

        hour = remainingSeconds / HOURS;
        remainingSeconds = remainingSeconds % HOURS;

        minute = remainingSeconds / MINUTES;
        remainingSeconds = remainingSeconds % MINUTES;

        System.out.printf("input seconds is %d, analyzing in  %d days, %d hours, %d minutes, %d seconds ", inPutSeconds, day, hour, minute, remainingSeconds);

    }
}
