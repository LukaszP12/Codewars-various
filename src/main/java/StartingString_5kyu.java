import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StartingString_5kyu {

    public static String[] solution(String str) {

        Map<String, Set<String>> map = new HashMap<>();

        String[] words = str.split("\\s");

        Set<String> subWords = generateSubWords(words);

        for (String sWords : subWords) {
            Set<String> strings = new HashSet<>();
            map.put(sWords, strings);
        }

        for (String word : words) {
            for (String subWord : subWords) {
                if (word.contains(subWord)) {
                    Set<String> strings = map.get(subWord);
                    strings.add(word);
                    map.put(subWord, strings);
                }
            }
        }

        List<String> results = new LinkedList<>();

        for (String key : map.keySet()) {
            if (key.length() == map.get(key).size()) {
                results.add("" + map.get(key));
            }
        }

        return results.toArray(new String[0]);
    }

    private static Set<String> generateSubWords(String[] words) {
        Set<String> subWords = new HashSet<>();

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                String subWord = word.trim().substring(0, i);
                if (!"".equals(subWord)) {
                    subWords.add(subWord);
                }
            }
        }

        return subWords;
    }

    public static void main(String[] args) {
        String s = "abc abcd abcde hello hey";
//        List<String> solution = solution(s);
        System.out.println(solution(s));
        String[] solution = solution(s);
        for (String s1 : solution) {
            System.out.println(s1);
        }

        String s1 = "Abc aBcd AbcDe";
        String[] solution1 = solution(s1);
        for (String s2 : solution1) {
            System.out.println(s2);
        }

        String s2 = "a abc abcd abe";
        String[] solution2 = solution(s2);
        for (String s3 : solution2) {
            System.out.println(s3);
        }
    }

}
