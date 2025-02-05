package org.example;

import java.util.LinkedList;
import java.util.List;

public class BreakCamelCase {
    public static String camelCase(String input) {

        List<Integer> indexes = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                indexes.add(i);
            }
        }

        String result = separateCamelCase(input, indexes);

        return result;
    }

    private static String separateCamelCase(String input, List<Integer> indexes) {

        String result = "";

        int prevIndex = 0;
        for (int i = 0; i < indexes.size(); i++) {
            int index = indexes.get(i);
            String word = input.substring(prevIndex, index);
            result += " " + word;
            prevIndex = index;
        }

        result += " " + input.substring(prevIndex);
        return result.trim();
    }

    public static void main(String[] args) {
        String s = separateCamelCase("camelCasingImportantTest", List.of(5, 11,20));
        System.out.println("separateCamelCase: " + s);
    }
}
