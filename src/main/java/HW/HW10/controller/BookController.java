package HW.HW10.controller;

import HW.HW10.model.Book;
import HW.HW10.model.Sentence;
import HW.HW10.model.Word;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class BookController {
    private Book book;

    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_WHITE = "\u001B[37m";

    public BookController(Book book) {
        this.book = book;
    }

    //Task 1
    public void maxNumberSentencesWithDuplicateWords() {
        System.out.println("\nTask 1 - Counting Max sentences with duplicates");
        int maxNum = 0, currentNum = 0;
        int length = book.getSentencesList().size();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                HashSet<String> wordsSet = new HashSet<>(book.getSentencesList().get(i).getWordStringList());
                wordsSet.retainAll(new HashSet<>(book.getSentencesList().get(j).getWordStringList()));
                if (wordsSet.size() > 0) {
                    currentNum++;
                }
            }
            maxNum = maxNum < currentNum ? currentNum : maxNum;
            currentNum = 0;
        }
        System.out.println("Sentences with duplicate words count - " + maxNum);
    }

    //Task 2
    public void sentenceSort(){
        System.out.println("\nTask 2 - Sorting sentences by words count");
        List<Sentence> sentenceList = book.getSentencesList();
        Collections.sort(sentenceList);
        System.out.println(sentenceList);
    }

    //Task 3
    public void uniqueWord(){
        System.out.println("\nTask 3 - Find unique word in first sentence");
        List<Sentence> sentenceList = book.getSentencesList();
        String resultWord = null;
        for (String word : sentenceList.get(0).getWordStringList()) {
            resultWord = word;
            for (int i = 1; i < sentenceList.size(); i++) {
                if (sentenceList.get(i).getWordStringList().contains(word.toLowerCase())){
                    resultWord = null;
                }
            }
            if (resultWord != null) {
                break;
            }
        }
        System.out.println(resultWord != null ? "Unique word is - " + resultWord : "Unique word not found");
    }

    //Task 4
    public void questionSentencesWords(int length) {
        System.out.println("\nTask 4 - Find words of desired length in question sentences");
        List<Sentence> sentenceList = book.getSentencesList();
        HashSet<String> wordsSet = new HashSet<>();
        for (Sentence sentence : sentenceList) {
            if (sentence.isQuestion()) {
                for (String word : sentence.getWordStringList()) {
                    if (word.length() == length) {
                        wordsSet.add(word);
                    }
                }
            }
        }
        System.out.println(!wordsSet.isEmpty() ? "Words desired length are - " + wordsSet : "There is no words such length");
    }

    //Task 5
    public void changeFirstLastWords() {
        System.out.println("\nTask 5 - Change first and last words");
        List<Sentence> sentenceList = book.getSentencesList();
        for (Sentence sentence : sentenceList) {
            List <Word> wordList = sentence.getWordList();
            char lastChar = sentence.getSentenceSting().charAt(sentence.getSentenceSting().length() - 1);
            int lastElement = wordList.size() - 1;

            //Changing wordsList in sentence
            Word temp = wordList.get(0);
            wordList.set(0, wordList.get(lastElement));
            wordList.set(lastElement, temp);

            //Changing sentenceSting in sentence
            StringBuilder stringBuilder = new StringBuilder();
            for (Word word : wordList){
                stringBuilder.append(word.getWord()).append(" ");
            }
            sentence.setSentenceSting(stringBuilder.toString().trim() + lastChar);
        }
        System.out.println(sentenceList);
    }

    //Task 6
    public void wordsInAlphabeticOrder() {
        TreeSet<String> wordsSet = new TreeSet<>();
        List<Sentence> sentenceList = book.getSentencesList();
        sentenceList.forEach(sentence -> wordsSet.addAll(sentence.getWordStringList()));
        char currentChar = ' ';
        for (String word : wordsSet) {
            if (word.charAt(0) != currentChar) {
                System.out.println(ANSI_RED + word);
                currentChar = word.charAt(0);
            } else {
                System.out.println(ANSI_WHITE + word);
            }
        }
    }
}
