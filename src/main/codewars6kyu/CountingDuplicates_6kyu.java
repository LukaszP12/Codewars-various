package codewars6kyu;

import java.util.Arrays;

class CountingDuplicates_6kyu {
    public static int duplicateCount(String text) {
        char[] chars = text.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return countDuplicates(chars);
    }

    private static int countDuplicates(char[] chars) {
        int counter = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                counter++;
                while (i < chars.length && chars[i] == chars[i - 1]) {
                    i++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String input = "abcdeaB";
        System.out.println(duplicateCount(input));
        String input2 = "aAbBcCdD";
        System.out.println(duplicateCount(input2));
    }
}
