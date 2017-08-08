package HW.HW10.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.BreakIterator;
import java.util.*;

public class Book {
    private String text;
    private List<Sentence> sentencesList;

    public Book(File file) {
        this.text = fileToString(file);
        this.sentencesList = textToSentencesList();
    }

    private String fileToString(File file){
        StringBuilder stringBuilder = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            for(String line; (line = br.readLine()) != null; ) {
                line = line.replaceAll("\\s+", " ");
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    private List<Sentence> textToSentencesList() {
        List<Sentence> sentenceList = new ArrayList<>();
        BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);
        iterator.setText(text);
        int start = iterator.first();
        for (int end = iterator.next();
             end != BreakIterator.DONE;
             start = end, end = iterator.next()) {
            sentenceList.add(new Sentence(text.substring(start, end).trim()));
        }
        return sentenceList;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Sentence> getSentencesList() {
        return new ArrayList<>(sentencesList);
    }

    public void setSentencesList(List<Sentence> sentencesList) {
        this.sentencesList = sentencesList;
    }
}
