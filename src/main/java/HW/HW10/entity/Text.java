package HW.HW10.entity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Text {
    private String textOfBook;

    public Text(File file) {
        this.textOfBook = fileToStrings(file);
    }

    private String fileToStrings(File file){
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

    public String getTextOfBook() {
        return textOfBook;
    }

    public void setTextOfBook(String textOfBook) {
        this.textOfBook = textOfBook;
    }
}
