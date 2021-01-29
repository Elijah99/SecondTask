package com.epam.task.second.logic;

public interface StringReplacement {
    public String replaceCharInAllWordsAtGivenPosition(String text, Character character, Integer position) throws StringLogicException;

    public String replaceWordsWithGivenLength(String text, Integer length, String replacement) throws StringLogicException;
}
