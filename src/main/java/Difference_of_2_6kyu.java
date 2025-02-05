import java.util.ArrayList;
import java.util.List;

public class Difference_of_2_6kyu {

    public static int[][] twosDifference(int[] array) {

        List<String> results = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (2 == (int) Math.abs(array[i] - array[j])) {
                    results.add(array[i] + ", " + array[j]);
                }
            }
        }

        int[][] ints = new int[results.size()][results.size()];

        int index = 0;
        for (String s : results) {
            String[] split = s.split(",");
            ints[index][0] = Integer.valueOf(split[0]);
            ints[index][1] = Integer.valueOf(split[1].trim());
            index++;
        }

        return ints;
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4};
        int[][] ints1 = twosDifference(ints);

//        for (int i = 0; i < ints1.length; i++) {
//            for (int j = 0; j < ints1[0].length; j++) {
//                System.out.println(ints1[i][j]);
//            }
//        }
        int[] ints2 = {1, 3, 4, 6};
        twosDifference(ints2);
    }
}
