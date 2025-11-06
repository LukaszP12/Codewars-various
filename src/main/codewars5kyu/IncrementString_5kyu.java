package codewars5kyu;

class IncrementString_5kyu {
    public static String incrementString(String str) {
        if (str.isBlank()) {
            return "1";
        }

        char lastChar = str.charAt(str.length() - 1);

        if (Character.isDigit(lastChar)) {
            int indexLastDigit = getIndexLastDigit(str);
            String number = str.substring(indexLastDigit);

            String baseWord = str.substring(0, indexLastDigit);
            int numberSuffix = Integer.parseInt(number) + 1;

            String resultString = baseWord + "" + numberSuffix;

            int diffInputOutput = str.length() - resultString.length();
            if (diffInputOutput <= 0) {
                return resultString;
            } else {
                String add0s = "0".repeat(diffInputOutput);
                return baseWord + "" + add0s + numberSuffix;
            }
        } else {
            return str + "1";
        }
    }

    private static int getIndexLastDigit(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isDigit(str.charAt(i))) {
                continue;
            } else {
                return i + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(incrementString("foobar000"));
        System.out.println(incrementString("foo"));
        System.out.println(incrementString("foobar001"));
        System.out.println(incrementString("foobar99"));
        System.out.println(incrementString("foobar099"));
        System.out.println(incrementString("foobar22"));
        System.out.println(incrementString(""));
    }
}
