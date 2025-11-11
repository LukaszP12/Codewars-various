package codewars5kyu;

import java.util.HashSet;
import java.util.Set;

class PalindromeIntegerComposition_5kyu {

    public static int values(int n) {
        Set<Integer> results = new HashSet<>();

        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            int sum = i * i;

            for (int j = i + 1; j <= sqrt; j++) {
                sum += j * j;

                if (sum > n) {
                    break;
                }

                if (isPalindrome(sum)) {
                    results.add(sum);
                }
            }
        }

        return results.size();
    }

    private static boolean isPalindrome(int sum) {
        char[] chars = String.valueOf(sum).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(values(1000));
    }
}
