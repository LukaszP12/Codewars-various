import java.util.Arrays;

public class ReversedArrayofDigits {

    public static int[] digitize(long n) {
        int[] result_array = new int[String.valueOf(n).length()];

        String string = new StringBuilder(String.valueOf(n)).reverse().toString();

        for (int i = 0; i < string.length(); i++) {
            result_array[i] = Integer.valueOf("" + string.charAt(i));
        }

        return result_array;
    }

    public static void main(String[] args) {
        int[] digitize = digitize(35231);
        Arrays.stream(digitize).forEach(d -> {
            System.out.println(d);
        });

        int[] digitize1 = digitize(0);
        Arrays.stream(digitize1).forEach(d -> {
            System.out.println(d);
        });
    }
}
