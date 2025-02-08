package org.example;

import java.util.Arrays;

public class StringArrayDuplicates_6kyu {
    public static String[] dup(String[] arr) {
        String[] result = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = removeDuplicates(arr[i]);
        }

        return result;
    }

    private static String removeDuplicates(String s) {
        String result = "" + s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            char c2 = s.charAt(i);
            char c1 = s.charAt(i - 1);

            if (c2 == c1) {
                continue;
            } else if (c1 != c2) {
                result += "" + c2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"abracadabra", "allottee", "assessee"};
        System.out.println(Arrays.toString(dup(strings)));

        String[] strings1 = new String[]{"kelless", "keenness"};
        System.out.println(Arrays.toString(dup(strings1)));
    }
}
