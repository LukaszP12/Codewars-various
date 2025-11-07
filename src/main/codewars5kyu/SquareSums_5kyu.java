package codewars5kyu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class SquareSums_5kyu {
    public static List<Integer> squareSumsRow(int n) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> currentNums = new HashSet<>();

        for (int i = 1; i < n; i++) {
            int pairNum = findPair(i, n, currentNums);
            currentNums.add(pairNum);
            result.add(pairNum);

            currentNums.add(i);
            result.add(i);
        }

        return result;
    }

    private static int findPair(int i, int n, Set<Integer> currentNums) {
        Set<Integer> squares = new TreeSet<>();

        for (int j = 1; j * j <= n * 2; j++) {
            squares.add(j * j);
        }

        for (int square : squares) {
            int remainder = square - i;
            if (remainder > 0 && !currentNums.contains(remainder)) {
                return remainder;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(squareSumsRow(15));
    }
}
