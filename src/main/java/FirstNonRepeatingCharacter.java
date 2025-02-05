public class FirstNonRepeatingCharacter {
    public static String firstNonRepeatingLetter(String s) {

        String string = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            String s_without_char = string.substring(0, i) + string.substring(i + 1);
            String c = "" + s.charAt(i);

            if (!s_without_char.contains(c.toLowerCase())) {
                return c;
            }
        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter("stress"));
        System.out.println(firstNonRepeatingLetter("sTreSS"));
    }
}
