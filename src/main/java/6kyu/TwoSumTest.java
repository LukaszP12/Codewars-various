package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TwoSumTest {

    @Test
    public void test1() {
        // given
        int[] ints = {1, 2, 3};
        int target = 4;
        // when
        int[] ints1 = TwoSum.twoSum(ints, target);
        // then
        System.out.printf(Arrays.toString(ints1));
    }

    @Test
    public void test2() {
        // given
        int[] ints = {2, 3, 1};
        int target = 4;
        // when
        int[] ints1 = TwoSum.twoSum(ints, target);
        // then
        System.out.printf(Arrays.toString(ints1));
    }

}