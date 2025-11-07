package codewars5kyu;

class SimpleStringExpansion_5kyu {
    public static String solve(String s) {
        return calculate(s);
    }

    private static String calculate(String s) {
        if (!s.contains("(")) {
            return s;
        }

        int leftIndex = s.lastIndexOf('(');
        int rightIndex = s.indexOf(')', leftIndex);

        int digitIndex = leftIndex - 1;
        int digit = 1;

        if (digitIndex >= 0 && Character.isDigit(s.charAt(digitIndex))) {
            digit = s.charAt(digitIndex) - '0';
        } else {
            digitIndex = leftIndex; // no digit, so don't remove any character before '('
        }

        String content = s.substring(leftIndex + 1, rightIndex);
        String expanded = calculate(content).repeat(digit);

        s = s.substring(0, leftIndex - 1) + expanded + s.substring(rightIndex + 1);

        return calculate(s);
    }

    public static void main(String[] args) {
        String s = "3(ab)";
        System.out.println(solve(s));

        String s1 = "2(a3(b))";
        System.out.println(solve(s1));

//        String s2 = "3(b(2(c)))";
//        System.out.println(solve(s2));

        System.out.println(solve("3(ab)2(cd)"));
        System.out.println(solve("1(a2(b3(c)))"));
        System.out.println(solve("2(3(a)b)"));

//        String s3 = "k(a3(b(a2(c))))";
//        System.out.println(solve(s3));
    }
}
