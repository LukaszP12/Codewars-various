public class WorkOnStrings {

    public static String workOnStrings(String a, String b) {

        String result = "";

        for (int i = 0; i < a.length(); i++) {
            String s = a.charAt(i) + "";
            if (b.toLowerCase().contains(s.toLowerCase())) {
                b = switchCase(b, s);
            }
        }
        result += b;

        for (int i = 0; i < b.length(); i++) {
            String s = b.charAt(i) + "";
            if (a.toLowerCase().contains(s.toLowerCase())) {
                a = switchCase(a, s);
            }
        }
        a += result;

        return a;
    }

    private static String switchCase(String word, String letter) {
        String newWord = "";

        for (int i = 0; i < word.length(); i++) {
            String s = word.charAt(i) + "";

            if (s.equalsIgnoreCase(letter)) {
                if (Character.isUpperCase(s.charAt(0))) {
                    newWord += s.toLowerCase();
                    continue;
                } else if (Character.isLowerCase(s.charAt(0))) {
                    newWord += s.toUpperCase();
                    continue;
                }
            }
            newWord += s;
        }
        return newWord;
    }

    public static void main(String[] args) {
        System.out.println(workOnStrings("abc", "cde"));
        System.out.println(workOnStrings("ab", "aba"));
        System.out.println(workOnStrings("abab", "bababa"));
    }
}
