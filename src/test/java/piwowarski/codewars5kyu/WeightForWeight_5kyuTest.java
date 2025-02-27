package piwowarski.codewars5kyu;

import org.junit.Assert;
import org.junit.Test;

public class WeightForWeight_5kyuTest {

    @Test
    public void basic_test_for_input() {
        // given
        String s = "103 123 4444 99 2000";

        // when
        String result = WeightForWeight_5kyu.orderWeight(s);

        // then
        Assert.assertEquals("2000 103 123 4444 99", result);
    }

    @Test
    public void basic_test_for_input_2() {
        // given
        String s = "2000 10003 1234000 44444444 9999 11 11 22 123";

        // when
        String result = WeightForWeight_5kyu.orderWeight(s);

        // then
        Assert.assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", result);
    }
}
