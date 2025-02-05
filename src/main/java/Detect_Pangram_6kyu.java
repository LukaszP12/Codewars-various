public class Detect_Pangram_6kyu {

    static final String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
            "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public static boolean check(String sentence) {
        for (String s : alphabet) {
            if (!sentence.toLowerCase().contains(s.toLowerCase())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(check(s));

        String s1 = "This is not a Pangram";
        System.out.println(check(s1));

        String s2 = "Cwm fjord bank glyphs vext quiz";
        System.out.println(check(s2));
    }
}
