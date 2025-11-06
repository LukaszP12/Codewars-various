package codewars5kyu;

class IncrementString_5kyu {
    public static String incrementString(String str) {
        if (str.isBlank()) {
            return "1";
        }

        char lastChar = str.substring(str.length() - 2, str.length() - 1).charAt(0);

        if (Character.isDigit(lastChar)) {
            int indexLastDigit = getIndexLastDigit(str);
            String number = str.substring(indexLastDigit);
            return str.substring(0, indexLastDigit) + "" + (Integer.parseInt(number) + 1);
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
        return -1;
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
