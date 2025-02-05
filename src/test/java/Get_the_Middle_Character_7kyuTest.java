import org.junit.Assert;
import org.junit.Test;

public class Get_the_Middle_Character_7kyuTest {

    @Test
    public void getMiddle_length_of_4() {
        // given
        String test = "test";
        // when
        Get_the_Middle_Character_7kyu.getMiddle(test);
        // then
        Assert.assertEquals("es", Get_the_Middle_Character_7kyu.getMiddle(test));
    }

    @Test
    public void getMiddle_length_of_8() {
        // given
        String test = "testing";
        // when
        Get_the_Middle_Character_7kyu.getMiddle(test);
        // then
        Assert.assertEquals("t", Get_the_Middle_Character_7kyu.getMiddle(test));
    }

    @Test
    public void getMiddle_length_of_6() {
        // given
        String test = "middle";
        // when
        Get_the_Middle_Character_7kyu.getMiddle(test);
        // then
        Assert.assertEquals("dd", Get_the_Middle_Character_7kyu.getMiddle(test));
    }

    @Test
    public void getMiddle_length_of_1() {
        // given
        String test = "A";
        // when
        Get_the_Middle_Character_7kyu.getMiddle(test);
        // then
        Assert.assertEquals("A", Get_the_Middle_Character_7kyu.getMiddle(test));
    }

}
