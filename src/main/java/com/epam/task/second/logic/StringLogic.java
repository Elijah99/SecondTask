package com.epam.task.second.logic;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringLogic implements StringReplacement {

    public static final String DELIMITER_SPACE = " ";
    private static final Logger LOGGER = LogManager.getLogger(StringLogic.class);

    public String replaceCharInAllWordsAtGivenPosition(String text, Character character, Integer position) {
        List<String> resultList = new ArrayList<String>();
        String[] words = text.split(DELIMITER_SPACE);
        for (String word : words) {
            String replacedWord = replaceCharInWordAtGivenPosition(word, character, position);
            resultList.add(replacedWord);
        }
        String resultString = convertListToString(resultList);
        return resultString;
    }

    public String replaceWordsWithGivenLength(String text, Integer length, String replacement) {
        String[] words = text.split(DELIMITER_SPACE);
        List<String> wordsList = Arrays.asList(words);
        for (String word : wordsList) {
            if (word.length() == length) {
                int index = wordsList.indexOf(word);
                wordsList.set(index, replacement);
            }
        }
        String result = convertListToString(wordsList);
        return result;

    }

    protected String replaceCharInWordAtGivenPosition(String word, Character character, Integer position) {
        if (position >= 0 && position < word.length()) {
            StringBuilder resultWord = new StringBuilder(word);
            resultWord.setCharAt(position, character);
            return resultWord.toString();
        } else {
            return word;
        }
    }

    protected String convertListToString(List<String> words) {
        StringBuilder builder = new StringBuilder();
        for (String s : words) {
            builder.append(s);
            builder.append(DELIMITER_SPACE);
        }
        String result = builder.toString();
        return result.trim();
    }

}
