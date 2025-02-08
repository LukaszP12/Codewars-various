package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LongestCommonSubsequence_5kyu {
    public static String lcs(String x, String y) {

        Map<String, Integer> charMap1 = toCharMap(x);
        Map<String, Integer> charMap2 = toCharMap(y);

        List<String> commonSeqList = findCommonSeq(charMap1, charMap2);

        return commonSeqList.stream().reduce((a, b) -> a + b).orElse("").toString();
    }

    private static List<String> findCommonSeq(Map<String, Integer> charMap1, Map<String, Integer> charMap2) {
        List<String> commonList = new LinkedList<>();
        for (String key : charMap1.keySet()) {
            if (charMap2.containsKey(key)) {
                commonList.add(key);
            }
        }
        return commonList;
    }

    private static Map<String, Integer> toCharMap(String x) {
        Map<String, Integer> output = new HashMap<>();

        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (!output.containsKey(c)) {
                output.put("" + c, 1);
            } else {
                output.put("" + c, output.get(c) + 1);
            }
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(lcs("abcdef", "abc"));
        System.out.println(lcs("abcdef", "acf"));
        System.out.println(lcs("132535365", "123456789"));

        System.out.println(lcs("anothertest", "notatest"));
        //toDo this should equal "nottest"
    }
}
