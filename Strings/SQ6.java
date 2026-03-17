/*
A numerical token is deemed “clean” if it does NOT contain the digit ‘9’ in any position.
Your mission is to scan the dispatch and identify the largest clean numeric token. If no such numeric
token exists, return -1.

Rules:
•Tokens are separated only by spaces.
•Valid numbers contain only digits.
•No numeric token has leading zeroes.

*/

import java.util.Arrays;

public class SQ6 {
    public static void main(String[] args) {
        String str = "This is alpha 5057 and 97";
        String[] arr = str.split("[^0-9]+");
        System.out.println(Arrays.toString(arr));

        long max = -1;
        for (String s : arr) {
            if (s.isEmpty() || s.contains("9"))
                continue;
            max = Math.max(Long.parseLong(s), max);
        }
        System.out.println(max);
    }
}
