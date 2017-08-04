package HW.HW11;

import java.io.File;
import java.util.List;

class StringsReverser {

    void reverseByStrings(File file, File file2) {
        List<String> sourceList = FileUtils.readFileToStringList(file);
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : sourceList) {
            stringBuilder.append(new StringBuilder(s).reverse() + "\n");
        }
        FileUtils.writeFile(file2, stringBuilder.toString());
    }
}
