package HW.HW11;

import java.io.File;

class WordReplacer {

    void replaceWords(File file, String sourceWord, String destinationWord){
        String readedString = FileUtils.readFileToString(file);

        String resultString = readedString.replaceAll(sourceWord, destinationWord);

        FileUtils.writeFile(file, resultString);
    }
}
