package codewars6kyu;

import java.util.Arrays;

class AreSame_6kyu {

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) {
            return false;
        }
        if (a.length != b.length) {
            return false;
        }

        int[] aSquares = Arrays.stream(a).map(x -> x * x).toArray();

        Arrays.sort(aSquares);
        Arrays.sort(b);

        return Arrays.equals(aSquares, b);
    }

    public static boolean comp_2(int[] a, int[] b) {
        if (a == null || b == null) {
            return false;
        }
        if (a.length != b.length) {
            return false;
        }

        int[] bSquares = Arrays.stream(b).map(x -> (int) Math.sqrt(x)).toArray();

        Arrays.sort(bSquares);
        Arrays.sort(a);

        return Arrays.equals(a, bSquares);
    }

    public static void main(String[] args) {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a, b));
        System.out.println(comp_2(a, b));
    }
}
