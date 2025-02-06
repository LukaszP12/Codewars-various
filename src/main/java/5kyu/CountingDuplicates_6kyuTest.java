package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CountingDuplicates_6kyuTest {

    @Test
    public void duplicateCount() {
        // given
        String abcde = "abcde";
        // when
        int i = CountingDuplicates_6kyu.duplicateCount(abcde);
        // then
        Assert.assertEquals(i,0);
    }

    @Test
    public void duplicateCount_2() {
        // given
        String abcde = "aabbcde";
        // when
        int i = CountingDuplicates_6kyu.duplicateCount(abcde);
        // then
        Assert.assertEquals(i,2);
    }

    @Test
    public void duplicateCount_3() {
        // given
        String abcde = "aabBcde";
        // when
        int i = CountingDuplicates_6kyu.duplicateCount(abcde);
        // then
        Assert.assertEquals(i,2);
    }

    @Test
    public void duplicateCount_4() {
        // given
        String abcde = "indivisibility";
        // when
        int i = CountingDuplicates_6kyu.duplicateCount(abcde);
        // then
        Assert.assertEquals(i,1);
    }

    @Test
    public void duplicateCount_5() {
        // given
        String abcde = "ABBA";
        // when
        int i = CountingDuplicates_6kyu.duplicateCount(abcde);
        // then
        Assert.assertEquals(i,2);
    }

    @Test
    public void duplicateCount_6() {
        // given
        String abcde = "Indivisibilities";
        // when
        int i = CountingDuplicates_6kyu.duplicateCount(abcde);
        // then
        Assert.assertEquals(i,2);
    }
}
