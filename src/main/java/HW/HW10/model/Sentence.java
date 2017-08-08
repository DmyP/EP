package HW.HW10.model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.toList;

public class Sentence implements Comparable<Sentence>{
    private String sentenceSting;
    private List<Word> wordList;

    public Sentence(String sentenceSting) {
        this.sentenceSting = sentenceSting;
        this.wordList = sentenceStingToWordList();
    }

    private List<Word> sentenceStingToWordList() {
        List<Word> words = new ArrayList<>();
        Matcher matcher = Pattern.compile("[a-zA-z']+").matcher(sentenceSting);
        while (matcher.find())
            words.add(new Word(matcher.group()));
        return words;
    }

    public String getSentenceSting() {
        return sentenceSting;
    }

    public void setSentenceSting(String sentenceSting) {
        this.sentenceSting = sentenceSting;
    }

    public List<String> getWordStringList() {
        return wordList.stream().map(word -> word.getWord().toLowerCase()).collect(toList());
    }

    public void setWordList(List<Word> wordList) {
        this.wordList = wordList;
    }

    public List<Word> getWordList() {
        return wordList;
    }

    public boolean isQuestion() {
        return this.sentenceSting.trim().charAt(sentenceSting.length()-1) == '?';
    }

    @Override
    public int compareTo(Sentence o) {
        return Integer.compare(wordList.size(), o.wordList.size());
    }

    @Override
    public String toString() {
        return sentenceSting;
    }
}
