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
        } else if (digits == 2) {
            for (int i = 4; i < s.length(); i += 2) {
                if (Integer.parseInt(s.substring(i - 2, i)) - Integer.parseInt(s.substring(i - 4, i - 2)) == 1) {
                    continue;
                } else {
                    return (Integer.parseInt(s.substring(i - 2, i)) - 1);
                }
            }
        }

        return -1;
    }

    private static int checkDigits(String s) {

        if (isSingleDigit(s)) {
            return 1;
        } else if (!isSingleDigit(s) && isDoubleDigit(s)) {
            return 2;
        }

        return 0;
    }

    private static boolean isDoubleDigit(String s) {
        for (int i = 4; i < s.length(); i += 2) {
            if (Integer.parseInt(s.substring(i - 4, i - 2)) < Integer.parseInt(s.substring(i - 2, i))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
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

        System.out.println(isDoubleDigit("899091939495"));
        System.out.println(isDoubleDigit("123567"));

        System.out.println(missing("899091939495"));
    }

}
