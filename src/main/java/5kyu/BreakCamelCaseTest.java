package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BreakCamelCaseTest {

    @Test
    public void camelCase() {
        //given
        String s = "camelCasing";
        //when
        String result = BreakCamelCase.camelCase(s);
        //then
        Assert.assertEquals("camel Casing", result);
    }

    @Test
    public void camelCase2() {
        //given
        String s = "identifier";
        //when
        String result = BreakCamelCase.camelCase(s);
        //then
        Assert.assertEquals("identifier", result);
    }

    @Test
    public void camelCase3() {
        //given
        String s = "";
        //when
        String result = BreakCamelCase.camelCase(s);
        //then
        Assert.assertEquals("", result);
    }

    @Test
    public void camelCase4() {
        //given
        String s = "camelCasingTest";
        //when
        String result = BreakCamelCase.camelCase(s);
        //then
        Assert.assertEquals("camel Casing Test", result);
    }
}
