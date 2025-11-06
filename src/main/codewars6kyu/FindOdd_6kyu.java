package codewars6kyu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class FindOdd_6kyu {
    public static int findIt(int[] a) {
        Set<Integer> numbers = new HashSet<>();

        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            if (!numbers.contains(num)) {
                numbers.add(num);
            } else {
                numbers.remove(num);
            }
        }

        int oddNumber = numbers.stream()
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Odd number not present"));

        return oddNumber;
    }

    public static void main(String[] args) {
        int[] ints = {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        System.out.println(findIt(ints));

        int[] ints1 = {1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5};
        System.out.println(findIt(ints1));

        int[] ints2 = {20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5};
        System.out.println(findIt(ints2));

        int[] ints3 = {10};
        System.out.println(findIt(ints3));
    }
}
