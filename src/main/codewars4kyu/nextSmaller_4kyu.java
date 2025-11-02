package codewars4kyu;

import java.util.HashMap;
import java.util.Map;

class nextSmaller_4kyu {
    public static long nextSmaller(long n) {
        Map<Character, Integer> digitsNums = toDigits(n);

        for (long i = n - 1; i >= 0; i--) {
            if (toDigits(i).equals(digitsNums)) {
                return i;
            }
        }
        return -1;
    }

    private static Map toDigits(long n) {
        Map<Character, Integer> digitCount = new HashMap<>();
        for (char c : String.valueOf(n).toCharArray()) {
            digitCount.merge(c, 1, Integer::sum);
        }
        return digitCount;
    }
}
// toDo it still does not pass very large numbers for example n = 1023456789