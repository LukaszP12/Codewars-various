import java.util.Arrays;

public class PersistentBugger_6ky {

    public static int persistence(long n) {
        int counter = 0;

        while (n > 9) {
            n = multiplyDigits(toDigitArray(n));
            counter++;
        }
        return counter; // your code
    }

    private static long multiplyDigits(int[] digitArray) {
        return Arrays.stream(digitArray).reduce(1, (a, b) -> a * b);
    }

    private static int[] toDigitArray(long n) {
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            digits[i] = digit;
        }
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(persistence(39));
        System.out.println(persistence(999));
        System.out.println(persistence(4));
    }
}
