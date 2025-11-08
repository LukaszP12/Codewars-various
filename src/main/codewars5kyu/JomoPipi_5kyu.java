package codewars5kyu;

class JomoPipi_5kyu {
    public static String jumbledString(String s, long n) {
        if (s == null || s.length() == 0 || n <= 0) {
            return s;
        }

        String odd = "";
        String even = "";

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                even += s.charAt(i);
            } else if (i % 2 != 0) {
                odd += s.charAt(i);
            }
        }

        return jumbledString(even + "" + odd, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(jumbledString("abcdef", 2));
        System.out.println(jumbledString("Wow Example!", 1));
        System.out.println(jumbledString("I'm Jomo Pipi", 1));
    }
}
