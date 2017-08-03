package HW.HW10.entity;

import java.io.File;

public class Book {
    private Text text;
    private Sentence sentence;
    private Word word;
    private Punctuation punctuation;

    public Book(File file) {
        this.text = new Text(file);
        this.sentence = new Sentence(text);
        this.word = new Word(sentence);
        this.punctuation = new Punctuation(text);
    }







}
