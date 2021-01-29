package com.epam.task.second.logic;

import org.junit.Assert;
import org.junit.Test;

public class StringLogicTest {

    public static final String STRING_ONE_NUMBER = "1";
    public static final String STRING_ALL_CHARS = "1 1asd2 as45 12/.z 1][| 12a";
    public static final String STRING_CHARS = "1 1as 1d1a b zx";
    public static final String STRING_EMPTY = "";

    // --------- Tests for replaceCharInAllWordsAtGivenPosition method --------

    @Test
    public void testReplaceCharInAllWordsAtGivenPositionShouldReplaceCharInAllWordsAtGivenPositionWhenOneNumberAtString(){
        //given
        StringLogic logic = new StringLogic();
        //when
        String actual = logic.replaceCharInAllWordsAtGivenPosition(STRING_ONE_NUMBER,'9',0);
        //then
        Assert.assertEquals("9",actual);
    }

    @Test
    public void testReplaceCharInAllWordsAtGivenPositionShouldReplaceCharInAllWordsAtGivenPositionWhenAllCharsApplied(){
        //given
        StringLogic logic = new StringLogic();
        //when
        String actual = logic.replaceCharInAllWordsAtGivenPosition(STRING_ALL_CHARS,'9',2);
        //then
        Assert.assertEquals("1 1a9d2 as95 129.z 1]9| 129",actual);
    }

    @Test
    public void testReplaceCharInAllWordsAtGivenPositionShouldReplaceCharInAllWordsAtGivenPositionWhenCharsApplied(){
        //given
        StringLogic logic = new StringLogic();
        //when
        String actual = logic.replaceCharInAllWordsAtGivenPosition(STRING_CHARS,'9',2);
        //then
        Assert.assertEquals("1 1a9 1d9a b zx",actual);
    }

    @Test
    public void testReplaceCharInAllWordsAtGivenPositionShouldReturnEmptyStringWhenEmptyStringApplied(){
        //given
        StringLogic logic = new StringLogic();
        //when
        String actual = logic.replaceCharInAllWordsAtGivenPosition(STRING_EMPTY,'9',2);
        //then
        Assert.assertEquals(STRING_EMPTY,actual);
    }

    // --------- Tests for replaceWordsWithGivenLength method --------

    @Test
    public void testReplaceWordsWithGivenLengthShouldReturnGivenStringWhenStringDoesNotContainWordWithGivenLength(){
        //given
        StringLogic logic = new StringLogic();
        //when
        String actual = logic.replaceWordsWithGivenLength(STRING_ONE_NUMBER,2,"AAA");
        //then
        Assert.assertEquals(STRING_ONE_NUMBER,actual);
    }

    @Test
    public void testReplaceWordsWithGivenLengthShouldReplaceWordsWithGivenLengthWhenCharsApplied(){
        //given
        StringLogic logic = new StringLogic();
        //when
        String actual = logic.replaceWordsWithGivenLength(STRING_CHARS,3,"AA");
        //then
        Assert.assertEquals("1 AA 1d1a b zx",actual);
    }

    @Test
    public void testReplaceWordsWithGivenLengthShouldReplaceWordsWithGivenLengthWhenAllCharsApplied(){
        //given
        StringLogic logic = new StringLogic();
        //when
        String actual = logic.replaceWordsWithGivenLength(STRING_ALL_CHARS,4,"AAA");
        //then
        Assert.assertEquals("1 1asd2 AAA 12/.z AAA 12a",actual);
    }

    @Test
    public void testReplaceWordsWithGivenLengthShouldReturnEmptyStringWhenEmptyStringApplied(){
        //given
        StringLogic logic = new StringLogic();
        //when
        String actual = logic.replaceWordsWithGivenLength(STRING_EMPTY,4,"AAA");
        //then
        Assert.assertEquals(STRING_EMPTY,actual);
    }


}
