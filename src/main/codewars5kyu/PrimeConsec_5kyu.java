package codewars5kyu;

class PrimeConsec_5kyu {

    public static int consecKprimes(int k, long[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
        int count = 0;
        int n = arr.length;

        int[] pfCounts = new int[n];
        for (int i = 0; i < n; i++) {
            pfCounts[i] = countPrimeFactors((int) arr[i]);
        }

        for (int i = 0; i < n - 1; i++) {
            if (pfCounts[i] == k && pfCounts[i + 1] == k) {
                count++;
            }
        }
        return count;
    }

    private static int countPrimeFactors(int num) {
        if (num <= 1) return 0;
        int count = 0;
        int n = num;
        for (int d = 2; d * d <= n; d++) {
            while (n % d == 0) {
                count++;
                n /= d;
            }
        }
        if (n > 1) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        long[] ints = {4, 6, 9, 10, 14, 15, 21, 22};
        int k = 2;
        System.out.println(consecKprimes(k, ints));

        long[] ints1 = {8, 12, 18, 20, 27, 28, 30};
        int k1 = 3;
        System.out.println(consecKprimes(k1, ints1));

        long[] ints2 = {32, 48, 72, 80, 108, 112};
        int k2 = 5;
        System.out.println(consecKprimes(k2, ints2));
    }
}
