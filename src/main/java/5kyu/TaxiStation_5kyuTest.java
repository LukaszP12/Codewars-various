package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TaxiStation_5kyuTest {

    @Test
    public void test1() {
        // given
        int[] distances = {120, 80, 60};
        int[] speeds = {50};

        // when
        int[] results = TaxiStation_5kyu.calculateTrips(distances, speeds);

        // then
        Assert.assertArrayEquals(results, new int[]{3});
    }

    @Test
    public void test2() {
        // given
        int[] distances = {100, 50, 80};
        int[] speeds = {50, 80};

        // when
        int[] results = TaxiStation_5kyu.calculateTrips(distances, speeds);

        // then
        Assert.assertArrayEquals(results, new int[]{2, 1});
    }

    @Test
    public void test3() {
        // given
        int[] distances = {100, 50, 80, 40, 40};
        int[] speeds = {30, 20, 10};

        // when
        int[] results = TaxiStation_5kyu.calculateTrips(distances, speeds);

        // then
        Assert.assertArrayEquals(results, new int[]{2, 2, 1});
    }

    @Test
    public void test4() {
        // given
        int[] distances = {100, 50, 80, 40, 40, 100, 50, 80, 40, 40};
        int[] speeds = {30, 20, 10};

        // when
        int[] results = TaxiStation_5kyu.calculateTrips(distances, speeds);
        System.out.println(Arrays.toString(results));
        //toDo find why reason for wrong allocation

        // then
        Assert.assertArrayEquals(results, new int[]{5, 3, 2});
    }

}
