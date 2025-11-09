package codewars5kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class FactDecomp_5kyu {

    public static String decomp(int n) {
        if (n < 2) {
            return "";
        }
        List<Integer> primes = sievePrimesUpTo(n);

        Map<Integer, Integer> primeExpo = new LinkedHashMap<>();
        for (int p : primes) {
            int exp = 0;
            int x = p;
            while (x <= n) {
                exp += n / x;
                if ((long) x * p > n) break;
                x *= p;
            }
            if (exp > 0) {
                primeExpo.put(p, exp);
            }
        }

        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (Map.Entry<Integer, Integer> e : primeExpo.entrySet()) {
            int p = e.getKey();
            int exp = e.getValue();
            if (!first) {
                sb.append(" * ");
            } else {
                first = false;
            }
            if (exp == 1) {
                sb.append(p);
            } else {
                sb.append(p).append("^").append(exp);
            }
        }
        return sb.toString();
    }

    private static List<Integer> sievePrimesUpTo(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = true;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        System.out.println(decomp(12));
        System.out.println(decomp(22));
    }
}
