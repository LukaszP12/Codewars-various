import java.util.Arrays;

public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);

        return args[0];
    }

    public static void main(String[] args) {
        int[] ints = {78, 56, 232, 12, 11, 43};
        System.out.println(findSmallestInt(ints));

        int[] ints1 = {78, 56, -2, 12, 8, -33};
        System.out.println(findSmallestInt(ints1));

        int[] ints2 = {0, Integer.MIN_VALUE, Integer.MAX_VALUE};
        System.out.println(findSmallestInt(ints2));
    }
}
