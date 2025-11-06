package codewars6kyu;

class YourOrderPlease_6kyu {
    public static String order(String words) {
        if (words == null || words.isEmpty()) {
            return "";
        }

        String[] split = words.split("\\s");

        int i = 0;
        int length = split.length;

        String result = "";

        while (i <= length) {
            for (String s : split) {
                if (s.contains(i + "")) {
                    int digitIndex = getDigitIndex(s);
                    result += s.substring(0, digitIndex) + "" + s.substring(digitIndex + 1) + " ";
                }
            }
            i++;
        }

        return result.substring(0, result.length() - 1);
    }

    private static int getDigitIndex(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "is2 Thi1s T4est 3a";
        System.out.println(order(s));
        String s1 = "4of Fo1r pe6ople g3ood th5e the2";
        System.out.println(order(s1));
        System.out.println(order(""));
    }
}
