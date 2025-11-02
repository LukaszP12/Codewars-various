package codewars4kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Snail_4kyuTest {
    @Test
    public void simpleTest() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] expected = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        assertArrayEquals(expected, Snail_4kyu.snail(array));
    }
}
