package codewars5kyu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PowerSumDig_5kyu {

    public static long powerSumDigTerm(int n) {
        List<Long> results = new ArrayList<>();

        for (long base = 2; base <= 200; base++) {
            long value = base * base; // start at base^2

            while (value < Long.MAX_VALUE / base) { // avoid overflow
                if (sumDigits(value) == base) {
                    results.add(value);
                }
                value *= base; // next power
            }
        }

        Collections.sort(results);
        return results.get(n - 1);
    }

    private static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(powerSumDigTerm(1));
        System.out.println(powerSumDigTerm(2));
        System.out.println(powerSumDigTerm(3));
    }
}
