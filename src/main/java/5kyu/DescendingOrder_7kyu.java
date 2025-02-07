package org.example;

import java.util.Arrays;

public class DescendingOrder_7kyu {
    public static int sortDesc(final int num) {
        char[] charArray = String.valueOf(num).toCharArray();
        Arrays.sort(charArray);

        String result = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            result += charArray[i];
        }

        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(42145));
        System.out.println(sortDesc(145263));
        System.out.println(sortDesc(123456789));
    }
}
