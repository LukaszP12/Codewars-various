package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RepairArithmeticSequence_6kyuTest {

    @Test
    public void repairSequence() {
        // given
        int[] ints = {2, 4, 6, 8, 15, 12};
        // when
        int[] results = RepairArithmeticSequence_6kyu.repairSequence(ints);
        // then
        Assertions.assertArrayEquals(new int[]{2, 4, 6, 8, 10, 12}, results);
    }

    @Test
    public void repairSequence_2() {
        // given
        int[] ints = {2, 4, 6, 8, 11};
        // when
        int[] results = RepairArithmeticSequence_6kyu.repairSequence(ints);
        // then
        Assertions.assertArrayEquals(new int[]{2, 4, 6, 8, 10}, results);
    }

    @Test
    public void repairSequence_3() {
        // given
        int[] ints = {5, 4, 6, 8, 10};
        // when
        int[] results = RepairArithmeticSequence_6kyu.repairSequence(ints);
        // then
        Assertions.assertArrayEquals(new int[]{2, 4, 6, 8, 10}, results);
    }
}
