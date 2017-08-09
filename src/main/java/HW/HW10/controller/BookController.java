package HW.HW10.controller;

import HW.HW10.model.Book;
import HW.HW10.model.Sentence;
import HW.HW10.model.Word;
import sun.reflect.generics.tree.Tree;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class BookController {
    private Book book;

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
        System.out.println("\nTask 6 - Words in alphabetic order");
        TreeSet<String> wordsSet = book.getWordSet();
        char currentChar = ' ';
        for (String word : wordsSet) {
            if (word.charAt(0) != currentChar) {
                System.out.println("\u001B[31m" + word);
                currentChar = word.charAt(0);
            } else {
                System.out.println("\u001B[37m" + word);
            }
        }
    }

    //Task 7
    public void vowelRelationSort() {
        System.out.println("\nTask 7 - Words in vowel relation sort");
        List<String> wordsList = new ArrayList<>(book.getWordSet());
        wordsList.sort((o1, o2) -> Float.compare(vowelRelation(o2), vowelRelation(o1)));
        System.out.println(wordsList);
    }

    //Task 7 Util method
    private float vowelRelation(String word){
        int vowelCount = 0;
        Matcher vowelMatcher = Pattern.compile("[aeiou]").matcher(word.toLowerCase());
        while (vowelMatcher.find()){
            vowelCount++;
        }
        return (float) vowelCount / word.length();
    }

    //Task 8
    public void secondConsonantSort() {
        System.out.println("\nTask 8 - Words with first vowel, sort by first consonant");
        List<String> wordsList = book.getWordSet().stream().filter(s -> isVowel(s.charAt(0)) & (s.length() > 1)).collect(Collectors.toList());
        wordsList.sort((o1, o2) -> Character.compare(o1.charAt(findConsonant(o1)), o2.charAt(findConsonant(o2))));
        System.out.println(wordsList);
    }

    //Task 8 Util method
    private boolean isVowel(char c){
        return  (c == 'a') | (c == 'e') | (c == 'i') | (c == 'o') | (c == 'u');
    }

    //Task 8 Util method
    private int findConsonant(String word){
        Matcher consonantMatcher = Pattern.compile("[a-z&&[^aeiou]]").matcher(word.toLowerCase());
        if (consonantMatcher.find()){
            return consonantMatcher.start();
        }
        return 0;
    }

    //Task 9
    public void letterQuantitySort(char c) {
        System.out.println("\nTask 9 - Sort words by desired char quantity");
        List<String> wordsList = new ArrayList<>(book.getWordSet());
        wordsList.sort((o1, o2) -> {
            int result = (int) (o2.chars().filter(ch -> ch == c).count() - o1.chars().filter(ch -> ch == c).count());
            return result == 0 ? o1.compareTo(o2) : result;
        });
        System.out.println(wordsList);
    }

    //Task 10
    public void wordsFrequency() {
        System.out.println("\nTask 10 - Determine most frequent words");
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        book.getWordSet().forEach(word -> frequencyMap.put(word, book.wordQuantity(word)));
        Map<String, Integer> sortedFrequencyMap = frequencyMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println(sortedFrequencyMap);
    }

    //Task 11
    public void removeSubstring(char beginChar, char endChar) {
        System.out.println("\nTask 11 - Remove longest substring from every sentence");

        for (Sentence sentence : book.getSentencesList()) {
            System.out.println(sentence.getSentenceSting());
            String currentString = sentence.getSentenceSting();
            if (currentString.indexOf(beginChar) != -1 & currentString.indexOf(beginChar) != -1) {
                currentString = currentString.substring(0, currentString.indexOf(beginChar)) + currentString.substring(currentString.lastIndexOf(endChar) + 1, currentString.length());
            }
            System.out.println(currentString);
        }
    }

    //Task 12
    public void removeWordFromText(int lengthToRemove) {
        System.out.println("\nTask 12 - Remove all words from text vowel begin words with desired length");
        String text = "Thinking in rere Java! Fourth Edition Java.";
        Pattern pattern = Pattern.compile("(?<![\\p{L}\\p{N}-])[^aeiouAEIOU][\\p{L}\\p{N}-]{3}(?![\\p{L}\\p{N}-])");
        Matcher matcher = pattern.matcher(text);
        String resultString = null;
        while (matcher.find()) {
            if (!isVowel(text.charAt(matcher.start()))) {
                resultString = text.replace(matcher.group(), "");
                //matcher.reset();
            }
        }
        System.out.println(resultString);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookController that = (BookController) o;

        return book != null ? book.equals(that.book) : that.book == null;
    }

    @Override
    public int hashCode() {
        return book != null ? book.hashCode() : 0;
    }
}
