public class Scramblies_5kyu {

    public static boolean scramble(String str1, String str2) {

        if ("".equals(str1)) {
            return false;
        }

        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (str1.contains("" + c)) {
                int index = str1.indexOf(c);
                str1 = str1.substring(0, index) + str1.substring(index + 1);
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(scramble("rkqodlw", "world"));
        System.out.println(scramble("cedewaraaossoqqyt", "codewars"));
        System.out.println(scramble("katas", "steak"));
    }
}
