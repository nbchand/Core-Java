package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class WordsCount {
    public static int getWordsCount(String sentence){
        String word[] = sentence.split(" ");
        return word.length;
    }
    /**
     * Counts no. of words in a sentence
     */
    public static void performTask() {
        System.out.println("No. of words: "+getWordsCount("I want to be a software engineer."));
    }
}
