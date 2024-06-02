package gr.aueb.cf.Review;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class JavaAscii {

    public static void main(String[] args) {

        String input = "abcdefg";
        byte[] bytes = input.getBytes(StandardCharsets.US_ASCII);

        // print the first byte
        System.out.println(bytes[0]);               // 97

        List<Integer> result = new ArrayList<>();   // convert bytes to ascii
        for (byte aByte : bytes) {
            int ascii = (int) aByte;                // byte -> int
            result.add(ascii);
        }

        System.out.println(result.toString());      // [97, 98, 99, 100, 101, 102, 103]

    }

}
