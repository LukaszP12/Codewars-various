package codewars5kyu;

class MaxContiguousSum_5kyu {
    public static int maxSequence(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
            currentSum = 0;
        }

        return maxSum;
    }

    // using Kadane’s Algorithm which works in O(n)
    public static int maxSequence_2(int[] arr) {
        int maxSoFar = 0;
        int currentMax = 0;
        for (int x : arr) {
            currentMax = Math.max(0, currentMax + x);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] ints = {3, -4, 8, 7, -10, 19, -3};
        System.out.println(maxSequence(ints));
        System.out.println(maxSequence_2(ints));

        int[] ints1 = {2, -3, -3, 9, -29, 8, -9};
        System.out.println(maxSequence(ints1));
        System.out.println(maxSequence_2(ints1));

        int[] ints2 = {3, -4, 8, 7, -10, 19, -3};
        System.out.println(maxSequence(ints2));
        System.out.println(maxSequence_2(ints2));

        int[] ints3 = {-8, -10, -12, -2, -3, 5};
        System.out.println(maxSequence(ints3));
        System.out.println(maxSequence_2(ints3));
    }
}
