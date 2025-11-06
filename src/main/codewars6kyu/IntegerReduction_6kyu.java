package codewars6kyu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class IntegerReduction_6kyu {

    public static String smallestAfterRemovals(String n, int k) {
        if (n == null || n.isEmpty()) return "0";
        if (k >= n.length()) return "0";

        String minNumberString = null;

        List<List<Integer>> lists = generateCombinations(n.length(), k);

        for (List<Integer> indexList : lists) {
            String number = removeIndexes(n, indexList);

            // normalize
            number = number.replaceFirst("^0+(?!$)", "");
            if (number.isEmpty()) number = "0";

            // safe lexical comparison
            if (minNumberString == null ||
                    number.length() < minNumberString.length() ||
                    (number.length() == minNumberString.length() && number.compareTo(minNumberString) < 0)) {
                minNumberString = number;
            }
        }

        return minNumberString;
    }

    private static String removeIndexes(String n, List<Integer> indexList) {
        if (indexList == null || indexList.isEmpty()) return n;

        List<Integer> sorted = new ArrayList<>(indexList);
        Collections.sort(sorted);

        String output = "";
        int prevIndex = 0;

        for (int i : sorted) {
            output += n.substring(prevIndex, i);
            prevIndex = i + 1;
        }

        if (prevIndex < n.length()) {
            output += n.substring(prevIndex);
        }
        return output;
    }

    private static List<List<Integer>> generateCombinations(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        generateRecursive(0, n, k, new ArrayList<>(), result);
        return result;
    }

    private static void generateRecursive(int start,
                                          int n,
                                          int k,
                                          List<Integer> current,
                                          List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < n; i++) {
            current.add(i);
            generateRecursive(i + 1, n, k, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(smallestAfterRemovals("123056", 1));
        System.out.println(smallestAfterRemovals("123056", 2));
        System.out.println(smallestAfterRemovals("123056", 3));
        System.out.println(smallestAfterRemovals("123056", 4));
        System.out.println(smallestAfterRemovals("1284569", 1));
    }
}
