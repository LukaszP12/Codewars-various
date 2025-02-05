import java.util.Comparator;
import java.util.TreeSet;

public class InspiringStrings {

    public static String longestWord(String wordString) {
        TreeSet<String> strings = new TreeSet<String>(
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        if (o1.length() > o2.length()) {
                            return 1;
                        } else if (o1.length() < o2.length()) {
                            return -1;
                        } else {
                            return 0;
                        }
                    }
                }
        );

        String[] split = wordString.split("\\s");

        for (String s : split) {
            strings.add(s);
        }

        // Give me back the longest word!
        return strings.pollLast();
    }

    public static void main(String[] args) {
        System.out.println(longestWord("red white yellowsub2 blue yellowsub"));
        System.out.println(longestWord("red blue gold"));
        System.out.println(longestWord("a b c d e fgh"));
        System.out.println(longestWord("one two three"));
        System.out.println(longestWord("red blue grey"));

        // should return the most rightmost
    }
}
