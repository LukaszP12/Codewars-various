package codewars6kyu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class NumbersOfLetters_6kyu {

    private static final Map<Integer, String> numberToWord = Map.of(
            0, "zero",
            1, "one",
            2, "two",
            3, "three",
            4, "four",
            5, "five",
            6, "six",
            7, "seven",
            8, "eight",
            9, "nine"
    );

    public static List<String> numbersOfLetters(int num) {
        List<String> result = new ArrayList<>();

        return getNumbers(num, result);
    }

    private static List<String> getNumbers(int num, List<String> result) {
        int n = 0;
        String output = "";

        for (char c : String.valueOf(num).toCharArray()) {
            n = c - '0';
            String s = numberToWord.get(n);
            output += s;
        }
        result.add(output);

        if (output.length() == num) {
            return result;
        }

        return getNumbers(output.length(), result);
    }


    public static void main(String[] args) {
        numbersOfLetters(1).forEach(System.out::println);
        numbersOfLetters(60).forEach(System.out::println);
        numbersOfLetters(12).forEach(System.out::println);
        numbersOfLetters(37).forEach(System.out::println);
        numbersOfLetters(311).forEach(System.out::println);
        numbersOfLetters(999).forEach(System.out::println);
    }
}
