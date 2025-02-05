import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleOfIndex {

    public static int[] multipleOfIndex(int[] array) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (i == 0 && array[0] == 0) {
                list.add(array[0]);
            }
            if (i != 0 && array[i] % i == 0) {
                list.add(array[i]);
            }
        }

        int[] results = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            results[i] = list.get(i);
        }

        //your code;
        return results;
    }

    public static void main(String[] args) {
        int[] ints = {22, -6, 32, 82, 9, 25};
        int[] ints1 = multipleOfIndex(ints);
        for (int i = 0; i < ints1.length; i++) {
            System.out.println(ints1[i]);
        }
        System.out.println();

        int[] ints2 = {68, -1, 1, -7, 10, 10};
        int[] filter2 = multipleOfIndex(ints2);
        Arrays.stream(filter2).forEach(System.out::println);
        System.out.println();

        int[] ints3 = {-56, -85, 72, -26, -14, 76, -27, 72, 35, -21, -67, 87, 0, 21, 59, 27, -92, 68};
        int[] filter3 = multipleOfIndex(ints3);
        Arrays.stream(filter3).forEach(System.out::println);
        System.out.println();

        int[] ints4 = {11, -11};
        int[] filter4 = multipleOfIndex(ints4);
        Arrays.stream(filter4).forEach(System.out::println);
        System.out.println();

        int[] ints5 = {0, 2, 3, 6, 9};
        int[] filter5 = multipleOfIndex(ints5);
        Arrays.stream(filter5).forEach(System.out::println);
        System.out.println();
    }
}
