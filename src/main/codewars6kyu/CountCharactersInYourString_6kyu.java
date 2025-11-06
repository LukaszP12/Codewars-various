package codewars6kyu;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class CountCharactersInYourString_6kyu {
    public static Map<Character, Integer> count(String str) {
        HashMap<Character, Integer> resultMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!resultMap.containsKey(c)) {
                resultMap.putIfAbsent(c, 1);
            } else {
                resultMap.put(c, resultMap.get(c) + 1);
            }
        }

        return resultMap;
    }

    public static Map<Character, Long> count_2(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static void main(String[] args) {
        System.out.println(count("a"));
        System.out.println(count("abc"));
        System.out.println(count("aabbbac"));
        System.out.println(count("aaaaa"));

        System.out.println(count_2("a"));
        System.out.println(count_2("abc"));
        System.out.println(count_2("aabbbac"));
        System.out.println(count_2("aaaaa"));
    }
}
