import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class SortTheOdd_6kyu {

    public static int[] sortArray(int[] array) {
        int[] result = new int[array.length];

        TreeSet<Integer> odds = new TreeSet<>();
        Map<Integer, Integer> evens = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (number % 2 == 0) {
                evens.put(i, number);
            } else {
                odds.add(number);
            }
        }

        return makeFinalArray(odds, evens, result);
    }

    private static int[] makeFinalArray(TreeSet<Integer> odds, Map<Integer, Integer> evens, int[] result) {
        int[] finalArray = new int[result.length];

        for (int i = 0; i < finalArray.length; i++) {
            Integer integer = evens.get(i);
            if (integer != null) {
                finalArray[i] = integer;
            } else {
                Integer first = odds.first();
                finalArray[i] = first;
                odds.remove(first);
            }
        }

        return finalArray;
    }

    public static void main(String[] args) {
        int[] ints2 = {7, 1};
        int[] ints3 = sortArray(ints2);
        for (int i = 0; i < ints3.length; i++) {
            System.out.println(ints3[i]);
        }
        System.out.println();

        int[] ints4 = {5, 8, 6, 3, 4};
        int[] ints5 = sortArray(ints4);
        for (int i = 0; i < ints5.length; i++) {
            System.out.println(ints5[i]);
        }
        System.out.println();

        System.out.println();
        int[] ints = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] ints1 = sortArray(ints);
        for (int i = 0; i < ints1.length; i++) {
            System.out.println(ints1[i]);
        }
        System.out.println();

        int[] ints6 = {1, 3, 2, 8, 5, 4};
        int[] ints7 = sortArray(ints6);
        for (int i = 0; i < ints7.length; i++) {
            System.out.println(ints7[i]);
        }
        System.out.println();
    }
}
