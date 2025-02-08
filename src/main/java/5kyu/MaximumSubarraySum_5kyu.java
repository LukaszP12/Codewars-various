package org.example;

public class MaximumSubarraySum_5kyu {

    public static int sequence(int[] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = getSumInterval(arr, i, j);
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        if (maxSum < 0){
            return 0;
        }

        return maxSum;
    }

    private static int getSumInterval(int[] arr, int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += arr[k];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(sequence(new int[]{}));
    }
}
