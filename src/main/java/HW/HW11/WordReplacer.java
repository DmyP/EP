package HW.HW11;

import java.io.File;

class WordReplacer {

    void replaceWords(File sourceFile, File destinationFile, String sourceWord, String destinationWord){
        String readedString = FileUtils.readFileToString(sourceFile);

        String resultString = readedString.replaceAll(sourceWord, destinationWord);

        FileUtils.writeFile(destinationFile, resultString);
    }
}
