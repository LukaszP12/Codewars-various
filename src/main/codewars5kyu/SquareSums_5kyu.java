package codewars5kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SquareSums_5kyu {
    public static int[] squareSumsRow(int n) {
        List<Integer> result = new ArrayList<>();
        boolean[] used = new boolean[n + 1];

        for (int i = 1; i < n; i++) {
            result.clear();
            Arrays.fill(used, false);
            result.add(i);
            used[i] = true;

            if (buildChain(i, n, used, result)) {
                return result.stream().mapToInt(Integer::intValue).toArray();
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private static boolean buildChain(int current, int n, boolean used[], List<Integer> result) {
        if (result.size() == n) {
            return true;
        }

        for (int next = 1; next <= n; next++) {
            if (!used[next] && isPerfectSquare(current + next)) {
                used[next] = true;
                result.add(next);

                if (buildChain(next, n, used, result)) {
                    return true;
                }

                used[next] = false;
                result.add(result.size() - 1);
            }
        }
        return false;
    }

    private static boolean isPerfectSquare(int x) {
        int r = (int) Math.sqrt(x);
        return r * r == x;
    }

    public static void main(String[] args) {
        int[] ints = squareSumsRow(15);
        Arrays.stream(ints).forEach(System.out::println);
    }
}
