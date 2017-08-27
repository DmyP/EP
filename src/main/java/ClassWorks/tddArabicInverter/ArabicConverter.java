package ClassWorks.tddArabicInverter;

public class ArabicConverter {
    private String resultString = "";
    private StringBuilder stringBuilder = new StringBuilder();

    public String convert(int integerToConvert) {
        if (integerToConvert < 1) {
          return resultString;
        }
        else if (integerToConvert < 4) {
            iParser(integerToConvert);
        }
        else if (integerToConvert < 9){
            if (integerToConvert == 4){
                appendI();
            }
            appendV();
            integerToConvert = integerToConvert - 5;
            convert(integerToConvert);
        }
        else if (integerToConvert == 9){
                appendI();

            appendX();
            integerToConvert = integerToConvert - 10;
            convert(integerToConvert);
        }
        else if (integerToConvert < 40)  {
            appendX();
            integerToConvert = integerToConvert - 10;
            convert(integerToConvert);
        }
        return stringBuilder.toString();
    }

    private void iParser(int integerToConvert) {
        for (int i = 0; i < integerToConvert; i++) {
            appendI();
        }
    }

    private void appendI() {
        stringBuilder.append("I");
    }

    private void appendV() {
        stringBuilder.append("V");
    }

    private void appendX() {
        stringBuilder.append("X");
    }
}
