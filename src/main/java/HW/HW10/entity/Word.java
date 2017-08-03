package HW.HW10.entity;

import java.util.*;

public class Word {
    private List<String> wordList = new ArrayList<>();

    public Word(Sentence sentence) {
        this.wordList = sentencesToWords(sentence.getSentences());
    }

    private List<String> sentencesToWords (List<String> sentenceList) {
        List<String> wordsList = new ArrayList<>();
        for (int i = 0; i < sentenceList.size(); i++) {
            Collections.addAll(wordsList, sentenceList.get(i).split("\\p{Punct}| "));
        }
        wordsList.removeAll(Arrays.asList("", null));
        return wordsList;
    }
}
