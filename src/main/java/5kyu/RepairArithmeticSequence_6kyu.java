package org.example;

import java.util.*;

public class RepairArithmeticSequence_6kyu {

    public static int[] repairSequence(int[] sequence) {
        int diff = getCorrectDiff(sequence);

        return getCorrectSequence(diff, sequence.length);
    }

    private static int[] getCorrectSequence(int diff, int length) {
        int[] sequence = new int[length];
        for (int i = 0; i < length; i++) {
            sequence[i] = diff * (i + 1);
        }
        return sequence;
    }

    private static int getCorrectDiff(int[] sequence) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < sequence.length; i++) {
            if (i == sequence.length - 1) {
                continue;
            }
            int diff = sequence[i + 1] - sequence[i];
            if (map.containsKey(diff)) {
                map.put(diff, map.get(diff) + 1);
            } else {
                map.put(diff, 1);
            }
        }

        int maxValue = Collections.max(map.values());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] ints = {2, 4, 6, 8, 15, 12};
        repairSequence(ints);
        System.out.println("repairSequence(ints): " + Arrays.toString(repairSequence(ints)));

        int[] ints1 = {2, 4, 6, 8, 11};
        repairSequence(ints1);
        System.out.println("repairSequence(ints1): " + Arrays.toString(repairSequence(ints1)));

        int[] ints2 = {5, 4, 6, 8, 10};
        repairSequence(ints2);
        System.out.println("repairSequence(ints2): " + Arrays.toString(repairSequence(ints2)));
    }
}
