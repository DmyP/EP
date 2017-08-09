package HW.HW10;

import HW.HW10.controller.BookController;
import HW.HW10.model.Book;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        //File file = new File("c:\\\\java\\\\ep\\\\src\\\\main\\\\java\\\\HW\\\\HW10\\\\source\\\\Thinking In Java short.txt");
        File file = new File("/Users/inna/IdeaProjects/EP/src/main/java/HW/HW10/source/Thinking In Java short.txt");
        BookController bookController = new BookController(new Book(file));

        //Task 1
        bookController.maxNumberSentencesWithDuplicateWords();

        //Task 2
        bookController.sentenceSort();

        //Task 3
        bookController.uniqueWord();

        //Task 4
        bookController.questionSentencesWords(4);

        //Task 5
        bookController.changeFirstLastWords();

        //Task 6
        bookController.wordsInAlphabeticOrder();

        //Task 7
        bookController.vowelRelationSort();

        //Task 8
        bookController.secondConsonantSort();

        //Task 9
        bookController.letterQuantitySort('a');

        //Task 10
        bookController.wordsFrequency();

        //Task 11
        bookController.removeSubstring('a', 'a');

        //Task 12
        bookController.removeWordFromText(4);

    }
}
