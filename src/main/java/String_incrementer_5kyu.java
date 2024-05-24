public class String_incrementer_5kyu {

    public static String incrementString(String str) {
        String s = str.trim();

        int numberEnding = findNumberEnding(s);
        if (numberEnding == -1) {
            return s + "1";
        } else {
            return addNumberToString(s, numberEnding + 1);
        }

    }

    private static String addNumberToString(String s, int numberToAdd) {

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                return s.substring(0, i) + numberToAdd;
            }
        }

        return s;
    }

    private static int findNumberEnding(String s) {
        String ending = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isDigit(s.charAt(i))) {
                ending += s.charAt(i);
            }
        }

        if ("".equals(ending)) {
            return -1;
        }

        return Integer.valueOf("" + new StringBuilder(ending).reverse());
    }

    public static void main(String[] args) {
        System.out.println(incrementString("foo"));
        System.out.println(incrementString("foobar23 "));
        System.out.println(incrementString("foo0042  "));
        System.out.println(incrementString("foo9  "));
        System.out.println(incrementString("foo099 "));
    }
}
