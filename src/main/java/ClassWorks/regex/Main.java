package ClassWorks.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("a{1,3}y");
        Matcher m1 = p1.matcher("aaay");

        System.out.println(m1.matches());

        String regex = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*";
        String s = "wewewew@google.com";

        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(s);

        System.out.println(m2.matches());

        //pattern split

    }
}
