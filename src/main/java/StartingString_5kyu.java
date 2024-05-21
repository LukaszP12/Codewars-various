import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StartingString_5kyu {

    public static String[] solution(String str) {

        Map<String, List<String>> map = new HashMap<>();

        String[] words = str.split(",");

        for (String word : words) {
            List<String> strings = new LinkedList<>();
            map.put(word, strings);
        }

        for (String word : words) {
            for (String word2 : words) {
                if (!word.equals(word2) && word2.contains(word)) {
                    List<String> strings = map.get(word);
                    strings.add(word2);
                    map.put(word, strings);
                }
            }
        }
        System.out.println(map);

        return null;
    }

    public static void main(String[] args) {
        String s = "abc, abcd, abcde,hello,hey";
        solution(s);
    }

}
