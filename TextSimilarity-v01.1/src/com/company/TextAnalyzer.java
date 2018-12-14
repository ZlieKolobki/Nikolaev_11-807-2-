package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class TextAnalyzer {
    abstract double analyze(TextProvider te1, TextProvider te2);
    protected List<String> tokenizeUnique(String text) {
        text = text.replace(",", "");
        String[] words = text.split(" ");
        List<String> uniqueWords = new ArrayList<>();
        for (String word : words) {
            word = word.toLowerCase();
            if (!uniqueWords.contains(word))
                uniqueWords.add(word);
        }
        return uniqueWords;
    }
}