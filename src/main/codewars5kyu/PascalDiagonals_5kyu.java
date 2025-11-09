package codewars5kyu;

import java.util.Arrays;

class PascalDiagonals_5kyu {

    public static long[] generateDiagonal(int n, int l) {
        long[] result = new long[l];
        for (int k = 0; k < l; k++) {
            result[k] = binomialCoefficient(n + k, n);
        }
        return result;
    }

    private static long binomialCoefficient(int n, int k) {
        if (k > n) return 0;
        if (k == 0 || k == n) return 1;
        long result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * (n - (k - i)) / i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateDiagonal(2, 4)));
        System.out.println(Arrays.toString(generateDiagonal(3, 5)));
    }
}
