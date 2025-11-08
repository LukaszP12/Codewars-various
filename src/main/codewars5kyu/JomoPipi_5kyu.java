package codewars5kyu;

class JomoPipi_5kyu {
    public static String jumbledString(String s, long n) {
        if (n == 0) {
            return s;
        }

        String front = "";
        String back = "";

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                front += s.charAt(i);
            } else if (i % 2 != 0) {
                back += s.charAt(i);
            }
        }

        return jumbledString(front + "" + back, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(jumbledString("abcdef", 2));
        System.out.println(jumbledString("Wow Example!", 1));
        System.out.println(jumbledString("I'm Jomo Pipi", 1));
    }
}
