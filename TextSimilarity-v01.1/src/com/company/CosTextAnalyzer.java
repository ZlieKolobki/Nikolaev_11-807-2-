package com.company;

import java.util.ArrayList;
import java.util.List;

public class CosTextAnalyzer extends TextAnalyzer {
    @Override
    public double analyze(TextProvider tp1, TextProvider tp2) {
        List<String> unique = tokenizeUnique(tp1.getText() + " " + tp2.getText());
        List<String> list1 = tokenize(tp1.getText());
        List<String> list2 = tokenize(tp2.getText());
        return cosSimilarity(list1, list2, unique );
    }

    private List<String> tokenize(String text) {
        text = text.replace(",", "");
        String[] words = text.split(" ");
        List<String> WordsList = new ArrayList<>();
        for (String word : words) {
            word = word.toLowerCase();
            WordsList.add(word);
        }
        return WordsList;
    }

    private double[] termFrequency(List<String> list, List<String> unique) {
        double[] count = new double[unique.size()];
        for (String word : list) {
            if (unique.contains(word)) {
                count[unique.indexOf(word)]++;
            }
        }
        double norm = 0;
        for (double i : count) {
            norm += i * i;
        }
        norm = Math.sqrt(norm);
        for (int i = 0; i < count.length; i++) {
            count[i] = count[i] / norm;
        }
        return count;
    }
    private double cosSimilarity(List<String> l1, List<String> l2, List<String> bag) {
        double[] c1 = termFrequency(l1, bag);
        double[] c2 = termFrequency(l2, bag);
        double similatiry = 0;
        for (int i = 0; i < c1.length; i++) {
            similatiry += c1[i] * c2[i];
        }
        return similatiry;

    }
}
