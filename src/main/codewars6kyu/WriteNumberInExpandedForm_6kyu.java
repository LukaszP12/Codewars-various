package codewars6kyu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class WriteNumberInExpandedForm_6kyu {
    public static String expandedForm(int num) {
        List<String> result = new ArrayList<>();

        int i = 1;

        while (num > 0) {
            int lastDigit = num % 10;

            if (lastDigit != 0) {
                result.add("" + lastDigit * i);
            }
            num = num / 10;
            i *= 10;
        }

        Collections.reverse(result);
        return result.stream().collect(Collectors.joining(" + "));
    }

    public static void main(String[] args) {
        System.out.println(expandedForm(12));
        System.out.println(expandedForm(45));
        System.out.println(expandedForm(70304));
    }
}
