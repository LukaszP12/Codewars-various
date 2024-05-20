import java.util.HashSet;
import java.util.Set;

public class Isograms {
    public static boolean isIsogram(String str) {

        if ("".equals(str)) {
            return true;
        }

        Set<Character> uniqueWords = new HashSet<>();
        char[] chars = str.toCharArray();

        for (Character c : chars) {
            char newC = Character.toLowerCase(c);

            if (uniqueWords.contains(newC)) {
                return false;
            } else {
                uniqueWords.add(newC);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("aba"));
        System.out.println(isIsogram("moOse"));
    }
}
