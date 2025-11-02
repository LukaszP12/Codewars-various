package codewars4kyu;

import java.util.ArrayList;
import java.util.List;

class Snail_4kyu {

    public static int[] snail(int[][] array) {
        if (array.length == 0 || array[0].length == 0) {
            return new int[0];
        }

        List<Integer> result = new ArrayList<>();
        int top = 0, bottom = array.length - 1;
        int left = 0, right = array[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(array[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(array[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(array[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                // left column
                for (int i = bottom; i >= top; i--) {
                    result.add(array[i][left]);
                }
                left++;
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        // there is also a solution with recursion
    }
}
