package ClassWorks.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        String email1 = "ываываыукцhello@ukr.netава4234234";
        String email2 = "ываываыукцhello@ukr.net4234234";
        String email3 = "ываываыукцhelloukr.net4234234";
        String email4 = "323hello@ukr.net4234234";
        String[] strings = {email1, email2, email3, email4};

        String regex = "([а-яА-Я]*)(([a-zA-Z0-9]+)@([a-zA-Z0-9]+\\.)([a-zA-Z]+)(\\.[a-zA-Z]+)*)([а-яА-Я0-9]*)";

        Pattern p2 = Pattern.compile(regex);
        Matcher matcher;

        for (String string : strings) {
            matcher = p2.matcher(string);
            if (matcher.matches()){
                System.out.println(matcher.group(2));
            }

        }


    }
}
