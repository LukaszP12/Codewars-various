public class SimpleNumberSequence {

    public static int missing(String s) {

        int digits = checkDigits(s);

        if (digits == 1) {

            for (int i = 1; i < s.length(); i++) {
                if (Integer.parseInt("" + s.charAt(i)) - Integer.parseInt("" + s.charAt(i - 1)) == 1) {
                    continue;
                } else {
                    return (Integer.parseInt("" + s.charAt(i)) - 1);
                }
            }
        }

        return -1;
    }

    private static int checkDigits(String s) {

        if (isSingleDigit(s)) {
            return 1;
        }

        return 0;
    }

    private static boolean isSingleDigit(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (Integer.parseInt("" + s.charAt(i - 1)) < Integer.parseInt("" + s.charAt(i))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(missing("123567"));
        System.out.println(missing("134"));
        System.out.println(missing("11224"));
    }

}
