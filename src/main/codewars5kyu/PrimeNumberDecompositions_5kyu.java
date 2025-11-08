package codewars5kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class PrimeNumberDecompositions_5kyu {

    public static Long[] getAllPrimeFactors(long n) {
        Set<Integer> primes = getPrimes(n);

        return findDivisors(n, primes, new ArrayList<>());
    }

    private static Long[] findDivisors(long n, Set<Integer> primes, List<Integer> divisors) {
        int product = divisors.stream().reduce(1, (x, y) -> x * y);
        if (product == n) {
            return divisors.stream().map(Integer::longValue).toArray(Long[]::new);
        }
        if (product > n) {
            return null;
        }

        for (Integer prime : primes) {
            if (n % prime == 0) {
                divisors.add(prime);
                Long[] result = findDivisors(n, primes, divisors);
                if (result != null) {
                    return result;
                }
                divisors.remove(divisors.size() - 1);
            }
        }

        return null;
    }

    private static Set<Integer> getPrimes(long n) {
        TreeSet<Integer> primes = new TreeSet<>();
        for (long i = 2; i < n; i++) {
            if (i == 2 || i == 3 || i == 5) {
                primes.add((int) i);
            }
            if (i % 2 != 0 &&
                    i % 3 != 0 &&
                    i % 5 != 0 &&
                    !notDivisible(i, primes)) {
                primes.add((int) i);
            }
        }
        return primes;
    }

    private static boolean notDivisible(long i, Set<Integer> primes) {
        for (int p : primes) {
            if (i % p == 0) {
                return false;
            }
        }
        return true;
    }

    public static Long[][] getUniquePrimeFactorsWithCount(long n) {
        return new Long[][]{{}, {}};
    }

    public static Long[] getPrimeFactorPotencies(long n) {
        return new Long[]{};
    }

    public static void main(String[] args) {
        Long[] allPrimeFactors = getAllPrimeFactors(100);
        Arrays.stream(allPrimeFactors).forEach(System.out::println);

        Long[] allPrimeFactors2 = getAllPrimeFactors(150);
        Arrays.stream(allPrimeFactors2).forEach(System.out::println);
    }
}
