package com.epam.task.second.logic;

import org.junit.Assert;
import org.junit.Test;

public class RegularExpressionLogicTest {

    public static final String STRING_ONE_NUMBER = "1";
    public static final String STRING_ALL_CHARS = "1 1asd2 as45 12/.z 1][| 12a";

    @Test
    public void testReplaceWordsWithGivenLengthShouldReplaceWordsWithGivenLengthWhenNumbersApplied() {
        //given
        RegularExpressionLogic logic = new RegularExpressionLogic();
        //when
        String actual = logic.replaceWordsWithGivenLength(STRING_ONE_NUMBER, 1, "aa");
        //then
        Assert.assertEquals("aa", actual);
    }

    @Test
    public void testReplaceWordsWithGivenLengthShouldReplaceWordsWithGivenLengthAllCharsApplied(){
        //given
        RegularExpressionLogic logic = new RegularExpressionLogic();
        //when
        String actual = logic.replaceWordsWithGivenLength(STRING_ALL_CHARS, 4, "AaA");
        //then
        Assert.assertEquals("1 1asd2 AaA 12/.z AaA 12a", actual);
    }

}
