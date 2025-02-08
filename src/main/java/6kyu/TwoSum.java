package org.example;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {

        int[] results = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            int cNumber = numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                int secondNumber = numbers[j];
                if (i != j) {
                    if ((cNumber + secondNumber) == target) {
                        results[0] = i;
                        results[1] = j;
                    }
                }
            }
        }

        return results; // Do your magic!
    }
}