package codewars4kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ObservedPin_4kyu {

    private static final Map<Character, List<Character>> ADJACENT = new HashMap<>();

    static {
        ADJACENT.put('0', Arrays.asList('0', '8'));
        ADJACENT.put('1', Arrays.asList('1', '2', '4'));
        ADJACENT.put('2', Arrays.asList('2', '1', '3', '5'));
        ADJACENT.put('3', Arrays.asList('3', '2', '6'));
        ADJACENT.put('4', Arrays.asList('4', '1', '5', '7'));
        ADJACENT.put('5', Arrays.asList('5', '2', '4', '6', '8'));
        ADJACENT.put('6', Arrays.asList('6', '3', '5', '9'));
        ADJACENT.put('7', Arrays.asList('7', '4', '8'));
        ADJACENT.put('8', Arrays.asList('8', '5', '7', '9', '0'));
        ADJACENT.put('9', Arrays.asList('9', '6', '8'));
    }

    public static List<String> getPINs(String observed) {
        List<String> result = new ArrayList<>();
        if (observed == null || observed.length() == 0) {
            return result;
        }

        result.add("");
        for (char c : observed.toCharArray()) {
            List<Character> choices = ADJACENT.get(c);
            if (choices == null) {
                choices = Arrays.asList(c);
            }
            List<String> newResult = new ArrayList<>();
            for (String prefix : result) {
                for (char choice : choices) {
                    newResult.add(prefix + choice);
                }
            }
            result = newResult;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
