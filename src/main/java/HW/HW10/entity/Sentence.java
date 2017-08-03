package HW.HW10.entity;

import ClassWorks.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sentence {
    private List<String> sentences = new ArrayList<>();


    public Sentence(Text text) {
        this.sentences = stringsToSentences(text.getTextOfBook());
    }

    public Sentence(List<String> sentences) {
        this.sentences = sentences;
    }

    public void setSentences(List<String> sentences) {
        this.sentences = sentences;
    }

    public void setSentences(String text) {
        this.sentences = stringsToSentences(text);
    }
    public List<String> getSentences() {
        return sentences;
    }

    private List<String> stringsToSentences(String text) {
        List<String> sentences = new ArrayList<>();
        Collections.addAll(sentences, text.split("(?<=[a-z])\\.\\.\\. |\\. |! |\\? \\s+"));
        /*BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);
        iterator.setText(strings);
        int start = iterator.first();
        for (int end = iterator.next();
             end != BreakIterator.DONE;
             start = end, end = iterator.next()) {
            sentences.add(strings.substring(start,end).trim());
        }*/
        sentences.removeAll(Arrays.asList("", null));
        return sentences;
    }
}
