package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TransformToPrime_6kyuTest {

    @Test
    public void minimumNumber() {
        // given
        int[] ints = {3, 1, 2};

        // when
        int i = TransformToPrime_6kyu.minimumNumber(ints);

        // then
        Assert.assertEquals(1, i);
    }

    @Test
    public void minimumNumber_2() {
        // given
        int[] ints = {2, 12, 8, 4, 6};

        // when
        int i = TransformToPrime_6kyu.minimumNumber(ints);

        // then
        Assert.assertEquals(5, i);
    }

    @Test
    public void minimumNumber_3() {
        // given
        int[] ints = {50, 39, 49, 6, 17, 28};

        // when
        int i = TransformToPrime_6kyu.minimumNumber(ints);

        // then
        Assert.assertEquals(2, i);
    }

    @Test
    public void minimumNumber_4() {
        // given
        int[] ints = {1, 1, 1};

        // when
        int i = TransformToPrime_6kyu.minimumNumber(ints);

        // then
        Assert.assertEquals(2, i);
    }
}
