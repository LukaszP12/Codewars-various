package codewars5kyu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class PowerSumDig_5kyu {

    public static long powerSumDigTerm(int n) {
        List<Long> results = new ArrayList<>();
        long num = 1;

        while (results.size() < n) {
            char[] digits = String.valueOf(num).toCharArray();
            int sum = IntStream.range(0, digits.length)
                    .map(i -> digits[i] - '0')
                    .sum();

            if (sum > 1) {  // ✅ ignore 0 and 1
                long power = sum * sum;
                while (power <= num) {
                    if (power == num) {
                        results.add(num);
                        break;
                    }
                    power *= sum;
                }
            }
            num++;
        }

        return results.get(results.size() - 1);
    }

    public static void main(String[] args) {
        System.out.println(powerSumDigTerm(1));
        System.out.println(powerSumDigTerm(2));
        System.out.println(powerSumDigTerm(3));
    }
}
