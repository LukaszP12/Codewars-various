import java.util.Arrays;

public class FindOdd {
    public static int findIt(int[] a) {

        Arrays.sort(a);
        int counter = 1;
        int prev = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] == prev) {
                counter++;
            } else {
                if (counter % 2 != 0) {
                    return prev;
                }
                counter = 1;
            }
            prev = a[i];
        }

        if (counter % 2 != 0) {
            return prev;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1};
        System.out.println(findIt(ints));

        int[] ints1 = {1, 1, 2};
        System.out.println(findIt(ints1));

        int[] ints2 = {7};
        System.out.println(findIt(ints2));

        int[] ints3 = {0};
        System.out.println(findIt(ints3));

        int[] ints4 = {0, 1, 0, 1, 0};
        System.out.println(findIt(ints4));
    }
}
