package com.epam.task.second.logic;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class RegularExpressionLogic extends StringLogic {

    private static final Logger LOGGER = LogManager.getLogger(StringLogic.class);

    @Override
    public String replaceWordsWithGivenLength(String text, Integer length, String replacement) {
        String[] words = text.split(DELIMITER_SPACE);
        List<String> wordList = Arrays.asList(words);
        String lengthExpression = ".{" + length + "}.{0}";
        for (String word : wordList) {
            if (Pattern.matches(lengthExpression, word)) {
                int index = wordList.indexOf(word);
                wordList.set(index, replacement);
            }
        }
        return convertListToString(wordList);
    }
}