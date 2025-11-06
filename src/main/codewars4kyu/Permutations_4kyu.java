package codewars4kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Permutations_4kyu {

    public static List<String> singlePermutations(String s) {
        List<String> result = new ArrayList<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        boolean[] used = new boolean[chars.length];

        getAllPermutations(chars, used, new StringBuilder(), result);
        // Your code here!
        return result;
    }

    private static void getAllPermutations(char[] chars,
                                           boolean[] used,
                                           StringBuilder current,
                                           List<String> result) {
        if (current.length() == chars.length) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (used[i]) continue;

            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            current.append(chars[i]);
            getAllPermutations(chars, used, current, result);
            used[i] = false;
            current.deleteCharAt(current.length() - 1);
        }
    }
}
