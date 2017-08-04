package HW.HW11;

import java.io.File;
import java.util.List;

class CharsToUpperCase {
    void fileToUpperCase(File file) {
        List<String> stringList = FileUtils.readFileToStringList(file);
        StringBuilder stringBuilder = new StringBuilder();
        for (String s: stringList) {
            stringBuilder.append(stringToUpperCase(s));
        }
    }

    private String stringToUpperCase(String s) {
        return null;
    }
}
