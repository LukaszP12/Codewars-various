package codewars5kyu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class TaxiAllocator_5kyu {
    public static int minNumTaxis(int[] requests) {
        return 1;
    }

    public static int minNumTaxis(int[][] requests) {
        if (requests == null || requests.length == 0) {
            return 0;
        }
        Arrays.sort(requests, Comparator.comparingInt(r -> r[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int[] req : requests) {
            int start = req[0];
            int end = req[1];

            if (!pq.isEmpty() && pq.peek() < start) {
                pq.poll();
            }

            pq.offer(end);
        }

        return pq.size();
    }

    public static void main(String[] args) {
        int[] ints = {1, 4};
        System.out.println(minNumTaxis(ints));

        int[][] ints1 = {{1, 4}, {5, 9}};
        System.out.println(minNumTaxis(ints1));

        int[][] ints2 = {{1, 4}, {2, 9}, {3, 6}};
        System.out.println(minNumTaxis(ints2));

        int[][] ints3 = {{1, 4}, {2, 9}, {3, 6}, {5, 8}};
        System.out.println(minNumTaxis(ints3));
    }
}
