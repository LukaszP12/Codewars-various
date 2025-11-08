package codewars5kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class PrimeNumberDecompositions_5kyu {

    public static Long[] getAllPrimeFactors(long n) {
        if (n <= 1) return new Long[0];
        Set<Integer> primes = getPrimes(n);
        Long[] result = findDivisors(n, primes, new ArrayList<>());
        return result == null ? new Long[]{n} : result;
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
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && !notDivisible(i, primes)) {
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
        if (n <= 1) {
            return new Long[][]{ new Long[0], new Long[0] };
        }
        Long[] allPrimeFactors = getAllPrimeFactors(n);
        Arrays.sort(allPrimeFactors);

        List<Long> numbers = new ArrayList<>();
        List<Long> factors = new ArrayList<>();

        long prev = allPrimeFactors[0];
        long power = 1;

        for (int i = 1; i < allPrimeFactors.length; i++) {
            Long current = allPrimeFactors[i];
            if (prev == current) {
                power++;
            } else {
                factors.add(power);
                numbers.add(prev);
                power = 1;
            }
            prev = current;
        }

        factors.add(power);
        numbers.add(prev);

        Long[] primesArray = numbers.toArray(new Long[0]);
        Long[] countsArray = factors.toArray(new Long[0]);

        return new Long[][]{primesArray, countsArray};
    }

    public static Long[] getPrimeFactorPotencies(long n) {
        Long[][] uniquePrimeFactorsWithCount = getUniquePrimeFactorsWithCount(n);

        Long[] primes = uniquePrimeFactorsWithCount[0];
        Long[] counts = uniquePrimeFactorsWithCount[1];

        Long[] results = new Long[primes.length];

        for (int i = 0; i < primes.length; i++) {
            results[i] = (long) Math.pow(primes[i], counts[i]);  // prime^power
        }

        return results;
    }

    public static void main(String[] args) {
//        Long[] allPrimeFactors = getAllPrimeFactors(100);
//        Arrays.stream(allPrimeFactors).forEach(System.out::println);
//
//        Long[] allPrimeFactors2 = getAllPrimeFactors(150);
//        Arrays.stream(allPrimeFactors2).forEach(System.out::println);

//        Long[][] uniquePrimeFactorsWithCount = getUniquePrimeFactorsWithCount(100);
//        for (int i = 0; i < uniquePrimeFactorsWithCount.length; i++) {
//            for (int j = 0; j < uniquePrimeFactorsWithCount[0].length; j++) {
//                System.out.println(uniquePrimeFactorsWithCount[i][j]);
//            }
//        }
//        System.out.println();
//
//        Long[][] uniquePrimeFactorsWithCount2 = getUniquePrimeFactorsWithCount(150);
//        for (int i = 0; i < uniquePrimeFactorsWithCount2.length; i++) {
//            for (int j = 0; j < uniquePrimeFactorsWithCount2[0].length; j++) {
//                System.out.println(uniquePrimeFactorsWithCount2[i][j]);
//            }
//        }

        Long[] primeFactorPotencies = getPrimeFactorPotencies(100);
        Arrays.stream(primeFactorPotencies).forEach(System.out::println);

        long[][] longs = {
                {1L, 2L, 3L},
                {4L, 5L, 6L},
        };

        long l = longs[0][0] * longs[1][0];
        long l1 = longs[0][1] * longs[1][1];
        long l2 = longs[0][2] * longs[1][2];


    }
}
