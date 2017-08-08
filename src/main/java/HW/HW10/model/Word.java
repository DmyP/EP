package HW.HW10.model;

public class Word implements Comparable<Word>{
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public int compareTo(Word o) {
        return word.compareTo(o.word);
    }
}
