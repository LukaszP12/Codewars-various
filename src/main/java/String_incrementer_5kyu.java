public class String_incrementer_5kyu {

    public static String incrementString(String str) {
        String s = str.trim();

        String numberEnding = findNumberEnding(s);
        int endingIndex = findNumberEndingIndex(s);

        if ("-1".equals(numberEnding)) {
            return s + "1";
        } else {
            return addNumberToString(s, endingIndex, Integer.parseInt(numberEnding) + 1, numberEnding.length());
        }
    }

    private static int findNumberEndingIndex(String s) {
        int i = s.length() - 1;

        for (; i >= 0; ) {
            if (Character.isDigit(s.charAt(i))) {
                i--;
            } else if (!Character.isDigit(s.charAt(i))) {
                break;
            }
        }

        return (i == s.length() - 1) ? -1 : i;
    }

    private static String addNumberToString(String s, int endingIndex, int numberToAdd, int lengthOfOriginalNumber) {
        return s.substring(0, endingIndex + 1) + addMissingZeros(numberToAdd, lengthOfOriginalNumber);
    }

    private static String addMissingZeros(int numberToAdd, int lengthOfOriginalNumber) {
        String finalNumber = "";

        if (String.valueOf(numberToAdd).length() < lengthOfOriginalNumber) {
            for (int i = 0; i < lengthOfOriginalNumber - String.valueOf(numberToAdd).length(); i++) {
                finalNumber = "0" + finalNumber;
            }
        }

        return finalNumber + numberToAdd;
    }

    private static String findNumberEnding(String s) {
        String ending = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isDigit(s.charAt(i))) {
                ending += s.charAt(i);
            } else if (!Character.isDigit(s.charAt(i))) {
                break;
            }
        }

        if ("".equals(ending)) {
            return "-1";
        }

        return "" + new StringBuilder(ending).reverse();
    }

    public static void main(String[] args) {
        System.out.println(incrementString("foo"));
        System.out.println(incrementString("foobar23 "));
        System.out.println(incrementString("foo0042  "));
        System.out.println(incrementString("foo9  "));
        System.out.println(incrementString("foo099 "));
        System.out.println(incrementString("foobar000 "));
        System.out.println(incrementString("foobar005 "));
        System.out.println(incrementString(""));
        System.out.println(incrementString("fo99obar99"));
    }
}
