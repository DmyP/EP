package HW.HW10.entity;

import java.util.*;

public class Punctuation {
    private Set<String> punctuationSet = new HashSet<>();

    public Punctuation(Text text) {
        this.punctuationSet = textToPunctuation(text.getTextOfBook());
    }

    private Set<String> textToPunctuation (String text) {
        Set<String> punctuationSet = new HashSet<>();
        Collections.addAll(punctuationSet, text.replaceAll("[a-zA-Z0-9]", "").split("(?!^)"));
        return punctuationSet;
    }
}
