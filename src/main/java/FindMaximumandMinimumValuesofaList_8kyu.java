import java.util.Arrays;

public class FindMaximumandMinimumValuesofaList_8kyu {

    public static int min(int[] list) {
        Arrays.sort(list);
        return list[0];
    }

    public static int max(int[] list) {
        Arrays.sort(list);
        return list[list.length - 1];
    }

    public static void main(String[] args) {
        int[] ints = {4, 6, 2, 1, 9, 63, -134, 566};
        System.out.println("min: " + min(ints) + " max: " + max(ints));

        int[] ints1 = {-52, 56, 30, 29, -54, 0, -110};
        System.out.println("min: " + min(ints1) + " max: " + max(ints1));

        int[] ints2 = {42, 54, 65, 87, 0};
        System.out.println("min: " + min(ints2) + " max: " + max(ints2));

        int[] ints3 = {5};
        System.out.println("min: " + min(ints3) + " max: " + max(ints3));
    }
}
