public class WorkOnStrings {

    public static String workOnStrings(String a, String b) {

        String result = "";

        for (int i = 0; i < a.length(); i++) {
            String s = a.charAt(i) + "";
            if (b.contains(s) && Character.isLowerCase(s.charAt(0))) {
                b = b.replace(s, s.toUpperCase());
            } else if (b.contains(s) && Character.isUpperCase(s.charAt(0))) {
                b = b.replace(s, s.toLowerCase());
            }
        }
        result += b;

        for (int i = 0; i < b.length(); i++) {
            String s = b.charAt(i) + "";
            if (a.contains(s) && Character.isLowerCase(s.charAt(0))) {
                a = a.replace(s, s.toUpperCase());
            } else if (a.contains(s) && Character.isUpperCase(s.charAt(0))) {
                a = a.replace(s, s.toLowerCase());
            }
        }
        a += result;

        return a;
    }

    public static void main(String[] args) {
        System.out.println(workOnStrings("abc", "cde"));
        System.out.println(workOnStrings("ab", "aba"));
        System.out.println(workOnStrings("abab", "bababa"));
    }
}
