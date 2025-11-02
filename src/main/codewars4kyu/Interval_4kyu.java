package codewars4kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Interval_4kyu {

    public static void main(String[] args) {
        System.out.println(sumIntervals(new int[][]{{1, 5}}));                     // 4
        System.out.println(sumIntervals(new int[][]{{1, 5}, {6, 10}}));            // 8
        System.out.println(sumIntervals(new int[][]{{1, 5}, {1, 5}}));             // 4
        System.out.println(sumIntervals(new int[][]{{1, 4}, {7, 10}, {3, 5}}));    // 7
        System.out.println(sumIntervals(new int[][]{{1, 2}, {2, 6}, {5, 9}}));     // 8
    }

    public static int sumIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];
        merged.add(current);

        for (int[] interval : intervals) {
            int currentStart = current[0];
            int currentEnd = current[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (nextStart <= currentEnd) {
                current[1] = Math.max(currentEnd, nextEnd);
            } else {
                current = interval;
                merged.add(current);
            }
        }

        int sum = 0;
        for (int[] interval : merged) {
            sum += interval[1] - interval[0];
        }

        return sum;
    }
}
