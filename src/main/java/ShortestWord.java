import java.util.Arrays;
import java.util.Comparator;

public class ShortestWord {

    public static int findShort(String s) {
        String[] words = s.split("\\s");

        Arrays.sort(words, Comparator.comparingInt(String::length));

        return words[0].length();
    }

    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
        System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));
        System.out.println(findShort("Let's travel abroad shall we"));
    }
}
