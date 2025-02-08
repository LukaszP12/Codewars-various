package org.example;

import java.util.ArrayList;
import java.util.List;

public class TransformToPrime_6kyu {
    public static int minimumNumber(int[] numbers) {
        int sum = getSum(numbers);
        int originalSum = sum;

        while (true) {
            if (isPrimeNumber(sum)) {
                break;
            }
            sum++;
        }

        return sum - originalSum; // Do your magic!
    }

    public static int getSum(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }

        return result;
    }

    public static boolean isPrimeNumber(int i) {
        List<Integer> primes = getOtherPrimeComponent(i);

        if (i == 2 || i == 3 || i == 5) {
            return true;
        }

        if (i % 2 == 0) {
            return false;
        } else if (i % 3 == 0) {
            return false;
        } else if (i % 5 == 0) {
            return false;
        }

        for (int j = 0; j < primes.size(); j++) {
            int primeDivisor = primes.get(j);
            if (i % primeDivisor == 0) {
                return false;
            }
        }

        return true;
    }

    private static List<Integer> getOtherPrimeComponent(int i) {
        List<Integer> primes = new ArrayList<>();

        for (int j = 2; j <= Math.sqrt(i); j++)
            if (i % j == 0) {
                primes.add(j);
            }

        return primes;
    }

    public static void main(String[] args) {
        int[] ints = {3, 1, 2};
        int i = minimumNumber(ints);
        System.out.println("Minimum number is " + i);

        int[] ints1 = {2, 12, 8, 4, 6};
        int i1 = minimumNumber(ints1);
        System.out.println("Minimum number is " + i1);

        int[] ints2 = {1, 1, 1};
        int i2 = minimumNumber(ints2);
        System.out.println("Minimum number is " + i2);
    }
}
